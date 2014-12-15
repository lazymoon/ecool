/**
 * 
 */
package com.dgm.info.srm.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

/**
 * @author zhengss
 * 2014-11-23下午11:45:44
 */
@Entity
@DynamicUpdate
@DynamicInsert
@Table(name = "lazyblog_user")
public class User {

	/**
	 * 
	 */
	private Long id;
	private String username;
	private String password;
	private String email;
	private boolean sex;
	private List<Permission> permissions;
	
	public User() {
		super();
	}
	
	public User(String username, String password, String email, boolean sex) {
		super();
		this.username = username;
		this.password = password;
		this.email = email;
		this.sex = sex;
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
	@Column(name = "username", nullable = false, length = 40, columnDefinition = "varchar(40) ",  unique=true)
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	@Column(name = "password", columnDefinition = "varchar(40) ", nullable = false)
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Column(name = "email", columnDefinition = "varchar(50) ", nullable = false)
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Column(name = "sex" ,columnDefinition="tinyint(1)" , nullable = false)
	public boolean isSex() {
		return sex;
	}
	public void setSex(boolean sex) {
		this.sex = sex;
	}
	
    @ManyToMany(cascade = CascadeType.PERSIST, fetch = FetchType.LAZY)
    @JoinTable(name = "User_Permission", 
            joinColumns = { @JoinColumn(name = "User_ID", referencedColumnName = "id") }, 
            inverseJoinColumns = { @JoinColumn(name = "Permission_ID", referencedColumnName = "id") })
	public List<Permission> getPermissions() {
		return permissions;
	}
	public void setPermissions(List<Permission> permissions) {
		this.permissions = permissions;
	}
	
    /**
     * 添加权限
     * 
     * @param student
     */
    public void addPermission(Permission permission) {
        if (!this.permissions.contains(permission)) {
            this.permissions.add(permission);
        }
    }

    /**
     * 删除权限
     * 
     * @param student
     */
    public void removePermission(Permission permission) {
        if(this.permissions.contains(permission)){
            this.permissions.remove(permission);
        }
    }
	
}
