package threads;

public class EvenOdd {
	int number;

	public EvenOdd() {
		this.number = 1;
	}

	public synchronized void printOdd() {
		if (number % 2 != 0) {
			System.out.println("Odd:" + number);
			number++;
			notifyAll();
		} else {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public synchronized void printEven() {
		if (number % 2 == 0) {
			System.out.println("Even:" + number);
			number++;
			notifyAll();
		} else {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
