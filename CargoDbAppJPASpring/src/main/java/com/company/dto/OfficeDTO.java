package com.company.dto;

import com.company.model.Office;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OfficeDTO {

    private String officeCode;
    private String city;
    private String phone;
    private String address;
    private String state;
    private String country;
    private String postalCode;
    private String territory;

    public OfficeDTO(Office office){
        this.officeCode = office.getOfficeCode();
        this.city = office.getOfficeCode();
        this.phone = office.getOfficeCode();
        this.address = office.getOfficeCode();
        this.state = office.getOfficeCode();
        this.country = office.getOfficeCode();
        this.postalCode = office.getOfficeCode();
        this.territory = office.getOfficeCode();
    }
}
