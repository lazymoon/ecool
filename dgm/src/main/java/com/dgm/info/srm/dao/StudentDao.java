/**
 * 
 */
package com.dgm.info.srm.dao;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.dgm.info.srm.entities.Student;

/**
 * @author zhengss
 * 2014-12-12下午9:44:50
 */
public interface StudentDao extends PagingAndSortingRepository<Student, Long>{

}
