package com.spring.jpa.SpringDataJPA.model;

import java.util.Date;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
@Table(name = "advisor_table")
public class Advisor {
	@Id
	@Column(name = "advisor_id")
	private Integer id;
	@Column(name = "advisor_name")
	private String name;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "policy_no")
	private Policy policy;
	@Temporal(TemporalType.DATE)
	@Column(name = "advisor_date")
	private Date date;

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Advisor(Integer id, String name, Policy policy, Date date) {
		super();
		this.id = id;
		this.name = name;
		this.policy = policy;
		this.date = date;
	}

	public Advisor() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Policy getPolicy() {
		return policy;
	}

	public void setPolicy(Policy policy) {
		this.policy = policy;
	}

	@Override
	public String toString() {
		return "Advisor [id=" + id + ", name=" + name + ", policy=" + policy + ", date=" + date + "]";
	}
}
