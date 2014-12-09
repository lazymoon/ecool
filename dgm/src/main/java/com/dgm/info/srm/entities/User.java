/**
 * 
 */
package com.dgm.info.srm.entities;

import java.io.Serializable;

import com.dgm.info.srm.security.shiro.Roles;

/**
 * @author zhengss
 * 2014-11-23下午11:45:44
 */
public class User implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7929325076129575427L;
	private String username;
	private String password;
	private Roles userType;
	
	public User(String username, String password, Roles userType) {
		super();
		this.username = username;
		this.password = password;
		this.userType = userType;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Roles getUserType() {
		return userType;
	}
	public void setUserType(Roles userType) {
		this.userType = userType;
	}
	

}
