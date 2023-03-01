package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.example.demo.model.Departamento;
import com.example.demo.model.Profesor;
import com.example.demo.repository.CursoRepository;
import com.example.demo.repository.DepartamentoRepository;
@Service
public class DepartamentoServiceImpl extends GenericServiceImpl<Departamento, Long> implements DepartamentoService {

	
	@Autowired
    DepartamentoRepository departamentoRepository;
	@Override
	public CrudRepository<Departamento, Long> getDao() {
		// TODO Auto-generated method stub
		return null;
	}

}
