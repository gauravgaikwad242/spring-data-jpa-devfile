package com.jpa.entity;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Table(name="customer")
public class Customer {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="cust_id")
	private Integer custID;
	@Column(name="customer_name")
	private String custName;
}
