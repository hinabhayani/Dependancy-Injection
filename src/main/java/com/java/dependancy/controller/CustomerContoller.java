package com.java.dependancy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.java.dependancy.entity.Customer;
import com.java.dependancy.service.CustomerService;

@Component
public class CustomerContoller {
	
	@Autowired
	public CustomerService customerService;
	
	public void displayCustomer() {
		System.out.println("customer contoller call");
		Customer c=new Customer();
		c.setName("colins");
		c.setEmail("colins@gmail.com");
		c.setAddress("Canada");
		c.setPhone(1235647);
		customerService.dispayCustomer(c);
	}

}
