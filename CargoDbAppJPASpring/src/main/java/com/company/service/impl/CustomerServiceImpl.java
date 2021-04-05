package com.company.service.impl;

import com.company.dao.CustomerRepository;
import com.company.model.Customer;
import com.company.service.inter.CustomerServiceInter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class CustomerServiceImpl implements CustomerServiceInter {

    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public boolean updateCustomer(Customer customer) {
        return customerRepository.updateCustomer(customer);
    }
}