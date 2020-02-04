package com.cts.emp.model;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
//@DiscriminatorValue("manager")
//@Table(name="Mgrs")
@Table(name="tabMgrs")
public class Manager extends Emp {
	@Column(name="allo")
    private double allowance;
	public  void Manager() {
	}
	public Manager() {
		super();
		
	}
	public Manager(long eid, String ename, double basic,double allowance) {
		super(eid, ename, basic);
		
	}
	public double getAllowance() {
		return allowance;
	}
	public void setAllowance(double allowance) {
		this.allowance = allowance;
	}
	
}
