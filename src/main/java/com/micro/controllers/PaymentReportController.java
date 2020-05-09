package com.micro.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.micro.dto.Payment;

@RestController
public class PaymentReportController {

	
	@RequestMapping("/payment-report")
	public Payment getPayments(){
		
		return null;
	}
	
}
