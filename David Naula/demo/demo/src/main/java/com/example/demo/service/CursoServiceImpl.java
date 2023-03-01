package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.example.demo.model.Curso;
import com.example.demo.repository.CursoRepository;
import com.example.demo.repository.ProfesorRepository;

@Service
public class CursoServiceImpl extends GenericServiceImpl<Curso, Long> implements CursoService  {

	
	@Autowired
    CursoRepository cursorepository;
	@Override
	public CrudRepository<Curso, Long> getDao() {
		// TODO Auto-generated method stub
		return null;
	}

}
