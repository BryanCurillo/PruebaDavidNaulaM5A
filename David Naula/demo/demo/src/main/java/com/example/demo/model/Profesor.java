package com.example.demo.model;

import java.util.List;

import org.springframework.data.mongodb.core.mapping.Document;



import lombok.Data;
import lombok.Getter;
import lombok.Setter;


@Document(collection="Profesor")
@Data
public class Profesor {
	
	private long Id;
	private String Iddepartamento;
	private String nombre;
	private String direccion;
	private String telefono;
	
	private Curso curso;
    private List<Curso> listCurso;
	public long getId() {
		return Id;
	}
	public void setId(long id) {
		Id = id;
	}
	public String getIddepartamento() {
		return Iddepartamento;
	}
	public void setIddepartamento(String iddepartamento) {
		Iddepartamento = iddepartamento;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public Curso getCurso() {
		return curso;
	}
	public void setCurso(Curso curso) {
		this.curso = curso;
	}
	public List<Curso> getListCurso() {
		return listCurso;
	}
	public void setListCurso(List<Curso> listCurso) {
		this.listCurso = listCurso;
	}
    
    
	
	

}
