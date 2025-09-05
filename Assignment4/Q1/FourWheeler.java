package day3Lab;

/*public class FourWheeler extends Vehicle {
	// Parameter Constructor
	public FourWheeler(long regNo, String companyName, String model, float price) {
		super(regNo, companyName, model, price);
	}

	@Override
	public float calculateInsurance() {
		return (float) ((10 * price) / 100);

	}

}*/

public class FourWheeler extends Vehicle {

	public FourWheeler(long rNo, String cName, String mName, float price) {
		super(rNo, cName, mName, price);

	}

	public float calInsurance() {
		return (float) (price * 0.1);
	}
}
