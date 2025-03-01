package com.sharma.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;

import com.sharma.vehicle.Car;
import com.sharma.vehicle.DiscountService;
import com.sharma.vehicle.FestivalDiscountImpl;
import com.sharma.vehicle.Vehicle;

@org.springframework.context.annotation.Configuration
@ComponentScan("com.sharma.vehicle")
@PropertySource("application.properties")
public class Config {
	
	@Bean
	public Vehicle carr() {
		Car obj = new Car(ds());
		return obj;
	}
	
	public DiscountService ds() {
		FestivalDiscountImpl fsi = new FestivalDiscountImpl();
		return fsi;
	}
}
