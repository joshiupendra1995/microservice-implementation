package com.uj.user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.uj.user.entity.User;
import com.uj.user.repository.UserRepository;
import com.uj.user.vo.Department;
import com.uj.user.vo.RestTemplateVo;

import lombok.extern.slf4j.Slf4j;

/**
 * @author Upendra
 *
 */
@Service
@Slf4j
public class UserService {

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private RestTemplate restTemplate;

	/**
	 * @param user
	 * @return user
	 */
	public User saveUser(User user) {
		log.info("Inside user service");
		return userRepository.save(user);
	}

	/**
	 * @param userId
	 * @return user
	 */
	public User findByUserId(Long userId) {
		return userRepository.findByUserId(userId);
	}

	/**
	 * @param userId
	 * @return RestTemplateVo
	 */
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
