package com.company.dto;

import com.company.model.Customer;
import com.company.model.Order1;
import com.company.model.Role;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.ArrayList;
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

    public CustomerDTO(Customer customer) {
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

        List<OrderDTO> orderList = new ArrayList<>();
        List<Order1> order1List = customer.getOrder1List();

        for (int i = 0; i < order1List.size(); i++) {
            Order1 order1 = order1List.get(i);
            orderList.add(new OrderDTO(order1));
        }
        this.orderList = orderList;

        List<RoleDTO> roleDTOS = new ArrayList<>();
        List<Role> roleList = customer.getRoles();

        for (int i = 0; i < roleList.size(); i++) {
            Role role = roleList.get(i);
            roleDTOS.add(new RoleDTO(role));
        }
        this.roles = roleDTOS;

    }




}
