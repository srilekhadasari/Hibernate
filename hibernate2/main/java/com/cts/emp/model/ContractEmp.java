package com.cts.emp.model;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;




@Entity
//@DiscriminatorValue("cemp")
//@Table(name="contremps")
@Table(name="contrtabemps")
public class ContractEmp extends Emp {
	@Column(name="cdur")
	private int duration;

	public ContractEmp() {
	}

	public ContractEmp(long eid, String ename, double basic,int duration) {
		super(eid, ename, basic);
		this.duration=duration;
	}



	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}
	
}
