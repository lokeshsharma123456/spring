package com.sharma.component.vehicle;

import org.springframework.stereotype.Component;

@Component("myCar")
public class Car implements Vehicle {

	@Override
	public String getBrand() {
		// TODO Auto-generated method stub
		return "Honda";
	}
	
	
}
