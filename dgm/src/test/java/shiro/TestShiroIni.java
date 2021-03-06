package shiro;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.config.IniSecurityManagerFactory;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.util.Factory;
import org.junit.Assert;
import org.junit.Test;

import com.dgm.info.srm.entities.User;
import com.dgm.info.srm.security.shiro.Roles;
import com.dgm.info.srm.security.shiro.token.UserToken;

public class TestShiroIni {
//	@Test
//	public void testHelloWorld(){
	    //1、获取SecurityManager工厂，此处使用Ini配置文件初始化SecurityManager  
//	    Factory<org.apache.shiro.mgt.SecurityManager> factory = new IniSecurityManagerFactory("classpath:shiro.ini");  
//	    //2、得到SecurityManager实例 并绑定给SecurityUtils  
//	    org.apache.shiro.mgt.SecurityManager securityManager = factory.getInstance();  
//	    SecurityUtils.setSecurityManager(securityManager);  
//	    //3、得到Subject及创建用户名/密码身份验证Token（即用户身份/凭证）  
//	    Subject subject = SecurityUtils.getSubject();
////	    User user = new User("admin","admin",Roles.ADMIN);
////	    UserToken token = new UserToken(user);
//	   
//	    UsernamePasswordToken token = new UsernamePasswordToken("zhang", "123");
//	    try {  
//	        //4、登录，即身份验证  
//	        subject.login(token);  
//	    } catch (AuthenticationException e) {  
//	        //5、身份验证失败  
//	    }  
//	    System.out.println(subject.getPrincipal());
//	    Assert.assertEquals(true, subject.isAuthenticated()); //断言用户已经登录  
//	  
//	    //6、退出  
//	    subject.logout();
//	}
//	
	@Test
	public void testHelloworld() {
	    //1、获取SecurityManager工厂，此处使用Ini配置文件初始化SecurityManager
	    Factory<org.apache.shiro.mgt.SecurityManager> factory =
	            new IniSecurityManagerFactory("classpath:shiro.ini");
	    //2、得到SecurityManager实例 并绑定给SecurityUtils
	    org.apache.shiro.mgt.SecurityManager securityManager = factory.getInstance();
	    SecurityUtils.setSecurityManager(securityManager);
	    //3、得到Subject及创建用户名/密码身份验证Token（即用户身份/凭证）
	    Subject subject = SecurityUtils.getSubject();
//	    UsernamePasswordToken token = new UsernamePasswordToken("zhang", "123");
    User user = new User();
    UserToken token = new UserToken(user);
	    try {
	        //4、登录，即身份验证
	        subject.login(token);
	    } catch (AuthenticationException e) {
	        //5、身份验证失败
	    }
	    System.out.println(subject.getPrincipal());
	    Assert.assertEquals(true, subject.isAuthenticated()); //断言用户已经登录

	    //6、退出
	    subject.logout();
	}
}
