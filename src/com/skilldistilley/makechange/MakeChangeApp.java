package com.skilldistilley.makechange;

import java.util.Scanner;

public class MakeChangeApp {

	static Scanner kb;

	public static void main(String[] args) {
		kb = new Scanner(System.in);
		int price, cash, change;
//		String choice = "";
		boolean newTransaction = true;

		do {
			System.out.print("How much does the item cost? $");
			price = (int) ((kb.nextDouble() * 100)+0.001);
			System.out.print("How much are you paying with? $");
			cash = (int) ((kb.nextDouble() * 100)+0.001);
			kb.nextLine();
			
			if (cash > price) {
				change = cash - price;
//				System.out.println(change);
				double change1 = (double) change;
				change1 /= 100;

				System.out.printf("Your change is $%5.2f%n",change1);

				int twenties = change / 2000;
				if (twenties > 0) {
					change %= 2000;
					System.out.println(twenties + " $20 bill(s)");
				}
				int tens = change / 1000;
				if (tens > 0) {
					change %= 1000;
					System.out.println(tens + " $10 bill(s)");
				}
				int fives = change / 500;
				if (fives > 0) {
					change %= 500;
					System.out.println(fives + " $5 bill(s)");
				}
				int ones = change / 100;
				if (ones > 0) {
					change %= 100;
					System.out.println(ones + " $1 bill(s)");
				}
				int quarters = change / 25;
				if (quarters > 0) {
					change %= 25;
					System.out.println(quarters + " quarter(s)");
				}
				int dimes = change / 10;
				if (dimes > 0) {
					change %= 10;
					System.out.println(dimes + " dime(s)");
				}
				int nickels = change / 5;
				if (nickels > 0) {
					change %= 5;
					System.out.println(nickels + " nickel(s)");
				}
				int pennies = change;
				System.out.println(pennies + " penny coin(s)");
			}
			if (cash < price) {
				System.out.println("Not enough money!");
			} else if (cash == price) {
				System.out.println("No change is necessary!");
			}
			System.out.println("Do you want to go again (Y/N)?" );
			String continueLoopString = kb.nextLine();
			if (continueLoopString.equalsIgnoreCase("Y")) {
				newTransaction = true;
			}
			else if (continueLoopString.equalsIgnoreCase("N")) {
				newTransaction = false;
				kb.nextLine();
			}
			
		} while (newTransaction);
		kb.close();
	}
}
