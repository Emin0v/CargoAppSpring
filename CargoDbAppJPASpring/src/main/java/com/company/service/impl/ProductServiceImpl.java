package com.company.service.impl;

import com.company.dao.ProductRepository;
import com.company.dto.ProductDTO;
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
    public boolean addProduct(Product product) {
        repository.save(product);
        return true;
    }

    @Override
    public ProductDTO getProduct(int productNumber) {
        Product product = repository.findById(productNumber).get();
        return new ProductDTO(product);
    }
}
