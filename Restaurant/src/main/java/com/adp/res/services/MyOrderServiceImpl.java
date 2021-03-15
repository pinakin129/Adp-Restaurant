package com.adp.res.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.adp.res.commands.MyOrderForm;
import com.adp.res.converters.MyOrderFormToMyOrder;

import com.adp.res.domain.MyOrder;
import com.adp.res.repositories.MyOrderRepository;

import java.util.ArrayList;
import java.util.List;

@Service
public class MyOrderServiceImpl implements MyOrderService {

    private MyOrderRepository myOrderRepository;
    private MyOrderFormToMyOrder myOrderFormToMyOrder;

    @Autowired
    public MyOrderServiceImpl(MyOrderRepository myOrderRepository, MyOrderFormToMyOrder myOrderFormToMyOrder) {
        this.myOrderRepository = myOrderRepository;
        this.myOrderFormToMyOrder = myOrderFormToMyOrder;
    }
    
    @Override
    public List<MyOrder> listAll() {
        List<MyOrder> myOrders = new ArrayList<>();
        myOrderRepository.findAll().forEach(myOrders::add); 
        return myOrders;
    }

    @Override
    public MyOrder getById(Long id) {
        return myOrderRepository.findOne(id);
     }

    @Override
    public MyOrder saveOrUpdate(MyOrder myOrder) {
    	myOrderRepository.save(myOrder);
        return myOrder;
    }

    @Override
    public void delete(Long id) {
    	myOrderRepository.delete(id);
    }

    @Override
    public MyOrder saveOrUpdateOrderForm(MyOrderForm myOrderForm) {
    	
    	MyOrder savedProduct = saveOrUpdate(myOrderFormToMyOrder.convert(myOrderForm));

        System.out.println("Saved Product Id: " + savedProduct.getId());
        return savedProduct;
    }
    
}
