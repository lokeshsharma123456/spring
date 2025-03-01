package com.sharma.vehicle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;

public class Car implements Vehicle {

	public Car(DiscountService ds) {
		// TODO Auto-generated constructor stub
		this.discountService = ds;
	}
	@Value("${car.mrp}")
	private int mrp;
	@Override
	public int getMrp() {
		// TODO Auto-generated method stub
		return this.mrp;
	}
//	@Autowired
//	@Qualifier("festivalDiscountImpl")
	DiscountService discountService;
	
	@Override
	public String getDiscount() {
		// TODO Auto-generated method stub
		return this.discountService.getDiscount();
	}

}
