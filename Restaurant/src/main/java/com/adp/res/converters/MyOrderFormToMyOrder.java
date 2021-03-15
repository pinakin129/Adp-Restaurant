package com.adp.res.converters;

import java.util.Arrays;
import java.util.stream.Collectors;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import com.adp.res.commands.MyOrderForm;
import com.adp.res.domain.Appetizer;
import com.adp.res.domain.Beverages;
import com.adp.res.domain.Entree;
import com.adp.res.domain.MyOrder;

@Component
public class MyOrderFormToMyOrder implements Converter<MyOrderForm, MyOrder> {

    @Override
    public MyOrder convert(MyOrderForm myOrderForm) {

    	MyOrder myOrder = new MyOrder();
        if (myOrderForm.getId() != null  && !StringUtils.isEmpty(myOrderForm.getId())) {
        	myOrder.setId(new Long(myOrderForm.getId()));
        	System.out.println(" myOrder.getId(): "+myOrder.getId());
        }
        
        myOrder.setCustomerName(myOrderForm.getCustomerName());
        myOrder.setCustomerPhone(myOrderForm.getCustomerPhone());
                
        myOrder.setAppetizers(Arrays.stream(myOrderForm.getAppId()).map(e -> new Appetizer(e)).collect(Collectors.toSet()));
        myOrder.setEntrees(Arrays.stream(myOrderForm.getEntrId()).map(e -> new Entree(e)).collect(Collectors.toSet()));
        myOrder.setBeverages(Arrays.stream(myOrderForm.getBevId()).map(e -> new Beverages(e)).collect(Collectors.toSet()));
                
        return myOrder;
    }
}
