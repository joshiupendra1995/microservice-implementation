package com.uj.department.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.uj.department.entity.Department;
import com.uj.department.service.DepartmentService;

/**
 * @author Upendra
 *
 */
@RestController
@RequestMapping("/departments")
public class DepartmentController {

	@Autowired
	private DepartmentService departmentService;

	/**
	 * @param department
	 * @return department
	 */
	@PostMapping("/")
	public Department saveDepartment(@RequestBody Department department) {
		return departmentService.saveDepartment(department);
	}

	/**
	 * @param Id
	 * @return Department
	 */
	@GetMapping("/{id}")
	public Department getDepartment(@PathVariable("id") Long Id) {
		return departmentService.findByDepartmentId(Id);
	}

}
