package com.company.service.inter;

import com.company.dto.ProductDTO;
import com.company.model.Order1;
import com.company.model.Product;

public interface ProductServiceInter {

    public boolean addProduct(Product product);

    public ProductDTO getProduct(int productNumber);
}
