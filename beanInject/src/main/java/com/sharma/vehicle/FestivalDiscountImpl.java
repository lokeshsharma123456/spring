package com.sharma.vehicle;

import org.springframework.stereotype.Component;

public class FestivalDiscountImpl implements DiscountService {

	@Override
	public String getDiscount() {
		// TODO Auto-generated method stub
		return "Festival";
	}

}
