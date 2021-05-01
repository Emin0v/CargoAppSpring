package com.company.service;

import com.company.model.Customer;
import com.company.service.inter.CustomerServiceInter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service("userDetailsService")
public class CustomUserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    private CustomerServiceInter customerServiceInter;

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        Customer customer = customerServiceInter.findByEmail(email)
                .orElseThrow(() -> new UsernameNotFoundException("Email " + email + " not found"));
        return new org.springframework.security.core.userdetails.User(customer.getEmail(), customer.getPassword(),
                getAuthorities(customer));
    }

    private static Collection<? extends GrantedAuthority> getAuthorities(Customer customer) {
        String[] userRoles = customer.getRoles().stream().map((role) -> role.getRole()).toArray(String[]::new);
        Collection<GrantedAuthority> authorities = AuthorityUtils.createAuthorityList(userRoles);
        return authorities;
    }
}
