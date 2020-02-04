package com.cts.hib.model;

import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="employe")
public class Employe {
	@Id 
	@Column (name="empid")
	private  int empid;
	@Column (name="empname",nullable=false)
	private String empname;
	private double basic;
	
	
	public Employe() {
		// TODO Auto-generated constructor stub
	}
	public Employe(int empid, String empname, double basic) {
		this.empid = empid;
		this.empname = empname;
		this.basic = basic;
	}
	

	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public double getBasic() {
		return basic;
	}
	public void setBasic(double basic) {
		this.basic = basic;
	}
}
