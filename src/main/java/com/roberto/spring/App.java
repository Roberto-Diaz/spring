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
//		Si el contexto estubiera en el mismo paquete no fuera necesario escribir la ruta		
		//ApplicationContext appContext = new ClassPathXmlApplicationContext("com/roberto/xml/beans.xml");
		
//		Forma 1 de llamar las anotaciones con varias configuraciones - Configuracion con anotaciones -
		//ApplicationContext appContext = new AnnotationConfigApplicationContext(AppConfig.class, AppConfig2.class);
		
		AnnotationConfigApplicationContext appContext= new AnnotationConfigApplicationContext();
		appContext.register(AppConfig.class);
		appContext.register(AppConfig2.class);
		appContext.refresh();
		
		Mundo m = (Mundo) appContext.getBean("marte");
		
		System.out.println(m.getSaludo());
		
//		la siguiente line permite liberar recursos
		((ConfigurableApplicationContext)appContext).close();
		
//		Ejemplo con la clase Persona - Inyeccion por Constructor -
		
		ApplicationContext appContext2 = new ClassPathXmlApplicationContext("com/roberto/xml/beans.xml");
		Persona per = (Persona) appContext2.getBean("persona");
		System.out.println(per.getId()+ " "+ per.getNombre()+ " "+ per.getApodo());
		
		((ConfigurableApplicationContext)appContext2).close();
		
	}

}
