package com.company.service.inter;

import com.company.dto.ProductlineDTO;
import com.company.model.Productline;

public interface ProductlineServiceInter {

    public boolean add(Productline productline);

    public ProductlineDTO getProductline(String productline);
}
