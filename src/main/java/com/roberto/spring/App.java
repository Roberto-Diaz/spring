package com.roberto.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.roberto.beans.AppConfig;
import com.roberto.beans.AppConfig2;
import com.roberto.beans.Ciudad;
import com.roberto.beans.Mundo;
import com.roberto.beans.Persona;

public class App {

	public static void main(String[] args) {
		
		ApplicationContext appContext = new ClassPathXmlApplicationContext("com/roberto/xml/beans.xml");
		Persona per = (Persona) appContext.getBean("referenciaPersonaBean2");

		String nombreCiudades ="";
		
		for (Ciudad c : per.getPais().getCiudades()) {
			nombreCiudades += c.getNombre()+" - ";		
		}
		
		System.out.println(per.getId()+ " "+ per.getNombre()+ " "+ per.getApodo()+ " " 
		+ per.getPais().getNombre()+" "+nombreCiudades); 
	
		
		
		((ConfigurableApplicationContext)appContext).close();
		
	}

}
