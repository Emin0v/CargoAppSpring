package com.company.service.impl;

import com.company.dao.ProductlineRepository;
import com.company.dto.ProductlineDTO;
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
    public boolean add(Productline productline) {
        repository.save(productline);
        return true;
    }

    @Override
    public ProductlineDTO getProductline(String productline) {
        Productline productlineDb = repository.findById(productline).get();
        return new ProductlineDTO(productlineDb);
    }
}
