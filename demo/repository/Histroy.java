package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.dao.Transaction;

@Repository
public interface Histroy extends CrudRepository<Transaction, Integer>{
		
}
