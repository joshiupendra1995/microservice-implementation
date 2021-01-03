package com.uj.user.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Upendra
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Department {
	private Long departmentId;
	private String departmentName;
	private String departmentAddress;
	private String departmentCode;

}
