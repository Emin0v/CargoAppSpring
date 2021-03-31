package com.company.form;

import com.company.model.Customer;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor
public class CustomerForm {

    private Integer customerNumber;
    private String customerName;
    private String customerSurname;
    private String phone;
    private String email;
    private String address;
    private String city;
    private String country;
    private String postalCode;
    private String password;
    private String confirmPassword;

    public CustomerForm(Customer customer){
        this.customerNumber = customer.getCustomerNumber();
        this.customerName = customer.getCustomerName();
        this.customerSurname = customer.getCustomerSurname();
        this.phone = customer.getPhone();
        this.email = customer.getEmail();
        this.address = customer.getAddress();
        this.city = customer.getCity();
        this.country = customer.getCountry();
        this.postalCode = customer.getPostalCode();
    }

}
