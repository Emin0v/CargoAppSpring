package com.company.dto;

import com.company.model.Customer;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RegisterForm extends LoginForm {

    @NotNull(message = "Adınızı daxil edin")
    @Size(min = 2,max = 30)
    private String customerName;
    @NotNull
    @Size(min = 2,max = 30)
    private String customerSurname;
    @NotNull(message = "Telefon nömrəsini daxil edin")
    private String phone;
    @NotNull
    private String address;
    @NotNull
    private String city;
    @NotNull
    private String country;
    @NotNull
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
