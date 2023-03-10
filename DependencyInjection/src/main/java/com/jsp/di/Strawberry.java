package com.jsp.di;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
@Primary
@Component
public class Strawberry implements Icecream {

	public void eating() {
	
			
			System.out.println(" stawberry icecream ");
		
	}
}
