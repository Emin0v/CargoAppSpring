package com.company.service.impl;

import com.company.dao.ProductRepository;
import com.company.model.Product;
import com.company.service.inter.ProductServiceInter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ProductServiceImpl implements ProductServiceInter {

    @Autowired
    private ProductRepository repository;

    @Override
    public Product addProduct(Product product) {
         return repository.save(product);
    }

    @Override
    public Product getProduct(int productNumber) {
        return repository.findById(productNumber).get();
    }
}
