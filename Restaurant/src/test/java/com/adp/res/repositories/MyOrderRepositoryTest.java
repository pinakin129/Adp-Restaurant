package com.adp.res.repositories;

import org.junit.Assert;


import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.adp.res.domain.MyOrder;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class MyOrderRepositoryTest {

    
    private static final String NAME = "PINAKIN";
    private static final String PHONE = "1236547895";

    @Autowired
    private MyOrderRepository myOrderRepository;

    @Before
    public void setUp() throws Exception {

    }

    @Test
    public void testPersistence() {
        //given
        MyOrder ordr = new MyOrder();
        ordr.setCustomerName(NAME);
        ordr.setCustomerPhone(PHONE);
        
        //when
        myOrderRepository.save(ordr);

        //then
        Assert.assertNotNull(ordr.getId());
        MyOrder newordr = myOrderRepository.findOne(ordr.getId());
        Assert.assertEquals((Long) 1L, newordr.getId());        
        Assert.assertEquals(NAME, newordr.getCustomerName());
        Assert.assertEquals(PHONE, newordr.getCustomerPhone());
    }
}