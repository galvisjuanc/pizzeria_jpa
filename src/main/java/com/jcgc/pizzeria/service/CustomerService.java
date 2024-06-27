package com.jcgc.pizzeria.service;

import com.jcgc.pizzeria.persistance.entity.CustomerEntity;
import com.jcgc.pizzeria.persistance.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {

    private final CustomerRepository customerRepository;

    @Autowired
    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public CustomerEntity findByPhone(String phone) {
        return customerRepository.findByPhone(phone);
    }
}
