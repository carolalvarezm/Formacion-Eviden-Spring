package es.a926666.IoCSpring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        //Creación del contexto mediante XML
    	  ClassPathXmlApplicationContext contexto= new ClassPathXmlApplicationContext("applicationContext.xml");
    	//Creación del contexto mediante Java Config
    	  AnnotationConfigApplicationContext contexto2= new AnnotationConfigApplicationContext(configuracion.class);
    	//Annotations
    	LibroInterface libro=contexto.getBean("ebook",LibroInterface.class);
    	LibroInterface libro2=contexto.getBean("ebook",LibroInterface.class);
    	LibroInterface libro3=contexto2.getBean("libroFisico",LibroInterface.class);
    	LibroInterface libro4=contexto2.getBean("libroFisico",LibroInterface.class);
    	//Singleton
    	System.out.println("Demostración Patrón Singleton"+"\n");
    	libro.pedirLibro(0);
    	libro2.pedirLibro(0);
    	libro.devolverLibro(0);
    	libro2.pedirLibro(0);
    	System.out.println("\n");
    	//Prototype
    	System.out.println("Demostración Patrón Prototype"+"\n");
    	libro3.pedirLibro(0);
    	libro4.pedirLibro(0);
    	libro3.devolverLibro(0);
    	libro4.pedirLibro(0);
    	System.out.println("\n");
    	
    	//Cerramos el contexto
    	contexto.close();
    	contexto2.close();
    }
}
