package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.dao.Transaction;
import com.example.demo.model.Servermodel;

@Repository
public interface Serverrepository extends CrudRepository<Servermodel, Integer>{
	
}

