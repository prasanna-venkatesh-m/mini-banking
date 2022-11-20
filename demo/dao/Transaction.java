package com.example.demo.dao;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="histroy")
public class Transaction {
	@Id
	@Column(name="accno1")
	private Integer accno1;
	@Column(name="accno2")
	private Integer accno2;
	@Column(name="amount")
	private Integer amount;
	public Integer getAccno1() {
		return accno1;
	}
	public void setAccno1(Integer accno1) {
		this.accno1 = accno1;
	}
	public Integer getAccno2() {
		return accno2;
	}
	public void setAccno2(Integer accno2) {
		this.accno2 = accno2;
	}
	public Integer getAmount() {
		return amount;
	}
	public void setAmount(Integer amount) {
		this.amount = amount;
	}
	public Transaction(Integer accno1, Integer accno2, Integer amount) {
		super();
		this.accno1 = accno1;
		this.accno2 = accno2;
		this.amount = amount;
	}
	public Transaction() {
		super();
	}
	
	

}
