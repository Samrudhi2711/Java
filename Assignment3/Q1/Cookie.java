package com.cdac.store;

public class Cookie extends Dessert {

	public Cookie(String name, int price, int qty) {
		super(name, price, qty);
	}

	@Override
	public String toString() {
		return super.toString();
	}

	@Override
	public float calculatePrice() {
		return (float) qty * price / 12;
	}

}
