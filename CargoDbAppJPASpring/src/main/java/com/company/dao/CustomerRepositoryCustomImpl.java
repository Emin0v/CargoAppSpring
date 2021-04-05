package com.company.dao;


import com.company.model.Customer;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository("customerRepo")
public class CustomerRepositoryCustomImpl implements CustomerRepositoryCustom {

    @PersistenceContext
    EntityManager em;

    @Override
    public boolean updateCustomer(Customer customer) {
        em.merge(customer);
        return true;
    }
}
