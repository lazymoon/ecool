/**
 * 
 */
package com.dgm.info.srm.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

/**
 * @author zhengss
 * 2014-12-13下午5:18:58
 */
@Entity
@DynamicUpdate
@DynamicInsert
@Table(name = "lazyblog_permission")
public class Permission {
	
	private Long id;
	private String permName;
	private String permDescribe;
	private List<User> users;
	
	public Permission() {
		super();
	}
	public Permission(String permName, String permDescribe) {
		super();
		this.permName = permName;
		this.permDescribe = permDescribe;
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ID", columnDefinition = "bigint(20) unsigned",nullable = false)
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	@Column(name = "permname", nullable = false, length = 40, columnDefinition = "varchar(20) ",  unique=true)
	public String getPermName() {
		return permName;
	}
	public void setPermName(String permName) {
		this.permName = permName;
	}
	
	@Column(name = "permdescrible", length = 40, columnDefinition = "varchar(40) ")
	public String getPermDescribe() {
		return permDescribe;
	}
	public void setPermDescribe(String permDescribe) {
		this.permDescribe = permDescribe;
	}
	
	@ManyToMany(mappedBy = "permissions")
	public List<User> getUsers() {
		return users;
	}
	public void setUsers(List<User> users) {
		this.users = users;
	}
	

}
