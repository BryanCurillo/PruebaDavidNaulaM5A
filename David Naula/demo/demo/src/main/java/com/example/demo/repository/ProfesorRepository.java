package com.example.demo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.demo.model.Profesor;



public interface ProfesorRepository extends MongoRepository<Profesor, Long>{

}
