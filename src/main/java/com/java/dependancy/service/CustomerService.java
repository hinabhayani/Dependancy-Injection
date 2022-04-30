package com.java.dependancy.service;
import org.springframework.stereotype.Service;

import com.java.dependancy.entity.Customer;

@Service
public interface CustomerService {
	
	public void dispayCustomer(Customer c);

}
