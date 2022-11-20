package com.example.demo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.Daouser;
import com.example.demo.dao.Transaction;
import com.example.demo.model.Servermodel;
import com.example.demo.repository.Histroy;
import com.example.demo.repository.Serverrepository;

@Service
public class Services {
	
	@Autowired
	public Serverrepository repo;
	@Autowired
	public Histroy trans;
	
	public String adduser(Daouser user)
	{
		Servermodel model=new Servermodel();
		model.setUserid(user.getUserid());
		model.setPswd(user.getPswd());
		model.setName(user.getName());
		model.setAccno(user.getAccno());
		model.setBalance(user.getBalance());
		model.setDeposit(user.getDeposit());
		model.setPeriod(user.getPeriod());
		
		repo.save(model);
		return "added";
	}
	
	public Integer getbal(Integer accno)
	{
		Servermodel model=new Servermodel();
		Optional<Servermodel> list = repo.findById(accno);
		
		Servermodel sets=list.get();
		
		model.setBalance(sets.getBalance());
		
		return model.getBalance();		
	}
	public String deluser(Integer userid)
	{
		Optional<Servermodel> model=repo.findById(userid);
		
		if(model.isPresent())
		{
		Servermodel server=model.get();
		repo.delete(server);
		return "deleted";
		}
		
		return "No records";
		
	}
	public String Deposit(Daouser user)
	{
		Servermodel server=new Servermodel();
		Optional<Servermodel> lists=repo.findById(user.getUserid());
		if(lists.isPresent())
		{
			Servermodel model=lists.get();
			server.setUserid(model.getUserid());
			server.setPswd(model.getPswd());
			server.setAccno(model.getAccno());
			server.setName(model.getName());
			server.setBalance(model.getBalance()-user.getDeposit());
			server.setDeposit(user.getDeposit());
			server.setPeriod(user.getPeriod());
			repo.save(server);
			
			return "Deposited";
		}
		return "No record";
	}
	public String Transfer(Transaction tran)
	{
		Servermodel real=new Servermodel();
		Optional<Servermodel> user1=repo.findById(tran.getAccno1());
		if(user1.isPresent())
		{
			Servermodel model=user1.get();
			real.setUserid(tran.getAccno1());
			real.setAccno(model.getAccno());
			real.setPswd(model.getPswd());
			real.setDeposit(model.getDeposit());
			real.setName(model.getName());
			real.setPeriod(model.getPeriod());
			real.setBalance(model.getBalance()-tran.getAmount());
			repo.save(real);
		}
		else
		{
			System.out.print("No record");
		}
		Optional<Servermodel> user2=repo.findById(tran.getAccno2());
		if(user2.isPresent())
		{
			Servermodel model2=user2.get();
			real.setUserid(tran.getAccno2());
			real.setAccno(model2.getAccno());
			real.setPswd(model2.getPswd());
			real.setDeposit(model2.getDeposit());
			real.setName(model2.getName());
			real.setPeriod(model2.getPeriod());
			real.setBalance(model2.getBalance()+tran.getAmount());
			repo.save(real);
		}
		trans.save(tran);
		return "Transfer";
	}

}
