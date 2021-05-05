package com.company.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderForm {

    private Integer customerNumber;
    private String comments;
    private Date orderDate;
    private String status;

    private String color;
    private String size;
    private Integer count;
    private String price;

    private String totalPrice;
    private String link;
    private String image;

}
