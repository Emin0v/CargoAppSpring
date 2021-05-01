package com.company.service;

import com.company.model.Customer;
import org.springframework.security.core.Authentication;

public interface IAuthenticationFacade {

    Authentication getAuthentication();

    Customer getCurrentUser();
}
