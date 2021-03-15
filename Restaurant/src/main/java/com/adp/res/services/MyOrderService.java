package com.adp.res.services;

import java.util.List;

import com.adp.res.commands.MyOrderForm;
import com.adp.res.domain.MyOrder;


public interface MyOrderService {
		
    List<MyOrder> listAll();

    MyOrder getById(Long id);

    MyOrder saveOrUpdate(MyOrder myOrder);

    void delete(Long id);

    MyOrder saveOrUpdateOrderForm(MyOrderForm myOrderForm);
    
}
