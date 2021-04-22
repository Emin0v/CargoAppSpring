package com.company.dto;

import com.company.model.Order1;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderDTO {

    private Integer orderNumber;
    private Date orderDate;
    private Date requiredDate;
    private Date shippedDate;
    private String status;
    private String comments;
    private OrderdetailDTO orderdetailDTO;

    public OrderDTO(Order1 order){
        this.orderNumber = order.getOrderNumber();
        this.orderDate = order.getOrderDate();
        this.requiredDate = order.getRequiredDate();
        this.shippedDate = order.getShippedDate();
        this.status = order.getStatus();
        this.comments = order.getComments();
        this.orderdetailDTO = new OrderdetailDTO(order.getOrderdetail());
    }

}
