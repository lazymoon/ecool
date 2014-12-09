/**
 * 
 */
package com.dgm.info.srm.dao;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.dgm.info.srm.entities.Cat;

/**
 * @author zhengss
 * 2014-11-26下午11:38:31
 */
public interface CatDao extends PagingAndSortingRepository<Cat, Long>{

}
