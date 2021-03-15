package com.adp.res.converters;

import com.adp.res.domain.MyOrder;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;
import com.adp.res.commands.MyOrderForm;

@Component
public class MyOrderToMyOrderForm implements Converter<MyOrder, MyOrderForm> {
    @Override
    public MyOrderForm convert(MyOrder myOrder) {
    	MyOrderForm ordrForm = new MyOrderForm();
    	ordrForm.setId(myOrder.getId());
    	ordrForm.setCustomerName(myOrder.getCustomerName());
    	
    	ordrForm.setAppId(myOrder.getAppetizers().stream().map(mapper -> mapper.getAppId()).toArray(Long[]::new));
    	ordrForm.setEntrId(myOrder.getEntrees().stream().map(mapper -> mapper.getEntrId()).toArray(Long[]::new));
    	ordrForm.setBevId(myOrder.getBeverages().stream().map(mapper -> mapper.getBevId()).toArray(Long[]::new));
    	        
        return ordrForm;
    }
}
