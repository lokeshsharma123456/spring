package com.sharma.vehicles;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class myApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		Vehicle vehicle = context.getBean("myVehicleType", Vehicle.class);
		System.out.println(vehicle.getspeed());
		System.out.println(vehicle.getDiscount());
	}

}
