/**
 * 
 */
package com.dgm.info.srm.security.shiro.token;

import org.apache.shiro.authc.HostAuthenticationToken;

import com.dgm.info.srm.entities.User;

/**
 * @author zhengss
 * 2014-11-23下午11:44:50
 */
public class UserToken implements HostAuthenticationToken {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1602976925826992988L;
	
	private User user;

	public UserToken(User user) {
		super();
		this.user = user;
	}

	/* (non-Javadoc)
	 * @see org.apache.shiro.authc.AuthenticationToken#getCredentials()
	 */
	@Override
	public Object getCredentials() {
		return user.getPassword();
	}

	/* (non-Javadoc)
	 * @see org.apache.shiro.authc.AuthenticationToken#getPrincipal()
	 */
	@Override
	public Object getPrincipal() {
		return user;
	}

	/* (non-Javadoc)
	 * @see org.apache.shiro.authc.HostAuthenticationToken#getHost()
	 */
	@Override
	public String getHost() {
		return "";
	}

}
