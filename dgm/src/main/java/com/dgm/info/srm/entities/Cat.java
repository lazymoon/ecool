/**
 * 
 */
package com.dgm.info.srm.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.Index;

/**
 * @author zhengss
 * 2014-11-26下午11:34:14
 */
@Entity
@DynamicUpdate
@DynamicInsert
@Table(name = "srm_test_cat")
public class Cat {
	private Long id;
	private String name;
	private String color;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ID", columnDefinition = "bigint(20) unsigned",nullable = false)
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	@Column(name = "cat_name", columnDefinition = "varchar(100) DEFAULT ''", nullable = false)
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Column(name = "cat_color", columnDefinition = "varchar(100) DEFAULT ''", nullable = false)
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
}
