package threads;

public class WithDrawAndDeposit {

	public static void main(String[] args) {
		Account1 acc = new Account1(1000);
		AccountJob accJob = new AccountJob(acc);
		Thread prod = new Thread(new Runnable() {

			@Override
			public void run() {
				for (int i = 0; i < 10; i++) {
					accJob.deposit(1000);
					try {
						Thread.sleep(2000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				System.out.println("Deposit Completed!");

			}
		});

		Thread cons = new Thread(new Runnable() {

			@Override
			public void run() {
				for (int i = 0; i < 5; i++) {
					accJob.withdraw(2000);
					try {
						Thread.sleep(2000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				System.out.println("withdraw Completed!");
			}
		});

		prod.start();
		cons.start();
	
	}
}