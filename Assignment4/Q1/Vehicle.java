package day3Lab;
/*
public abstract class Vehicle {
	protected long regNo;
	protected String companyName;
	protected String model;
	protected float price;

	// Parameter Constructor
	public Vehicle(long regNo, String companyName, String model, float price) {
		this.regNo = regNo;
		this.price = price;
		this.companyName = companyName;
		this.model = model;
	}

	public abstract float calculateInsurance();

	@Override
	public String toString() {
		return "Vehicle [regNo=" + regNo + ", companyName=" + companyName + ", model=" + model + ", price=" + price
				+ "]";
	}

}*/

public abstract class Vehicle {

	protected long rNo;
	protected String cName;
	protected String mName;
	protected float price;

	public Vehicle(long rNo, String cName, String mName, float price) {
		this.rNo = rNo;
		this.cName = cName;
		this.mName = mName;
		this.price = price;
	}

	public abstract float calInsurance();

	@Override
	public String toString() {
		return "Vehicle [rNo=" + rNo + ", cName=" + cName + ", mName=" + mName + ", price=" + price + "]";
	}

}
