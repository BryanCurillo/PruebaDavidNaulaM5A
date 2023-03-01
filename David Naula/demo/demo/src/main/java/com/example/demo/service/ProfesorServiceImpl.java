package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.example.demo.model.Profesor;
import com.example.demo.repository.ProfesorRepository;


@Service
public class ProfesorServiceImpl  extends GenericServiceImpl<Profesor, Long> implements ProfesorService{

	
	@Autowired
    ProfesorRepository proferepository;
	@Override
	public CrudRepository<Profesor, Long> getDao() {
		// TODO Auto-generated method stub
		return null;
	}

	

}
