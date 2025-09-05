package exception.wrapper.strings;

public class Current extends Account {
	// Parameter Constructor
	public Current(long acctNo, String name, double balance) {
		super(acctNo, name, balance);
	}

	@Override
	public boolean deposit(double amount) throws MinimumDepositException  {
		boolean isSuccess;
		if (amount < 50) {
			System.out.println("Amount:" + amount + " doesn't meet minimum amount of 50");
			System.out.println("Total Current Balance:" + balance);
			isSuccess = false;
			throw new MinimumDepositException("MinimumDepositException:Deposit Amount doesn't meet min of 50");
		} else {

			balance += amount;
			System.out.println("Amount:" + amount + " Deposited Successfully!");
			System.out.println("Total Current Balance:" + balance);
			isSuccess = true;
		}
		return isSuccess;

	}

	@Override
	public boolean withdraw(double amount) throws LowBalanceException,MaxWithdrawException {
		boolean isSuccess;
		if (amount > balance) {
			System.out.println("Amount:" + amount + " Exceeds balance");
			System.out.println("Total Savings Balance:" + balance);
			isSuccess = false;
			throw new LowBalanceException("Low Balance Exception");
		} else {
			if (amount > 50000) {
				System.out.println("Amount:" + amount + " Exceeds maximum withdrawl of 50,000");
				System.out.println("Total Current Balance:" + balance);
				isSuccess = false;
				throw new MaxWithdrawException("Exceeds Maximum withdrawl of 50,000");
			} else {
				balance -= amount;
				System.out.println("Amount:" + amount + " Withdrawn Successfully!");
				System.out.println("Total Current Balance:" + balance);
				isSuccess = true;
			}
		}
		return isSuccess;
	}
}
