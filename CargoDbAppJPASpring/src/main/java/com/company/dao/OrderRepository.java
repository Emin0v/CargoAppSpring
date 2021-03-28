package com.company.dao;

import com.company.model.Order1;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order1,Integer> {


}
