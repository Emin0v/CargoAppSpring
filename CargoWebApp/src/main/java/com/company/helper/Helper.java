package com.company.helper;

import at.favre.lib.crypto.bcrypt.BCrypt;
import com.company.form.CustomerForm;
import com.company.model.Customer;

public class Helper {

    public static BCrypt.Hasher crypt = BCrypt.withDefaults();

    public static Customer mapToEntity(CustomerForm form, Customer customer) {

        customer.setCustomerNumber(form.getCustomerNumber());
        customer.setCustomerName(form.getCustomerName());
        customer.setCustomerSurname(form.getCustomerSurname());
        customer.setPhone(form.getPhone());
        customer.setPostalCode(form.getPostalCode());
        customer.setAddress(form.getAddress());
        customer.setCity(form.getCity());
        customer.setCountry(form.getCountry());
        customer.setEmail(form.getEmail());
        customer.setPassword(crypt.hashToString(4, form.getPassword().toCharArray()));

        return customer;
    }


}
