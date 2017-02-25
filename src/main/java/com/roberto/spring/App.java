package com.roberto.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.roberto.beans.AppConfig;
import com.roberto.beans.AppConfig2;
import com.roberto.beans.Mundo;
import com.roberto.beans.Persona;

public class App {

	public static void main(String[] args) {

//		Ejemplo con la clase Persona - Inyeccion de Objetos -
		
		ApplicationContext appContext = new ClassPathXmlApplicationContext("com/roberto/xml/beans.xml");
		Persona per = (Persona) appContext.getBean("persona");

//		En este print, se muestra el nombre del pais y la ciudad por medio de inyecciones de objetos
		System.out.println(per.getId()+ " "+ per.getNombre()+ " "+ per.getApodo()+ " " 
		+ per.getPais().getNombre()+" "+ per.getPais().getCiudad().getNombre()); 
	
		
		
		((ConfigurableApplicationContext)appContext).close();
		
	}

}
