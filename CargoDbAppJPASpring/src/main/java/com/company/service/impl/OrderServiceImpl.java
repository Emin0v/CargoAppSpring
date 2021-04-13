package com.company.service.impl;

import com.company.dao.OrderRepository;
import com.company.model.Order1;
import com.company.service.inter.OrderServiceInter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class OrderServiceImpl implements OrderServiceInter {

    @Autowired
    private OrderRepository orderRepository;

    public Order1 add(Order1 order){
        return orderRepository.save(order);
    }

    @Override
    public Order1 getOrder(int orderNumber) {
       return orderRepository.findById(orderNumber).get();
    }


}
