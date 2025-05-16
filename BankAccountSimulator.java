package javaPractice;

import java.util.Scanner;

public class BankAccountSimulator {

	private static int useracc;
	private static int userpin;
	private float balance;
	double amount;

	public BankAccountSimulator(int useracc, int userpin, float balance, double amount) {

		this.useracc = useracc;
		this.userpin = userpin;
		this.balance = balance;
		this.amount = amount;

	}

	public void deposit(double amount) {

		if (amount > 0) {
			balance += amount;
			System.out.println("The deposited amount" + amount);
			System.out.println("The total balance amount" + balance);
		} else {
			System.out.println("Invalid amount entered");
		}

	}

	public void withdraw(double amount) {

		if (amount > 100 && amount < balance) {
			balance -= amount;
			System.out.println("The withdrawn amount is" + amount);
			System.out.println("The total balance amount is" + balance);
		} else {
			System.out.println("Insufficient funds");
		}

	}

	public void checkBalance() {

		System.out.println("The balance amount is" + balance);

	}

	public static void main(String[] args) {

		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		BankAccountSimulator ban = new BankAccountSimulator(0, 0, 100000, 0);

		final int acctno = 567890;
		final int pinno = 2495;
		while (useracc != acctno || userpin != pinno) {

			System.out.println("Enter the account number");
			useracc = sc.nextInt();
			System.out.println("Enter the pin number");
			userpin = sc.nextInt();
			if (useracc != acctno || userpin != pinno) {
				System.out.println("You have entered wrong details");
				
			}
		}
			
			System.out.println("you have logged in successfully");
		    
		
		int choice;

		do {
			System.out.println("1. Deposit");
			System.out.println("2. Withdraw");
			System.out.println("3. CheckBalance");
			System.out.println("4. Exit");
			System.out.println("Enter the choice");
			choice = sc.nextInt();

			switch (choice) {
			case 1:
				System.out.println("Enter the amount to deposit");
				double dep = sc.nextFloat();
				ban.deposit(dep);
				break;
			case 2:
				System.out.println("Enter the amount to withdraw");
				double withdraw = sc.nextFloat();
				ban.withdraw(withdraw);
				break;
			case 3:
				ban.checkBalance();
				break;
			case 4:
				System.out.println("Thank you for banking with us!");
				break;
			default:
				System.out.println("Invalid option. Try again.");
			}

			
		

		} while (choice != 4);

		sc.close();

	}
}
