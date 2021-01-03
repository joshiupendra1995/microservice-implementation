package com.uj.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.uj.user.entity.User;

/**
 * @author Upendra
 *
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> {

	/**
	 * @param userId
	 * @return user
	 */
	public User findByUserId(Long userId);
}
