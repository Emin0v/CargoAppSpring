package com.company.service.inter;

import com.company.dto.OrderDTO;
import com.company.dto.OrderForm;
import com.company.model.Order1;

public interface OrderServiceInter {

     boolean add(Order1 order);

     OrderDTO getOrder(int orderNumber);

     boolean order(OrderForm form);
}
