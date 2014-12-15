/**
 * 
 */
package com.dgm.info.srm.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dgm.info.srm.entities.User;

/**
 * @author zhengss
 * 2014-12-11下午8:59:42
 */
public interface UserDao extends JpaRepository<User, Long>{
	public User findByusernameAndPassword(String username, String password);
}
