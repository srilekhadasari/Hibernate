package com.cts.emp.ui;

import javax.persistence.EntityManager;

import com.cts.emp.model.ContractEmp;
import com.cts.emp.model.Emp;
import com.cts.emp.model.Manager;
import com.cts.util.JPAUtil;

public class EmpTest {

	public static void main(String[]args) {
		Emp e=new Emp(101,"vamsy",25000);
		Manager m=new Manager(102,"Ramu",35000,9500);
		ContractEmp ce=new ContractEmp(103,"kittu",45200,11);
		
		EntityManager em=JPAUtil.getEntityManagerFactory().createEntityManager();
		
		
		em.getTransaction().begin();
		em.persist(e);
		em.persist(m);
		em.persist(ce);
		em.getTransaction().commit();
		System.out.println("all records saved");
		JPAUtil.shutdown();
	}
}
