package threads;

public class PrintJobMain {

	public static void main(String[] args) {
		int[] array = { 10, 20, 30, 40 };
		MyArray mArray = new MyArray(array);
		PrintJob pJob = new PrintJob(mArray);
		Thread t1 = new Thread(pJob);
		Thread t2 = new Thread(pJob);
		t1.setName("Thread 1");
		t2.setName("Thread 2");
		t1.start();
		t2.start();

	}

}
