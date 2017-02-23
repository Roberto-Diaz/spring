package com.roberto.beans;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;

//importar la anotación configuration
@Configurable
public class AppConfig {

//para que sepa spring cual es el beans utilizado se importa el paquete
	@Bean
	
	public Mundo mundo(){
		return new Mundo();
	}
	
}
