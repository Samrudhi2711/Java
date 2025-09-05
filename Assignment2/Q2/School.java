package day2Lab1;

public class School {

	public static void main(String[] args) {
		int[] marks = { 75, 80, 88, 91, 67, 62 };
		Student s1 = new Student(1234, "Student01", marks);
		System.out.println(s1);
		System.out.println("Average:" + s1.calcAverage());
		System.out.println("Percentage:" + s1.calcPercentage());

	}

}
