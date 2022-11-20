package com.example.demo.controller;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.Daouser;
import com.example.demo.dao.ROI;
import com.example.demo.dao.Transaction;
import com.example.demo.model.Servermodel;
import com.example.demo.service.Services;

@RestController
public class Servercontroller {
	
	@Autowired
	public Services serve;
	
	@PostMapping("/add")
	public String adduser(@RequestBody Daouser users)
	{
		System.out.print("Ok");
		return serve.adduser(users);
	}
	
	@GetMapping("/balance/{accno}")
	public Integer getbal(@PathVariable Integer accno)
	{
		return serve.getbal(accno);
	}
	
	@PutMapping("/update")
	public String updateuser(@RequestBody Daouser users)
	{
		System.out.print("Ok");
		return serve.adduser(users);
	}
	
	@DeleteMapping("/delete/{userid}")
	public String delete(@PathVariable Integer userid)
	{
		return serve.deluser(userid);
	}
	
	@PutMapping("/transfer")
	public String updateuser(@RequestBody Transaction tran)
	{
		return serve.Transfer(tran);
	}
	
	@PutMapping("/deposit")
	public String Deposit(@RequestBody Daouser user)
	{
		return serve.Deposit(user);
	}
	
	@PostMapping("/roi")
	public String getroi(@RequestBody ROI rr)
	{
		ROI r=new ROI();
		r.setAmount(rr.getAmount());
		String s="Interest="+r.calculate(rr.getAmount(), rr.getPeriod())+", ROI="+r.roi(rr.getPeriod());
		return s;
		
	}
	
	
	
}
