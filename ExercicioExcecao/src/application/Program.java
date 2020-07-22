package application;

import java.util.Scanner;

import entities.Account;
import model.exceptions.DomainException;

public class Program {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		try {
		System.out.println("Enter account data: ");
		System.out.print("Number: ");
		int number = sc.nextInt();
		System.out.print("Holder: ");
		sc.nextLine();
		String holder=sc.nextLine();
		System.out.print("Balance: ");
		double balance=sc.nextDouble();
		System.out.print("Withdraw limit: ");
		double withDrawLimit=sc.nextDouble();
		Account account = new Account(number, holder, balance, withDrawLimit);

		System.out.print("Enter amount for withdraw: ");
		double withdrawAmount=sc.nextDouble();
		account.withDraw(withdrawAmount);
		System.out.println(account.getBalance());
		}
		catch (DomainException e) {
			System.out.println(e.getMessage());
		}
		
		
		sc.close();

	}

}
