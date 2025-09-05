package exception.wrapper.strings;

import java.util.Scanner;

public class TransactionSavings {

	public static void main(String[] args) {
		long actNo = 0;
		String actName = null;
		double actBalance = 0;
		double deposit = 0;
		double withdraw = 0;
		Savings savings = null;
		boolean isValidInput;
		String tempInput;
		System.out.println("*** EXCEPTIONS (SYSTEM & USER DEFINED EXCEPTION HANDLING ******");
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Creating New Savings Account");
			System.out.println("Enter Account No:");
			/* Check for valid AcNo */
			tempInput = sc.next();
			try {
				actNo = Long.parseLong(tempInput);
				isValidInput = true;
			} catch (NumberFormatException e) {
				System.out.println("SYSTEM EXCEPTION: Invalid Input for Account No:" + tempInput);
				System.out.println("Account Number Must Contain only numbers");
				isValidInput = false;
			}
			/* Check for Name */
			if (isValidInput) {
				System.out.println("Enter Account Name:");
				actName = sc.next();
				System.out.println("Enter Account Balance:");
				tempInput = sc.next();
				try {
					actBalance = Double.parseDouble(tempInput);
				} catch (NumberFormatException e) {
					System.out.println("Invalid Input for Balance:" + tempInput);
					System.out.println("Balance Must contain numbers or decimal point");
					isValidInput = false;
				}

			}

			if (isValidInput) {
				savings = new Savings(actNo, actName, actBalance);
				System.out.println(savings);
				System.out.println("Enter Amount to deposit:");
				tempInput = sc.next();
				try {
					deposit = Double.parseDouble(tempInput);
				} catch (NumberFormatException e) {
					System.out.println("Invalid Input for Depost Amt:" + tempInput);
					System.out.println("Deposit Amt Must contain numbers or decimal point");
					isValidInput = false;
				}
				if (isValidInput) {
					savings.deposit(deposit);
					System.out.println("Enter Amount to Withdraw:");
					tempInput = sc.next();
					try {
						withdraw = Double.parseDouble(tempInput);
					} catch (NumberFormatException e) {
						System.out.println("Invalid Input for Withdraw Amt:" + tempInput);
						System.out.println("Withdraw Amt Must contain numbers or decimal point");
						isValidInput = false;
					}
					if (isValidInput)
						try {
							savings.withdraw(withdraw);
						} catch (LowBalanceException e) {
							System.out.println("User Defined Exception:" + e.getMessage());
							// e.printStackTrace();
						}
				}

			}
		} while (!isValidInput);
		sc.close();
		System.out.println("*** PROGRAM COMPLETED ******");

	}
}
