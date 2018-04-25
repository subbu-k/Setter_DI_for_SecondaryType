package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.Car;
import beans.Engine;

public class Client {
public static void main(String[] args) {
	ApplicationContext ap= new ClassPathXmlApplicationContext("resource/Spring.xml");
	Car c= (Car)ap.getBean("car");
	System.out.println("xml setter ID");
	c.printDate();
	System.out.println("-------------------------------");
	System.out.println("java setter ID");
	c.setCarName("Bullaro");
	Engine e=(Engine)ap.getBean("engine");
	e.setModel("B2k18");
	c.setEngine(e);
	c.printDate();
	
	Car c1= (Car)ap.getBean("car1");
	
	System.out.println("-------------------------------");
	System.out.println("xml  Inner bean setter ID");
	c1.printDate();
	System.out.println("-------------------------------");
	
}
}
