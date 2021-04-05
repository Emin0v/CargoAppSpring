package com.company.service;

import com.company.dao.CustomerRepository;
import com.company.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.User.UserBuilder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service("userDetailsService")
public class CustomUserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
       Customer customer = customerRepository.findByEmail(email);

        if(customer!=null){
            UserBuilder builder = User.withUsername(email);

            builder.disabled(false);
            builder.password(customer.getPassword());

            String[] authoritiesArr = new String[]{"ADMIN","USER"};
            builder.authorities(authoritiesArr);

            return builder.build();
        }else{
            throw new UsernameNotFoundException("Customer not found");
        }

    }
}
