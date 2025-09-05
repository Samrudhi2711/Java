package exception.wrapper.strings;
public abstract class Account {
	protected long acctNo;
	protected String name;
	protected double balance;

//Parameter Constructor
	public Account(long acctNo, String name, double balance) {
		this.acctNo = acctNo;
		this.name = name;
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "Account [acctNo=" + acctNo + ", name=" + name + ", balance=" + balance + "]";
	}

	public abstract boolean deposit(double amount) throws MinimumDepositException;

	public abstract boolean withdraw(double amount) throws LowBalanceException,MaxWithdrawException;

}
