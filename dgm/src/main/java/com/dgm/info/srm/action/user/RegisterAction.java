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
import com.dgm.info.srm.util.MD5;
import com.opensymphony.xwork2.ActionSupport;
/**
 * 
 * @author zhengss
 * 2014-12-11下午9:07:05
 */
@Results({
	@Result(name = "register", location = "/user/register.jsp"),
	@Result(name = "index", location = "/index/index.jsp") })
@Controller
public class RegisterAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3025961872351477768L;
	private static final Logger logger = LoggerFactory.getLogger(RegisterAction.class);
	@Autowired
	private UserDao userDao;
	
 	private String username;
    private String password;
    private String email;
    private String sex;
    
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	@Action("register")
	public String register(){
		boolean sex_b = false;
		if("1".equals(sex)){
			sex_b = true;
		}
		try{
			User user = userDao.save(new User(username, MD5.md5(password), email, sex_b));
			Subject subject = SecurityUtils.getSubject();
			UserToken token = new UserToken(user);
			subject.login(token);
		} catch (AuthenticationException e) {
			logger.error(e.getMessage());
			return "input";
	    } catch (Exception e) {
			logger.error(e.getMessage());
			return "input";
		}
		return "index";
	}
}
