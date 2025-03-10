package Vehicle.impl;

import Vehicle.Vehicle;
import discount.DiscountService;

public class Car implements Vehicle {
	
	private DiscountService discountService;
	
	public DiscountService getDiscountService() {
		return discountService;
	}

	public void setDiscountService(DiscountService discountService) {
		this.discountService = discountService;
	}

	private String brand;
	public void setBrand(String brand) {
		this.brand = brand;
	}

	
	public Car(DiscountService discountService) {
		super();
		this.discountService = discountService;
	}

	public Car() {
		super();
	}

	@Override
	public String getSpeed() {
		return null;
	}

	@Override
	public String getBrand() {
		return this.brand;
	}
	
	private Double mrp;
	
	public void setMrp(Double mrp) {
		this.mrp = mrp;
	}

	@Override
	public Double getMrp() {
		return this.mrp;
	}

	@Override
	public String getDiscount() {		
		return "Car : "  + this.discountService.getDiscount();
	}

}
