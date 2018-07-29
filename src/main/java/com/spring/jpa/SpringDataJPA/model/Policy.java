package com.spring.jpa.SpringDataJPA.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="policy_details")
public class Policy {
	@Id
	@Column(name="policy_no")
	private int no;
	@Column(name="policy_name")
	private String name;
	
	public Policy() {
		super();
	}

	public Policy(int no, String name) {
		super();
		this.no = no;
		this.name = name;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Policy [no=" + no + ", name=" + name + "]";
	}
}
