package day2Lab1;

import java.util.Arrays;

public class Student {
	private int rollno;
	private String name;
	private int[] marks;

	Student(int rollno, String name, int[] marks) {
		this.rollno = rollno;
		this.name = name;
		this.marks = marks;

	}

	public int calcAverage() {
		int sum = 0;
		int average = 0;
		for (int m : marks) {
			sum += m;
		}
		average = sum / marks.length;
		return average;
	}

	public String calcPercentage() {

		int sum = 0;
		for (int m : marks) {
			sum += m;
		}
		return (double) sum / (marks.length * 100) * 100 + "%";

	}

	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", marks=" + Arrays.toString(marks) + "]";
	}

}
