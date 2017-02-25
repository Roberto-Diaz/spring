package com.roberto.beans;

import java.util.List;

public class Pais {

	private String nombre;
//	Asociacion con una lista de ojetos
	private List<Ciudad> ciudades;
	

	public List<Ciudad> getCiudades() {
		return ciudades;
	}

	public void setCiudades(List<Ciudad> ciudades) {
		this.ciudades = ciudades;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	
}
