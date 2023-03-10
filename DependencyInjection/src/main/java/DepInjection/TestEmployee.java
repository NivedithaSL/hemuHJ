package DepInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestEmployee {
	public static void main(String[] args) {
		//Employee employee= new Employee ("niharika","niharika@gmail.com");
//			employee.Printdetails();
			ApplicationContext applicationContext= new ClassPathXmlApplicationContext("ioc.xml");
			Employee employee =(Employee) applicationContext.getBean("Constructorinjection");
			employee.Printdetails();
		}
}
