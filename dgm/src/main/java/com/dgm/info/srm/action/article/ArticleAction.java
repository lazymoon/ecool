/**
 * 
 */
package com.dgm.info.srm.action.article;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;

import com.dgm.info.srm.dao.ArticleDao;
import com.dgm.info.srm.entities.Article;

/**
 * @author zhengss
 * 2014-12-10下午9:41:21
 */
@Results({
	@Result(name = "success", location = "/article/article.jsp") })
@Namespace("/article")
@Controller
public class ArticleAction {
	private List<Article> articles;
	
	
	
	public void setArticles(List<Article> articles) {
		this.articles = articles;
	}
	
	public List<Article> getArticles() {
		return articles;
	}

	@Autowired
	private ArticleDao articleDao;
	
	@Action("findArticles")
	public String findArticles()
	{
		System.out.println("getArticles()3");
		System.out.println("getArticles()4");
		System.out.println("getArticles()2");
		System.out.println("getArticles()2");
		System.out.println("getArticles()2");
		articles = new ArrayList<>();
		Pageable pageable = new PageRequest(1, 10);
		Iterable<Article> ite = articleDao.findAll();
		Iterator i = ite.iterator();
		while(i.hasNext()){
			Article a = (Article) i.next();
			articles.add(a);
			articles.add(a);
		}
		return "success";
	}
}
