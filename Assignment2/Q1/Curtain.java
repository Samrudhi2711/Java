package day2Lab1;

public class Curtain {
	private boolean isOpen;

	Curtain() {
		isOpen = false;
	}

	public void close() {
			this.isOpen = false;
			System.out.println("Curtain Closed Successfully!");
	}

	public void open() {
			this.isOpen = true;
			System.out.println("Curtain Opened Successfully!");
	}
	public boolean isOpen() {
		return this.isOpen;
	}
	
}
