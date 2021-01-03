package com.uj.department.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uj.department.entity.Department;
import com.uj.department.repository.DepartmentRepository;

import lombok.extern.slf4j.Slf4j;

/**
 * @author Upendra
 *
 */
@Service
@Slf4j
public class DepartmentService {

	@Autowired
	private DepartmentRepository departmentRepository;

	public Department saveDepartment(Department department) {
		log.info("Inside save department of department service");
		return departmentRepository.save(department);
	}

	public Department findByDepartmentId(Long Id) {
		return departmentRepository.findByDepartmentId(Id);
	}

}
