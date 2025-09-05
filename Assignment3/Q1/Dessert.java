package com.cdac.store;

public abstract class Dessert {
	protected String name;
	protected int price;
	protected int qty;

	public Dessert(String name, int price, int qty) {
		super();
		this.name = name;
		this.price = price;
		this.qty = qty;
	}

	@Override
	public String toString() {
		return "Dessert [name=" + name + ", price=" + price + ", qty=" + qty + "]";
	}

	public abstract float calculatePrice();

}
