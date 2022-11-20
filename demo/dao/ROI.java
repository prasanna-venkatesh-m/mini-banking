package com.example.demo.dao;

public class ROI {
	private Integer amount;
	private Integer period;
	
	public Integer getAmount() {
		return amount;
	}
	public void setAmount(Integer amount) {
		this.amount = amount;
	}
	public Integer getPeriod() {
		return period;
	}
	public void setPeriod(Integer period) {
		this.period = period;
	}
	public Integer calculate(Integer amount,Integer period)
	{
		return (amount*(roi(period))/100);
	}
	public Integer roi(Integer period)
	{
		if(period==12)
			return 5;
		
		if(period==24)
			return 6;
		
		return 0;
	}

}
