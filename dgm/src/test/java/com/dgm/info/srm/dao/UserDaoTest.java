/**
 * 
 */
package com.dgm.info.srm.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;

import com.dgm.info.srm.entities.Permission;
import com.dgm.info.srm.entities.User;

/**
 * @author zhengss
 * 2014-12-11下午9:50:10
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ActiveProfiles(profiles = "development")
@ContextConfiguration(locations = { "/application.xml" })
@TransactionConfiguration(transactionManager = "transactionManager",defaultRollback = false)
@Transactional
public class UserDaoTest {
	@Autowired
	private UserDao userDao;
	@Autowired
	private PermissionDao permissionDao;
//	@Test
//	public void testSave() {
//		User user = new User();
//		user = userDao.save(user);
//		if(user.getUsername() == null){
//			System.out.println("aaaa");
//		}
//	}
	
	@Test
	public void findUsr(){
		Permission permission = permissionDao.findOne(1L);
//		Permission permission = new Permission("article", "article权限");
//		permissionDao.save(permission);
//		userDao.save(new User("zheng", "zheng", "zhengshusheng14@126.com", true));
		User user = userDao.findOne(1L);
		System.out.println(user.getPermissions().size());
//		user.addPermission(permission);
	}
}
