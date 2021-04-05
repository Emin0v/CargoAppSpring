package com.company.dao;

import com.company.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer,Integer>,CustomerRepositoryCustom {

    Customer findByEmail(String email);


}
