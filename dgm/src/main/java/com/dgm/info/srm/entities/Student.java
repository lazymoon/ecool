/**
 * 
 */
package com.dgm.info.srm.entities;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

/**
 * @author zhengss
 * 2014-12-12下午9:32:11
 */
@SuppressWarnings("serial")
@DynamicUpdate
@DynamicInsert
@Entity
public class Student {
	/** 学生ID **/
    private Long studentid;
    /** 学生姓名 **/
    private String name;
    private Set<Teacher> teachers=new HashSet<Teacher>();
    
    public Student() {
        super();
    }
    
    public Student(String name) {
        super();
        this.name = name;
    }
    
    @Id
    @GeneratedValue
    public Long getStudentid() {
        return studentid;
    }

    public void setStudentid(Long studentid) {
        this.studentid = studentid;
    }

    @Column(nullable=false,length=32)
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    
//    //@ManyToMany注释表示Student是多对多关系的一边，mappedBy属性定义了Student为双向关系的维护端
//    //Teacher表是关系的维护者，owner side，有主导权，它有个外键指向Student表。 
    @ManyToMany(mappedBy = "students")
    public Set<Teacher> getTeachers() {
        return teachers;
    }

    public void setTeachers(Set<Teacher> teachers) {
        this.teachers = teachers;
    }
}
