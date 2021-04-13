package com.company.service.inter;

import com.company.model.Orderdetail;

public interface OrderdetailServiceInter {

    public void addOrderdetail(Orderdetail orderdetail);

    public Orderdetail getOrderdetail(int orderNumber);
}
