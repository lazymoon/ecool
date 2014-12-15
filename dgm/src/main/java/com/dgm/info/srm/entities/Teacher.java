/**
 * 
 */
package com.dgm.info.srm.entities;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

/**
 * @author zhengss
 * 2014-12-12下午9:32:33
 */
@SuppressWarnings("serial")
@DynamicUpdate
@DynamicInsert
@Entity
public class Teacher implements java.io.Serializable {
    /** 教师ID **/
    private Long teacherid;
    /** 教师姓名 **/
    private String name;
    private Set<Student> students=new HashSet<Student>();
    
    public Teacher() {
        super();
    }
    
    public Teacher(String name) {
        super();
        this.name = name;
    }
    
    @Id
    @GeneratedValue
    public Long getTeacherid() {
        return teacherid;
    }

    public void setTeacherid(Long teacherid) {
        this.teacherid = teacherid;
    }

    @Column(nullable=false,length=32)
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    //@ManyToMany注释表示Teacher是多对多关系的一端。
    //@JoinTable描述了多对多关系的数据表关系。name属性指定中间表名称，joinColumns定义中间表与Teacher表的外键关系。
    //中间表Teacher_Student的Teacher_ID列是Teacher表的主键列对应的外键列，inverseJoinColumns属性定义了中间表与另外一端(Student)的外键关系。
    @ManyToMany(cascade = CascadeType.PERSIST, fetch = FetchType.LAZY)
    @JoinTable(name = "Teacher_Student", 
            joinColumns = { @JoinColumn(name = "Teacher_ID", referencedColumnName = "teacherid") }, 
            inverseJoinColumns = { @JoinColumn(name = "Student_ID", referencedColumnName = "studentid") })
    public Set<Student> getStudents() {
        return students;
    }

    public void setStudents(Set<Student> students) {
        this.students = students;
    }

    /**
     * 添加学生
     * 
     * @param student
     */
    public void addStudent(Student student) {
        if (!this.students.contains(student)) {
            this.students.add(student);
//            student.setTeacher(this);
        }
    }
//
//    /**
//     * 删除学生
//     * 
//     * @param student
//     */
//    public void removeStudent(Student student) {
//        if(this.students.contains(student)){
//            student.setTeacher(null);
//            this.students.remove(student);
//        }
//    }
}