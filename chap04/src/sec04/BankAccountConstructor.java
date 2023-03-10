package sec04;

public class BankAccountConstructor {

	public static void main(String[] args) {
		BankAccount yoon = new BankAccount("12-34-89", "990990-9090990", 10000);
		BankAccount park = new BankAccount("33-55-09", "770088-5959007", 10000);

		yoon.deposit(5000);
		park.deposit(5000);

		yoon.withdraw(2000);
		park.withdraw(5000);

		yoon.checkMyBalance();
		park.checkMyBalance();

		yoon.printMyAccount();
		park.printMyAccount();
	}
}
