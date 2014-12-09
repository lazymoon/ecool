package com.dgm.info.srm.action.login;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;
import org.springframework.stereotype.Controller;

import com.dgm.info.srm.entities.User;
import com.dgm.info.srm.security.shiro.Roles;
import com.dgm.info.srm.security.shiro.token.UserToken;
import com.opensymphony.xwork2.ActionSupport;


@Results({
	@Result(name = "login", location = "/login.jsp"),
	@Result(name = "success", location = "/index.jsp"),
	@Result(name = "input", location = "/index.jsp") })
@Namespace("/login")
@Controller
public class LoginAction extends ActionSupport{

	/**
	 * 
	 */
	private static final long serialVersionUID = 6500583241754761786L;
	 	private String username;
	    private String password;
	    
	    public LoginAction() {
			super();
		}
	    public String getUsername()
	    {
	        return username;
	    }
	    public void setUsername(String username)
	    {
	        this.username = username;
	    }
	    public String getPassword()
	    {
	        return password;
	    }
	    public void setPassword(String password)
	    {
	        this.password = password;
	    }
	    
	    private String txt;
	    
	    public String getTxt() {
			return txt;
		}
		public void setTxt(String txt) {
			this.txt = txt;
		}
		
		public String show(){
			return LOGIN;
		}
		
		@Action("show")
		public String login()
		{
			System.out.println("LoginAction.login()");
			System.out.println("LoginAction.login()");
			System.out.println("LoginAction.login()");
			UserToken token = null;
			if(username == null || password == null) {
				return "login";
			}
			if("aaa".equals(username)) {
				 token = new UserToken(new User(username, password, Roles.SUPPLIER));//username和password是从表单提交过来的
				 Subject currentUser = SecurityUtils.getSubject();
			     currentUser.login(token);
			}
			else if("bbb".equals(username)) {
				 token = new UserToken(new User(username, password, Roles.ADMIN));//username和password是从表单提交过来的
				 Subject currentUser = SecurityUtils.getSubject();
			     currentUser.login(token);
			}
			System.out.println("LoginAction.login()");
			return "success";
		}
}
