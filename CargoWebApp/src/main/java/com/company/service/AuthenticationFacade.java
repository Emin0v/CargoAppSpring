package com.company.service;

import com.company.dao.CustomerRepository;
import com.company.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;


@Component
public class AuthenticationFacade implements IAuthenticationFacade {

    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public Authentication getAuthentication() {
        return SecurityContextHolder.getContext().getAuthentication();
    }

    @Override
    public Customer getCurrentUser(){
        Authentication authentication = getAuthentication();
        Customer customer = customerRepository.findByEmail(authentication.getName()).get();
        return customer;
    }
}
