package com.company.dto;

import com.company.model.Orderdetail;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderdetailDTO {

    private Integer orderNumber;
    private int count;
    private String color;
    private String size;
    private BigDecimal price;
    private ProductDTO productCode;

    public OrderdetailDTO(Orderdetail orderdetail){
        this.orderNumber = orderdetail.getOrderNumber();
        this.count = orderdetail.getCount();
        this.color = orderdetail.getColor();
        this.size = orderdetail.getSize();
        this.price = orderdetail.getPrice();
        this.productCode = new ProductDTO(orderdetail.getProductCode());
    }
}
