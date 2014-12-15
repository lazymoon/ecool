/**
 * 
 */
package com.dgm.info.srm.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dgm.info.srm.entities.Permission;

/**
 * @author zhengss
 * 2014-12-13下午5:42:50
 */
public interface PermissionDao extends JpaRepository<Permission, Long> {

}
