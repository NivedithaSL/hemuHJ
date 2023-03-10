package com.jsp.di;

import org.springframework.stereotype.Component;

@Component
public class Vanila implements Icecream {

	public void eating() {
		
		System.out.println(" Vanila icecream ");
	}
}
