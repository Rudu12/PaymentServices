package com.micro.payments;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages={"com.micro.controllers","com.micro.dto"})
public class PaymentServicesApplication {

	public static void main(String[] args) {
		SpringApplication.run(PaymentServicesApplication.class, args);
	}

}
