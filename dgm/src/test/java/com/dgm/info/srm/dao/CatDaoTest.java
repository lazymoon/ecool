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

import com.dgm.info.srm.entities.Cat;

/**
 * @author zhengss
 * 2014-11-26下午11:40:07
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ActiveProfiles(profiles = "development")
@ContextConfiguration(locations = { "/application.xml" })
@TransactionConfiguration(transactionManager = "transactionManager",defaultRollback = false)
@Transactional
public class CatDaoTest {
	@Autowired
	private CatDao catDao;
	@Test
	public void testSave() {
		Cat cat = new Cat();
		cat.setId(0L);
		cat.setColor("red");
		cat.setName("cat1");
		catDao.save(cat);
	}
	

}
