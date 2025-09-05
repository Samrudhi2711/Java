package day2Lab1;

public class Product {
	private int proId;
	private String proName;
	private float price;

	public Product(int proId, String proName, float price) {
		this.proId = proId;
		this.proName = proName;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [proId=" + proId + ", proName=" + proName + ", price=" + price + "]";
	}

	public int getProId() {
		return this.proId;
	}

}
