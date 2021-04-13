package com.company.service.inter;

import com.company.model.Order1;
import com.company.model.Product;

public interface ProductServiceInter {

    public Product addProduct(Product product);

    public Product getProduct(int productNumber);
}
