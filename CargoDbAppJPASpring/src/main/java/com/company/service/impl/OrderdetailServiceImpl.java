package com.company.service.impl;

import com.company.dao.OrderdetailRepository;
import com.company.model.Orderdetail;
import com.company.service.inter.OrderdetailServiceInter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class OrderdetailServiceImpl implements OrderdetailServiceInter {

    @Autowired
    private OrderdetailRepository repository;


    @Override
    public void addOrderdetail(Orderdetail orderdetail) {
        repository.save(orderdetail);
    }

    @Override
    public Orderdetail getOrderdetail(int orderNumber) {
         return repository.findById(orderNumber).get();
    }
}
