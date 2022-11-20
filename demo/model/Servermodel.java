package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="server")
public class Servermodel {
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	@Column(name="userid")
	private Integer userid=2;
	@Column(name="pswd")
	private String pswd;
	@Column(name="accno")
	private Integer accno;
	@Column(name="name")
	private String name;
	@Column(name="balance")
	private Integer balance;
	@Column(name="deposit")
	private Integer deposit;
	@Column(name="period")
	private Integer period;
	public Integer getUserid() {
		return userid;
	}
	public void setUserid(Integer userid) {
		this.userid = userid;
	}
	public String getPswd() {
		return pswd;
	}
	public void setPswd(String pswd) {
		this.pswd = pswd;
	}
	public Integer getAccno() {
		return accno;
	}
	public void setAccno(Integer accno) {
		this.accno = accno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getBalance() {
		return balance;
	}
	public void setBalance(Integer balance) {
		this.balance = balance;
	}
	public Integer getDeposit() {
		return deposit;
	}
	public void setDeposit(Integer deposit) {
		this.deposit = deposit;
	}
	public Integer getPeriod() {
		return period;
	}
	public void setPeriod(Integer period) {
		this.period = period;
	}
	public Servermodel(Integer userid, String pswd, Integer accno, String name, Integer balance, Integer deposit,
			Integer period) {
		super();
		this.userid = userid;
		this.pswd = pswd;
		this.accno = accno;
		this.name = name;
		this.balance = balance;
		this.deposit = deposit;
		this.period = period;
	}
	public Servermodel() {
		super();
	}
	
	
	
	
}
