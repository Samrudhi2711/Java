package threads;

public class Account1 {
	private int balanace;

	public int getBalanace() {
		return balanace;
	}

	public void setBalanace(int balanace) {
		this.balanace = balanace;
	}

	public Account1(int balanace) {
		this.balanace = balanace;
	}

	@Override
	public String toString() {
		return "Account1 [balanace=" + balanace + "]";
	}
	

}
