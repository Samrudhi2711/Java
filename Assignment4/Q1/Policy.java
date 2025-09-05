package day3Lab;

public class Policy {
	public static void main(String[] args) {
		Vehicle[] vehices = new Vehicle[2];
		vehices[0] = new TwoWheeler(123456789, "Hero HOnda", "Splender", 105000f);
		vehices[1] = new FourWheeler(222345679, "maruti", "baleno", 115000f);

		System.out.println(vehices[0]);
		System.out.println("Insurance for TwoWheeler :" + vehices[0].calInsurance());
		System.out.println(vehices[1]);
		System.out.println("Insurance for FourWheeler :" + vehices[1].calInsurance());

	}

}
