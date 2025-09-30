package threads;

public class MyArray {
	int[] array;

	MyArray(int[] array) {
		this.array = array;
	}

	public synchronized void printArray() {
		System.out.print(Thread.currentThread().getName() + " : ");
		for (int i = 0; i < array.length; i++) {
			if (i == array.length - 1)
				System.out.print(array[i]);
			else
				System.out.print(array[i] + ",");
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println();

	}

}
