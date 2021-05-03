package com.company.service.impl;

import com.company.dao.OrderdetailRepository;
import com.company.dto.OrderdetailDTO;
import com.company.model.Orderdetail;
import com.company.service.inter.OrderdetailServiceInter;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class OrderdetailServiceImpl implements OrderdetailServiceInter {

    @Autowired
    private OrderdetailRepository repository;

    @Autowired
    private ModelMapper modelMapper;


    @Override
    public void addOrderdetail(Orderdetail orderdetail) {
        repository.save(orderdetail);
    }

    @Override
    public OrderdetailDTO getOrderdetail(int orderNumber) {
         Orderdetail orderdetail = repository.findById(orderNumber).get();

        return modelMapper.map(orderdetail,OrderdetailDTO.class);

    }
}
