package com.cdac.store;

public class IceCream extends Dessert {

	public IceCream(String name, int price, int qty) {
		super(name, price, qty);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return super.toString();
	}

	@Override
	public float calculatePrice() {
		return (float) qty * price;
	}

}
