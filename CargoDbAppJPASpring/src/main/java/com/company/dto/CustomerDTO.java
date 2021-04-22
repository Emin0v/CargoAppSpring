package com.company.dto;

import com.company.model.Customer;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CustomerDTO {

    private Integer customerNumber;
    private String customerName;
    private String customerSurname;
    private String phone;
    private String address;
    private String city;
    private String postalCode;
    private String country;
    private BigDecimal creditLimit;
    private String email;
    private String password;
    private PaymentDTO payment;
    private EmployeeDTO salesRepEmployeeNumber;
    private List<OrderDTO> orderList;
    private List<RoleDTO> roles;

    public CustomerDTO(Customer customer){
        this.customerNumber = customer.getCustomerNumber();
        this.customerName = customer.getCustomerName();
        this.customerSurname = customer.getCustomerSurname();
        this.phone = customer.getPhone();
        this.address = customer.getAddress();
        this.city = customer.getCity();
        this.postalCode = customer.getPostalCode();
        this.country = customer.getCountry();
        this.email = customer.getEmail();
        this.payment = new PaymentDTO(customer.getPayment());
        this.salesRepEmployeeNumber = new EmployeeDTO(customer.getSalesRepEmployeeNumber());
//        this.orderList =
//        this.roles =

    }


}
