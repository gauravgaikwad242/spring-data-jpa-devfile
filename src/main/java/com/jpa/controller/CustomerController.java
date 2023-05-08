package com.jpa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jpa.entity.Customer;
import com.jpa.service.CustomerService;

@RestController
@RequestMapping("customer")
public class CustomerController {
	
	@Autowired
	private CustomerService customerService;
	
	@GetMapping("/")
	public String handler() {
		return "app running";
	}
	
	@PostMapping("save")
	public Customer saveCustomer(@RequestBody() Customer customer) {
		return this.customerService.addCustomer(customer);
	}
	
	@GetMapping("getall")
	public Iterable<Customer> getAll(){
		return this.customerService.getAllCustomer();
	}
	

}
