package com.company.form;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor
public class RegisterForm {

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


}
