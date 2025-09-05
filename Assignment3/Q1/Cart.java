package com.cdac.store;

public class Cart {
	int itemsCount;
	float totalAmt;

	public Cart() {
		this.itemsCount = 0;
		this.totalAmt = 0;
	}

	void addToCart(Dessert d) {
		itemsCount += 1;
		totalAmt += d.calculatePrice();
	}

	void checkOut() {
		System.out.println("Thank You! Visit Again!!");
		System.out.println("Total Items Billed:" + this.itemsCount);
		System.out.println("Total Price:" + Math.round(this.totalAmt));
	}

}
