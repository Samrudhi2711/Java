package day3Lab;

/*public class TwoWheeler extends Vehicle {
	// Parameter Constructor
	public TwoWheeler(long regNo, String companyName, String model, float price) {
		super(regNo, companyName, model, price);
	}

	@Override
	public float calculateInsurance() {
		return (float) ((5 * price) / 100);

	}

}*/

public class TwoWheeler extends Vehicle {

	public TwoWheeler(long rNo, String cName, String mName, float price) {
		super(rNo, cName, mName, price);

	}

	public float calInsurance() {
		return (float) (price * 0.05);
	}
}
