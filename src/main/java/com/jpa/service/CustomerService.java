package com.jpa.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.jpa.dao.CustomerRepository;
import com.jpa.entity.Customer;

import jakarta.annotation.PostConstruct;

public class CustomerService {

	@Autowired
	private CustomerRepository customerRepository;

	public Customer addCustomer(Customer customer) {
		return this.customerRepository.save(customer);
	}

	public Iterable<Customer> getAllCustomer(){
		return this.customerRepository.findAll();
	}

}
