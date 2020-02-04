package com.cts.hib1.ui;

import java.sql.Date;

import javax.persistence.EntityManager;

import com.cts.hib1.model.Student;
import com.cts.hib1.model.StudentIdentity;
import com.cts.hib1.util.JPAUtil;

public class ExampleForCompositeKey {
	public static void main(String[]args) {
Student s=new Student(new StudentIdentity(1,'A',7),"VAMSI","Aripka",new Date(2000,5,5));
	
	EntityManager em= JPAUtil.getEntityManagerFactory().createEntityManager();

	em.getTransaction().begin();
	em.persist(s);
	em.getTransaction().commit();
	System.out.println("student saved");
	JPAUtil.shutdown();
	
}
	
	

}
