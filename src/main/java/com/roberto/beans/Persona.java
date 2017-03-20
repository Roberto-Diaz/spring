package com.roberto.beans;

public class Persona {

	private int id;
	private String nombre;
	private String apodo;
	private Pais pais;
	
	private void init(){
		System.out.println("Antes de inicializar");
	}
	
	private void destroy(){
		System.out.print("Bean a punto de ser destruido");
	}
	
	public Pais getPais() {
		return pais;
	}
	public void setPais(Pais pais) {
		this.pais = pais;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApodo() {
		return apodo;
	}
	public void setApodo(String apodo) {
		this.apodo = apodo;
	}
	
	

	
	
}
