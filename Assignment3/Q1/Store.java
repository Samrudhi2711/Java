package com.cdac.store;

import java.util.Scanner;

public class Store {

	public static void main(String[] args) {
		char choice;
		Cart cart = new Cart();
		Candy candy;
		IceCream ice;
		Cookie cookie;
		int price = 0;
		int qty = 0;
		System.out.println("****WELCOME TO CDAC DESSERT STORE******");
		System.out.println("Choose Option No(1,2,3,4) to Continue");
		Scanner sc = new Scanner(System.in);
		do {

			System.out.println("1:Candy");
			System.out.println("2.Cookie");
			System.out.println("3.IceCream");
			System.out.println("4.Checkout");
			choice = sc.next().charAt(0);
			// choice = takeChoice();
			switch (choice) {
			case '1':
				System.out.println("Enter Price for Candy: ");
				price = sc.nextInt();
				System.out.println("Enter Qty for Candy: ");
				qty = sc.nextInt();
				candy = new Candy("Candy", price, qty);
				cart.addToCart(candy);
				break;
			case '2':
				System.out.println("Enter Price for Cookie: ");
				price = sc.nextInt();
				System.out.println("Enter Qty for Cookie: ");
				qty = sc.nextInt();
				cookie = new Cookie("Cookie", price, qty);
				cart.addToCart(cookie);
				break;
			case '3':
				System.out.println("Enter Price for IceCream: ");
				price = sc.nextInt();
				System.out.println("Enter Qty for IceCream: ");
				qty = sc.nextInt();
				ice = new IceCream("IceCream", price, qty);
				cart.addToCart(ice);
				break;
			case '4':
				sc.close();
				cart.checkOut();
				break;
			default:
				System.out.println("Invalid Selection. Try Again!");
			}
		} while (choice != '4');

	}

}
