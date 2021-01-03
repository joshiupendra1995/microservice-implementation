package com.uj.user.vo;

import com.uj.user.entity.User;

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
public class RestTemplateVo {
	private User user;
	private Department department;

}
