package com.company.service.impl;

import at.favre.lib.crypto.bcrypt.BCrypt;
import com.company.dao.CustomerRepository;
import com.company.dao.RoleRepository;
import com.company.dto.RegisterForm;
import com.company.exception.AuthorAlreadyExistException;
import com.company.model.Customer;
import com.company.model.Role;
import com.company.service.inter.CustomerServiceInter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Arrays;
import java.util.Optional;

@Service
@Transactional
public class CustomerServiceImpl implements CustomerServiceInter {

    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private RoleRepository roleRepository;

    private BCrypt.Hasher crypt = BCrypt.withDefaults();

    @Override
    public Optional<Customer> findById(Integer id) {
        return customerRepository.findById(id);
    }

    @Override
    public boolean updateCustomer(Customer customer) {
        return customerRepository.updateCustomer(customer);
    }

    @Override
    public Optional<Customer> findByEmail(String email) {
        return customerRepository.findByEmail(email);
    }


    public boolean check(String email) {
        return customerRepository.existsByEmail(email);
    }

    @Override
    public void save(Customer customer) {
        customerRepository.save(customer);
    }

    @Override
    public void register(RegisterForm registerForm)
            throws AuthorAlreadyExistException {

        String email = registerForm.getEmail();
        if (check(email)) {
            throw new AuthorAlreadyExistException();
        }

        Customer customer = registerForm.toCustomer();
        customer.setPassword(crypt.hashToString(4, registerForm.getPassword().toCharArray()));

        Role role = roleRepository.findByRole("USER");
        customer.setRoles(Arrays.asList(role));

        save(customer);
    }


}
