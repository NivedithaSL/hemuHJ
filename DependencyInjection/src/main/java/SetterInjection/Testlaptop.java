package SetterInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Testlaptop {
public static void main(String[] args) {
	ApplicationContext  applicationContext=new ClassPathXmlApplicationContext("SI.xml");
	Laptop laptop=(Laptop) applicationContext.getBean("SetInj");
	laptop.Printdetails();
}
}
