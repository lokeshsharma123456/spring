package com.sharma.vehicles;

public class Bus implements Vehicle {
	
	DiscountService discountService;
	
	
	public void setDiscountService(DiscountService discountService) {
		this.discountService = discountService;
	}

	public Bus(DiscountService discountService) {
		super();
		this.discountService = discountService;
	}

	@Override
	public String getspeed() {
		// TODO Auto-generated method stub
		return "20kmph";
	}

	@Override
	public String getDiscount() {
		// TODO Auto-generated method stub
		return "Bus:" + this.discountService.getDiscount();
	}

}
