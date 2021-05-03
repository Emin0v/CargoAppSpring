package com.company.service.inter;

import com.company.dto.OrderdetailDTO;
import com.company.model.Orderdetail;

public interface OrderdetailServiceInter {

    public void addOrderdetail(Orderdetail orderdetail);

    public OrderdetailDTO getOrderdetail(int orderNumber);
}
