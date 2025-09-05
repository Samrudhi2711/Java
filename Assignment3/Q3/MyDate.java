public class MyDate {
	private int DD;
	private int MM;
	private int YYYY;

	public MyDate(int dD, int mM, int yYYY) {
		this.DD = dD;
		this.MM = mM;
		this.YYYY = yYYY;
	}

	@Override
	public String toString() {
		return "MyDate [DD=" + DD + ", MM=" + MM + ", YYYY=" + YYYY + "]";
	}
	

}
