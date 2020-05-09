package com.micro.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthCheckController {

	@RequestMapping("/hc")
	public String healthcheck() {
		return "Everything Fine";
	}
	
	
}
