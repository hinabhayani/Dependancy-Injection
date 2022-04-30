package com.java.dependancy.serviceimpl;

import org.springframework.stereotype.Service;

import com.java.dependancy.entity.Customer;
import com.java.dependancy.service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService{

	@Override
	public void dispayCustomer(Customer c) {
		System.out.println("Customer:: "+c);
		
	}

	

}
