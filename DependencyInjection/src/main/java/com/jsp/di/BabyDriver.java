package com.jsp.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BabyDriver {
public static void main(String[] args) {
	ApplicationContext applicationContext=new AnnotationConfigApplicationContext(Config.class);
	Baby baby=(Baby) applicationContext.getBean("baby");
//(or)	Baby baby=applicationContext.getBean(Baby.class);
	baby.open();
}
	
}
