package com.company.service.inter;

import com.company.dto.RegisterForm;
import com.company.model.Customer;

import java.util.Optional;

public interface CustomerServiceInter {

    public Optional<Customer> findById(Integer id);

    public boolean updateCustomer(Customer customer);

    public Optional<Customer> findByEmail(String email);

    public void save(Customer customer);

    public void register(RegisterForm registerForm);
}
