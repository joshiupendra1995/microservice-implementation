package com.uj.cloudgateway.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallBackController {

	@GetMapping("/userServiceFallback")
	public String userServiceFallback() {
		return "User Service is taking longer then expected" + "\nPlease try again latter";
	}
	
	@GetMapping("/departmentServiceFallback")
	public String departmentServiceFallback() {
		return "Department Service is taking longer then expected" + "\nPlease try again latter";
	}
}
