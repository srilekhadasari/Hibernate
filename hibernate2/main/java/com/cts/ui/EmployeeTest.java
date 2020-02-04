package com.cts.ui;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.cts.model.Employees;

public class EmployeeTest {

	public static void main(String[]args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("JHPU");
		EntityManager em=emf.createEntityManager();
		em.getTransaction().begin();
		Employees e=new Employees();
		e.setEmpname("srilu");
		em.persist(e);
		em.getTransaction().commit();
		em.close();
		emf.close();
		System.out.println("inserted......");
	}
}
