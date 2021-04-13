package com.company.service.impl;

import com.company.dao.ProductlineRepository;
import com.company.model.Productline;
import com.company.service.inter.ProductlineServiceInter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ProductlineServiceImpl implements ProductlineServiceInter {

    @Autowired
    private ProductlineRepository repository;

    @Override
    public Productline add(Productline productline) {
        return repository.save(productline);
    }

    @Override
    public Productline getProductline(String productline) {
        return repository.findById(productline).get();
    }
}
