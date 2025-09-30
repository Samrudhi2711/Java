package threads;

public class AccountJob {
	Account1 acc;

	public AccountJob(Account1 acc) {
		this.acc = acc;
	}

	public synchronized void deposit(int amount) {
		acc.setBalanace(acc.getBalanace() + amount);
		notifyAll();
		System.out.println("Deposit Successful. acc: " + acc);
	}

	public synchronized void withdraw(int amount) {
		while (acc.getBalanace() < amount) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		acc.setBalanace(acc.getBalanace() - amount);
		notifyAll();
		System.out.println("Withdraw Successful. acc: " + acc);
	}

}
