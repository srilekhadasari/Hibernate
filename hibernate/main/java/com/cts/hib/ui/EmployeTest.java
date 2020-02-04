package com.cts.hib.ui;
import java.util.Scanner;

import javax.persistence.EntityManager;

import com.cts.hib.model.Employe;
import com.cts.hib.util.JPAUtil;

public class EmployeTest {
	public static void main(String []args) {
		Scanner scan=new Scanner(System.in);
		Employe e= new Employe();
		System.out.println("empid:");
		e.setEmpid(scan.nextInt());
		System.out.println("empname:");
		e.setEmpname(scan.next());
		System.out.println("Basic:");
		e.setBasic(scan.nextDouble());
		
		EntityManager em= JPAUtil.getEntityManagerFactory().createEntityManager();
		
		em.getTransaction().begin();
		em.persist(e);
		em.getTransaction().commit();
		System.out.println("Emp saved");
		JPAUtil.shutdown();
		scan.close();
	}
}
