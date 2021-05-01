package com.company.service.inter;

import com.company.dto.OrderForm;
import com.company.model.Order1;

public interface OrderServiceInter {

    public Order1 add(Order1 order);

    public Order1 getOrder(int orderNumber);

    public boolean order(OrderForm form);
}
