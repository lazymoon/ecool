/**
 * 
 */
package com.dgm.info.srm.security.shiro.realm;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;

import com.dgm.info.srm.dao.UserDao;
import com.dgm.info.srm.entities.Permission;
import com.dgm.info.srm.entities.User;
import com.dgm.info.srm.security.shiro.token.UserToken;

/**
 * @author zhengss
 * 2014-11-24上午12:05:21
 */
public class JDBCRealm extends AuthorizingRealm {
	
	public JDBCRealm() {
		setName(this.getClass().getSimpleName());
		setAuthenticationTokenClass(UserToken.class);
	}

	/* (non-Javadoc)
	 * 获取授权信息
	 * @see org.apache.shiro.realm.AuthorizingRealm#doGetAuthorizationInfo(org.apache.shiro.subject.PrincipalCollection)
	 */
	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection arg0) {
		SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();
		User user =  (User) arg0.getPrimaryPrincipal();
		for(Permission permission: user.getPermissions()){
			info.addStringPermission(permission.getPermName());
		}
		return info;
	}

	/* (non-Javadoc)
	 * 获取认证信息
	 * @see org.apache.shiro.realm.AuthenticatingRealm#doGetAuthenticationInfo(org.apache.shiro.authc.AuthenticationToken)
	 */
	@Override
	protected AuthenticationInfo doGetAuthenticationInfo( AuthenticationToken arg0) throws AuthenticationException {
		Object principal = arg0.getPrincipal();
		if (principal != null) {
			return new SimpleAuthenticationInfo(arg0.getPrincipal(), arg0.getCredentials().toString(), getName());
		}
		return null;
	}

}
