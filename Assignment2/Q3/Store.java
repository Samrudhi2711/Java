package day2Lab1;

public class Store {

	public static void main(String[] args) {
		Product[] products = new Product[5];
		products[0] = new Product(100, "Pen", 12.50f);
		products[1] = new Product(101, "Book", 112.5f);
		products[2] = new Product(102, "Pencile", 9.12f);
		products[3] = new Product(103, "bottle", 90.45f);
		products[4] = new Product(104, "WhiteBoard", 1200.23f);
		System.out.println("****************DISPLAY****************");
		display(products);
		System.out.println("****************SEARCH****************");
		int[] searchItems = { 104, 520, 60, 56 };
		for (int item : searchItems) {
			int idx = search(products, item);
			if (idx != -1) {
				System.out.println("Item ID:" + item + " Found! at " + idx + " Details below");
				System.out.println(products[idx]);
			} else {
				System.out.println("Item ID:" + item + " Not Found.");
			}
		}

	}

	public static void display(Product[] products) {
		for (Product i : products) {
			System.out.println(i);
		}

	}

	public static int search(Product[] products, int proId) {
		int idx = 0;
		for (Product i : products) {
			if (i.getProId() == proId)
				break;
			else
				idx += 1;

		}
		if (idx > products.length - 1)
			return -1;
		else
			return idx;

	}

}
