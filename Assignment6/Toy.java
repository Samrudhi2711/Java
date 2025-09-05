package collectionsDemo;

public class Toy implements Comparable<Toy> {
	private int prodId;
	private String name;
	private double price;
	private String Category;
	private int age;
	private int purchase_month;
	private int purchase_year;

	public int getProdId() {
		return prodId;
	}

	public void setProdId(int prodId) {
		this.prodId = prodId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getCategory() {
		return Category;
	}

	public void setCategory(String category) {
		Category = category;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getPurchase_month() {
		return purchase_month;
	}

	public void setPurchase_month(int purchase_month) {
		this.purchase_month = purchase_month;
	}

	public int getPurchase_year() {
		return purchase_year;
	}

	public void setPurchase_year(int purchase_year) {
		this.purchase_year = purchase_year;
	}

	public Toy(int prodId, String name, double price, String category, int age, int purchase_month, int purchase_year) {
		super();
		this.prodId = prodId;
		this.name = name;
		this.price = price;
		Category = category;
		this.age = age;
		this.purchase_month = purchase_month;
		this.purchase_year = purchase_year;
	}

	@Override
	public String toString() {
		return "Toy [prodId=" + prodId + ", name=" + name + ", price=" + price + ", Category=" + Category + ", age="
				+ age + ", purchase_month=" + purchase_month + ", purchase_year=" + purchase_year + "]";
	}

	@Override
	public int compareTo(Toy o) {
		return Integer.compare(this.getProdId(), o.getProdId());
	}

}
