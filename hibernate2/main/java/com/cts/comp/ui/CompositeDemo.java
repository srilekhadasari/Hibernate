package com.cts.comp.ui;

import javax.persistence.EntityManager;

import com.cts.comp.model.Address;

import com.cts.comp.model.Faculty;

import com.cts.util.JPAUtil;

public class CompositeDemo {

	public static void main(String[]args) {
		
		Faculty f=new Faculty("Srilu",
				new Address("A201","serling brookfeildAppartments","banglore,karnataka"));
		
		EntityManager em=JPAUtil.getEntityManagerFactory().createEntityManager();
		
		em.getTransaction().begin();                                                                                                                                                                                                                                                                                                                                                     
		
		em.persist(f);
		
		em.getTransaction().commit();
		
		System.out.println("Faculty saved");
		
		JPAUtil.shutdown();
		
	}
	
}
