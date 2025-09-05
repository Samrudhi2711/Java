public class Calendar {
	private MyDate date;

	public Calendar(MyDate date) {
		this.date = date;
		System.out.println("Initialized date in calendar");
	}
	

	@Override
	public String toString() {
		return "Calendar [date=" + date + "]";
	}


	public static void main(String[] args) {
		MyDate dt = new MyDate(27, 8, 2025);
		Calendar c = new Calendar(dt);
		System.out.println(c);
	}

}