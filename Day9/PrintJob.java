package threads;

public class PrintJob implements Runnable {
	MyArray mArray;

	public PrintJob(MyArray mArray) {
		this.mArray = mArray;
	}

	@Override
	public void run() {
		mArray.printArray();

	}

}
