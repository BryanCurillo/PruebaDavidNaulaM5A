package com.example.demo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.demo.model.Departamento;


public interface DepartamentoRepository extends MongoRepository<Departamento, Long>{

}
