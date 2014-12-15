/**
 * 
 */
package com.dgm.info.srm.security.interceptors;

import org.apache.shiro.SecurityUtils;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;

/**
 * @author zhengss
 * 2014-11-21下午11:42:06
 */
public class AuthorityInterceptor implements Interceptor{

	/**
	 * 
	 */
	private static final long serialVersionUID = -7671365734007226754L;

	@Override
	public void destroy() {
		System.out.println("AuthorityInterceptor.destroy()");
	}

	@Override
	public void init() {
		System.out.println("AuthorityInterceptor.init()");
	}

	@Override
	public String intercept(ActionInvocation invocation) throws Exception {
		System.out.println("AuthorityInterceptor.intercept()");
		System.out.println(SecurityUtils.getSubject().getSession().getTimeout());
//		if(SecurityUtils.getSubject().getPrincipal() == null ){
//			return "login";
//		}
		invocation.invoke();
		return null;
	}

}
