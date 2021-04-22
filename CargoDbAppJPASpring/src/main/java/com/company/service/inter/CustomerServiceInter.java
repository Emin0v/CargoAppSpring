package com.company.service.inter;

import com.company.model.Customer;

import java.util.Optional;

public interface CustomerServiceInter {

    public boolean updateCustomer(Customer customer);

    public Optional<Customer> findByEmail(String email);
}
