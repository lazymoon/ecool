package com.dgm.info.srm.dao;

import java.util.Iterator;

import javax.persistence.EntityManager;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;

import com.dgm.info.srm.entities.Student;
import com.dgm.info.srm.entities.Teacher;
@RunWith(SpringJUnit4ClassRunner.class)
@ActiveProfiles(profiles = "development")
@ContextConfiguration(locations = { "/application.xml" })
@TransactionConfiguration(transactionManager = "transactionManager",defaultRollback = false)
@Transactional
public class TeacherDaoTest {
	/**
     * 用来判断映射是否成功
     * 
     */
	@Autowired
	private TeacherDao teacherDao;
	@Autowired
	private StudentDao studentDao;
	
	
	
    public void  test() {
//    	EntityManagerFactory factory = Persistence.createEntityManagerFactory("ljq");
//        EntityManager em=factory.createEntityManager();
//    	entityManager.getTransaction().begin();
//        
//    	entityManager.persist(new Teacher("张老师"));
//    	entityManager.persist(new Student("小张"));
//        
//    	entityManager.getTransaction().commit();
//    	entityManager.close();
    	Teacher teacher = new Teacher("z老师");
    	Student student = new Student("z小明");
    	studentDao.save(student);
    	teacher.getStudents().add(student);
    	teacherDao.save(teacher);
//        factory.close();
    }
    
    @Test
    public void findStu(){
//     	 Iterable<Teacher> teachers = teacherDao.findAll();
//     	Iterator<Teacher> it = teachers.iterator();
//     	while(it.hasNext()){
//     		Teacher teacher = it.next();
//     		System.out.println(teacher.getName() + teacher.getTeacherid());
//     	}
//    	teacherDao.save(new Teacher("miss zheng"));
    	Teacher teacher = teacherDao.findOne(1L);
    	System.out.println(teacher.getStudents().size());
//     	teacher.getStudents().size();
//     	System.out.println(teacher.getStudents().size());
    }
    
    @Test
    public void updateStu(){
    	Teacher teacher = teacherDao.findOne(1L);
    	Student student = new Student("bbb");
		teacher.addStudent(student);
    }
    
}
