package application;

import java.util.Locale;
import java.util.Scanner;

import model.entities.Account;
import model.exception.Domain;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter account data ");

		System.out.print("Number: ");
		int number = sc.nextInt();
		System.out.print("Holder: ");
		String holder = sc.next();
		sc.nextLine();
		System.out.print("initial balance: ");
		Double initialBalance = sc.nextDouble();
		System.out.print("Withdraw limit: ");
		Double withdrawlimit = sc.nextDouble();
		Account ac = new Account(number, holder, initialBalance, withdrawlimit);

		System.out.println("");
		System.out.print("Enter amount for withdraw: ");
		Double amount = sc.nextDouble();

		try {
			ac.withdraw(amount);
			System.out.println("New balance " + String.format("%.2f", ac.getBalance()));
			//ou ----  System.out.print(ac); ---- \\
		} catch (Domain e) {
			System.out.print("withdraw error" + e.getMessage());
		}
		sc.close();
	}

}
