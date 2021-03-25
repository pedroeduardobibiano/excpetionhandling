package application;

import java.util.Locale;
import java.util.Scanner;

import model.entities.Account;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter account data");

		System.out.println("Number: ");
		int number = sc.nextInt();
		System.out.println("Holder: ");
		String holder = sc.nextLine();
		System.out.println("initial balance: ");
		Double initialBalance = sc.nextDouble();
		System.out.println("Withdraw limit: ");
		Double withdrawlimit = sc.nextDouble();
		Account ac = new Account(number, holder, initialBalance, withdrawlimit);

		System.out.println("Enter amount withdraw: ");
		Double enterAmount = sc.nextDouble();
		System.out.println("New balance: ");

		sc.close();
	}

}
