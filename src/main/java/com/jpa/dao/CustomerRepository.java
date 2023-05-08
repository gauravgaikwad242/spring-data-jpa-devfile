package com.jpa.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jpa.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer>{

}
