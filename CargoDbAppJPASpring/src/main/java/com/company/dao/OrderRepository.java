package com.company.dao;

import com.company.model.Customer;
import com.company.model.Order1;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OrderRepository extends JpaRepository<Order1,Integer>,OrderRepositoryCustom {

    List<Order1> findByCustomerNumber(Customer customer);

}
