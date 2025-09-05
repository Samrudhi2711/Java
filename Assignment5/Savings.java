package exception.wrapper.strings;

public class Savings extends Account {
	// Parameter Constructor
	public Savings(long acctNo, String name, double balance) {
		super(acctNo, name, balance);
	}

	@Override
	public boolean deposit(double amount) {
		boolean isSuccess;
		balance += amount;
		System.out.println("Amount:" + amount + " Deposited Successfully!");
		System.out.println("Total Savings Balance:" + balance);
		isSuccess = true;
		return isSuccess;

	}

	@Override
	public boolean withdraw(double amount) throws LowBalanceException {
		boolean isSuccess;
		if (amount > balance) {
			System.out.println("Amount:" + amount + " Exceeds balance");
			System.out.println("Total Savings Balance:" + balance);
			isSuccess = false;
			throw new LowBalanceException("Low Balance Exception");
		} else {

			if (balance < 10000) {
				balance -= (amount + 500);
				System.out.println("Amount: + Fee (500):" + (amount + 500) + " Withdrawn Successfully!");
				System.out.println("Total Savings Balance:" + balance);
				isSuccess = true;
			} else {
				balance -= amount;
				System.out.println("Amount:" + amount + " Withdrawn Successfully!");
				System.out.println("Total Savings Balance:" + balance);
				isSuccess = true;
			}
		}
		return isSuccess;
	}

}