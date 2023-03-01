package com.example.demo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.demo.model.Curso;



public interface CursoRepository extends MongoRepository<Curso, Long>{

}
