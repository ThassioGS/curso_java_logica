package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter account number: ");
		int acNumber = sc.nextInt();

		System.out.print("Enter account holder: ");
		sc.nextLine();
		String acHolder = sc.nextLine();

		Account ac = new Account(acNumber, acHolder);
		String aux;
		double balance = 0;
		do {

			System.out.print("Is there na initial deposit (y/n)?");
			aux = sc.nextLine();

		} while (!aux.contains("y") && !aux.contains("n"));

		if (aux.contains("y")) {

			System.out.print("Enter initial deposit value: ");
			balance = sc.nextDouble();
			ac = new Account(acNumber, acHolder, balance);

		}

		System.out.println();
		System.out.println("Account data:");
		System.out.println(ac);

		System.out.println();
		System.out.print("Enter a deposit value: ");
		balance = sc.nextDouble();
		ac.deposit(balance);

		System.out.println();
		System.out.println("Updated account data:");
		System.out.println(ac);

		System.out.println();
		System.out.print("Enter a withdraw value: ");
		balance = sc.nextDouble();
		ac.withdraw(balance);

		System.out.println();
		System.out.println("Updated account data:");
		System.out.println(ac);

		sc.close();
	}

}
