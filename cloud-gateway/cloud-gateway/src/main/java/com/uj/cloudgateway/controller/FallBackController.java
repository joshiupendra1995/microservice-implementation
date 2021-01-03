package com.uj.cloudgateway.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Upendra
 *
 */
@RestController
public class FallBackController {

	/**
	 * @return userServiceFallback
	 */
	@GetMapping("/userServiceFallback")
	public String userServiceFallback() {
		return "User Service is taking longer then expected" + "\nPlease try again latter";
	}
	
	/**
	 * @return departmentServiceFallback
	 */
	@GetMapping("/departmentServiceFallback")
	public String departmentServiceFallback() {
		return "Department Service is taking longer then expected" + "\nPlease try again latter";
	}
}
