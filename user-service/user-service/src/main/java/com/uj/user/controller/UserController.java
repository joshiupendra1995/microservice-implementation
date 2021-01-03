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

/**
 * @author Upendra
 *
 */
@RestController
@RequestMapping("/users")
public class UserController {

	@Autowired
	private UserService userService;

	/**
	 * @param user
	 * @return user
	 */
	@PostMapping("/")
	public User saveUser(@RequestBody User user) {
		return userService.saveUser(user);
	}

	/**
	 * @param userId
	 * @return user
	 */
	@GetMapping("/{userId}")
	public User findUserById(@PathVariable("userId") Long userId) {
		return userService.findByUserId(userId);
	}

	/**
	 * @param userId
	 * @return RestTemplateVo
	 */
	@GetMapping("/userId/{userId}")
	public RestTemplateVo getUserWithDepartment(@PathVariable("userId") Long userId) {
		return userService.findUserWithDepartment(userId);
	}
}
