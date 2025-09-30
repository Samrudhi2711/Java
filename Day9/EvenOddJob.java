package threads;

public class EvenOddJob {
	public static void main(String[] args) {
		EvenOdd evenOdd = new EvenOdd();
		Thread odd = new Thread(new Runnable() {
			@Override
			public void run() {
				for (int i = 0; i <= 15; i++) {
					evenOdd.printOdd();
				}
			}
		});

		Thread even = new Thread(new Runnable() {
			@Override
			public void run() {
				for (int i = 0; i <= 15; i++) {
					evenOdd.printEven();
				}
			}
		});

		odd.start();
		even.start();

	}

}
