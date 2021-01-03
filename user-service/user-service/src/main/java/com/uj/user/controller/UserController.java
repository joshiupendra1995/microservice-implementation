package com.uj.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.uj.user.entity.User;
import com.uj.user.service.UserService;
import com.uj.user.vo.RestTemplateVo;

@RestController
@RequestMapping("/users")
public class UserController {

	@Autowired
	private UserService userService;

	@PostMapping("/")
	public User saveUser(@RequestBody User user) {
		return userService.saveUser(user);
	}

	@GetMapping("/{userId}")
	public User findUserById(@PathVariable("userId") Long userId) {
		return userService.findByUserId(userId);
	}

	@GetMapping("/userId/{userId}")
	public RestTemplateVo getUserWithDepartment(@PathVariable("userId") Long userId) {
		return userService.findUserWithDepartment(userId);
	}
}
