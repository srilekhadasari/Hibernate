package com.cts.comp.ui;

import java.util.TreeSet;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import com.cts.comp.model.Course;
import com.cts.comp.model.Trainee;
import com.cts.util.JPAUtil;

public class ExampleOneToMany {
	public static void main(String[]args) {
		Course mca=new Course(101,"MCA",new TreeSet<Trainee>());
		Course mba=new Course(102,"MBA",new TreeSet<Trainee>());
		
		
		mca.getTrainees().add(new Trainee(201,"vamsi",mca));
		mca.getTrainees().add(new Trainee(202,"srilu",mca));
		mca.getTrainees().add(new Trainee(203,"suseela",mca));
		
		
		mba.getTrainees().add(new Trainee(204,"srinu",mba));
		mba.getTrainees().add(new Trainee(205,"deepa",mba));
		mba.getTrainees().add(new Trainee(206,"raghu",mba));
		
		EntityManager em=JPAUtil.getEntityManagerFactory().createEntityManager();
		EntityTransaction txn=em.getTransaction();
		txn.begin();
		em.persist(mca);
		em.persist(mba);
		txn.commit();
		
		
	}

}
