package com.company.dto;

import com.company.model.Product;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductDTO {

    private Integer productCode;
    private String productName;
    private String productVendor;
    private String productDescription;
    private BigDecimal buyPrice;
    private byte[] image;

    public ProductDTO(Product product){
        this.productCode = product.getProductCode();
        this.productName = product.getProductName();
        this.productVendor = product.getProductVendor();
        this.productDescription = product.getProductDescription();
        this.buyPrice = product.getBuyPrice();
        this.image = product.getImage();
    }

}
