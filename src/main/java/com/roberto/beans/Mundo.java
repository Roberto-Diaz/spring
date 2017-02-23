package com.roberto.beans;

import org.springframework.beans.factory.annotation.Value;

public class Mundo {
//para agregar un valor del componente por defecto, cuando no se utiliza el XML
	@Value("Hola mundo2")
	
	
	private String saludo;

//	alt + shif + s para mostrar el menu contextual de las acciones
	
	public String getSaludo() {
		return saludo;
	}

	public void setSaludo(String saludo) {
		this.saludo = saludo;
	}
	
	
	
}
