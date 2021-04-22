package com.company.dto;

import com.company.model.Productline;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductlineDTO {

    private String productline;
    private String textDescription;
    private String htmlDescription;
    private String image;

    public ProductlineDTO(Productline productline){
        this.productline = productline.getProductline();
        this.textDescription = productline.getTextDescription();
        this.htmlDescription = productline.getHtmlDescription();
        this.image = productline.getImage();
    }

}
