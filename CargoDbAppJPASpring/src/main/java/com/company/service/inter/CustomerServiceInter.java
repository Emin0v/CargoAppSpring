package com.company.service.inter;

import com.company.model.Customer;

public interface CustomerServiceInter {

    public boolean updateCustomer(Customer customer);

    public Customer findByEmail(String email);
}
