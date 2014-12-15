/**
 * 
 */
package com.dgm.info.srm.dao;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.dgm.info.srm.entities.Article;

/**
 * @author zhengss
 * 2014-12-10下午7:52:17
 */
public interface ArticleDao extends PagingAndSortingRepository<Article, Long> {

}
