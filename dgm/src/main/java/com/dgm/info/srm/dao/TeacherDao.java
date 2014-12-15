/**
 * 
 */
package com.dgm.info.srm.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.dgm.info.srm.entities.Teacher;

/**
 * @author zhengss
 * 2014-12-12下午9:40:23
 */
public interface TeacherDao extends JpaRepository<Teacher, Long>{

}
