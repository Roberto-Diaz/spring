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
		
		Ciudad ciu = (Ciudad)appContext.getBean("ciudad");

		System.out.println(per.getApodo()); 
		System.out.println(ciu.getNombre()); 
	
		
		//Importante hacer el cierre de configuración del flujo, para poder destruir los bean. 
		((ConfigurableApplicationContext)appContext).close();
		
	}

}
