package com.adp.res.repositories;

import org.springframework.data.repository.CrudRepository;

import com.adp.res.domain.MyOrder;

public interface MyOrderRepository extends CrudRepository<MyOrder, Long> {
}
