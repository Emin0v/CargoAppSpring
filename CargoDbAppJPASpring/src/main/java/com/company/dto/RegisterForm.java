package com.company.dto;

import com.company.model.Customer;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RegisterForm extends LoginForm {

    @NotBlank
    @Size(min = 2)
    private String customerName;
    @NotBlank
    @Size(min = 2)
    private String customerSurname;
    @NotBlank
    private String phone;
    @NotBlank
    private String address;
    @NotBlank
    private String city;
    @NotBlank
    private String country;
    @NotBlank
    private String postalCode;


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
        customer.setPassword(getPassword());

        return customer;
    }

}
