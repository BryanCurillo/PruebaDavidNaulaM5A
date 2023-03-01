package com.example.demo.model;

import java.util.List;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;


@Document(collection="Departamento")
@Data
public class Departamento {
	private long id;
	private String nombre;
	private String director;
	private String descripcion;
	private Profesor profesor;
    private List<Profesor> listprofesor;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public Profesor getProfesor() {
		return profesor;
	}
	public void setProfesor(Profesor profesor) {
		this.profesor = profesor;
	}
	public List<Profesor> getListprofesor() {
		return listprofesor;
	}
	public void setListprofesor(List<Profesor> listprofesor) {
		this.listprofesor = listprofesor;
	}
    
    

}
