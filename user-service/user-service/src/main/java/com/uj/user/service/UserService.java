package com.uj.user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.uj.user.entity.User;
import com.uj.user.repository.UserRepository;
import com.uj.user.vo.Department;
import com.uj.user.vo.RestTemplateVo;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class UserService {

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private RestTemplate restTemplate;

	public User saveUser(User user) {
		log.info("Inside user service");
		return userRepository.save(user);
	}

	public User findByUserId(Long userId) {
		return userRepository.findByUserId(userId);
	}

	public RestTemplateVo findUserWithDepartment(Long userId) {
		RestTemplateVo vo = new RestTemplateVo();
		User user = userRepository.findByUserId(userId);
		Department department = restTemplate.getForObject("http://localhost:9091/departments/" + user.getDepartmentId(),
				Department.class);
		vo.setUser(user);
		vo.setDepartment(department);
		return vo;
	}

}
