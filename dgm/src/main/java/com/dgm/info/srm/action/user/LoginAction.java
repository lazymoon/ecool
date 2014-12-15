package com.dgm.info.srm.action.user;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.subject.Subject;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.dgm.info.srm.dao.UserDao;
import com.dgm.info.srm.entities.User;
import com.dgm.info.srm.security.shiro.token.UserToken;
import com.opensymphony.xwork2.ActionSupport;


@Results({
	@Result(name = "success", type = "redirect", location = "/index/index.jsp"),
	@Result(name = "input", type = "json" ) })
@Controller
public class LoginAction extends ActionSupport{

	private static final long serialVersionUID = 6500583241754761786L;
	private static final Logger logger = LoggerFactory.getLogger(LoginAction.class);
	@Autowired
	private UserDao userDao;
	
	private String username;
	private String password;
	private String actionMessage;
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
	public String getActionMessage() {
		return actionMessage;
	}
	public void setActionMessage(String actionMessage) {
		this.actionMessage = actionMessage;
	}
	
	@Action("login")
	public String login(){
		User user = userDao.findByusernameAndPassword(username, password);
		if(user == null){
			actionMessage = "错误的用户名或密码！";
		} else {
			Subject subject = SecurityUtils.getSubject();
			UserToken token = new UserToken(user);
			try {
		        subject.login(token);
		        actionMessage ="success";
		    } catch (AuthenticationException e) {
		        logger.error(e.getMessage());
		        actionMessage = "错误的用户名或密码！";
		    }
		}
		return "input";
	}
	
	@Action("logout")
	public String logout(){
		Subject subject = SecurityUtils.getSubject();
		subject.logout();
		return "success";
	}
}
