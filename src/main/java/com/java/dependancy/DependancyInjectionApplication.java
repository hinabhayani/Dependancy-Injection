package com.java.dependancy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.java.dependancy.controller.CustomerContoller;

@ComponentScan("com.java.dependancy")
@SpringBootApplication
public class DependancyInjectionApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context=SpringApplication.run(DependancyInjectionApplication.class, args);
	CustomerContoller c=context.getBean(CustomerContoller.class);
	c.displayCustomer();
	}

}
