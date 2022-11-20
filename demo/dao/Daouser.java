package com.example.demo.dao;

public class Daouser {
	private Integer userid=null;
	private String pswd;
	private String name;
	private Integer accno;
	private Integer balance;
	private Integer deposit;
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
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAccno() {
		return accno;
	}
	public void setAccno(Integer accno) {
		this.accno = accno;
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
	public Daouser(Integer userid, String pswd, String name, Integer accno, Integer balance, Integer deposit,
			Integer period) {
		super();
		this.userid = userid;
		this.pswd = pswd;
		this.name = name;
		this.accno = accno;
		this.balance = balance;
		this.deposit = deposit;
		this.period = period;
	}
	public Daouser() {
		super();
	}
	
	

}
