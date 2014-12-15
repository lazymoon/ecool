/**
 * 
 */
package com.dgm.info.srm.dao;

import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;

import com.dgm.info.srm.entities.Article;
import com.dgm.info.srm.entities.Cat;

/**
 * @author zhengss
 * 2014-12-10下午7:52:52
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ActiveProfiles(profiles = "development")
@ContextConfiguration(locations = { "/application.xml" })
@TransactionConfiguration(transactionManager = "transactionManager",defaultRollback = true)
@Transactional
public class ArticleDaoTest {
	@Autowired
	private ArticleDao articleDao;
	@Test
	public void testSave() {
		Article article = new Article();
//		article.setId(0L);
		article.setContent("test".getBytes());
		article.setCreateDate(new Date());
//		article.setTitle("test");
		articleDao.save(article);
	}
}
