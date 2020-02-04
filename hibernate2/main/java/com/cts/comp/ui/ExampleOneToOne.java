package com.cts.comp.ui;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import com.cts.comp.model.BankAccount;
import com.cts.comp.model.Customer;
import com.cts.util.JPAUtil;

public class ExampleOneToOne {
	
	public static void main (String[]args) {
		
		BankAccount ba=new BankAccount();
		
		Customer c= new Customer("123456","srilekha",ba);
		
		ba.setAccno("S90001");
		
		ba.setCustomer(c);
		
		
		EntityManager em=JPAUtil.getEntityManagerFactory().createEntityManager();
		EntityTransaction txn= em.getTransaction();
		
		txn.begin();
		em.persist(c);
		txn.commit();
		JPAUtil.shutdown();
	}

}
