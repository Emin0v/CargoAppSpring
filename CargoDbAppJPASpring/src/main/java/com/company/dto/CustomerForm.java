package com.company.dto;

import com.company.model.Customer;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor
public class CustomerForm {

    private Integer customerNumber;
    @NotBlank
    @Size(min = 2)
    private String customerName;
    @NotBlank
    @Size(min = 2)
    private String customerSurname;
    @NotBlank
    private String phone;
    @NotBlank
    @Email
    private String email;
    @NotBlank
    private String address;
    @NotBlank
    private String city;
    @NotBlank
    private String country;
    @NotBlank
    private String postalCode;

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

    public Customer toCustomer(){
        Customer customer = new Customer();

        customer.setCustomerName(getCustomerName());
        customer.setCustomerSurname(getCustomerSurname());
        customer.setPhone(getPhone());
        customer.setPostalCode(getPostalCode());
        customer.setAddress(getAddress());
        customer.setCity(getCity());
        customer.setCountry(getCountry());
        customer.setEmail(getEmail());

        return customer;
    }

}
