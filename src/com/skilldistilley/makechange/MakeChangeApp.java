package com.skilldistilley.makechange;

import java.util.Scanner;

public class MakeChangeApp {

	static Scanner kb;
	
	public static void main(String[] args) {
		kb = new Scanner(System.in);
		double itemPrice = 0;
		double moneyGiven = 0;
		
		itemCost();
		moneyTendered();
		
		kb.close();
	}
	
	public static double itemCost() {
		System.out.print("How much does the item cost? $");
		double itemPrice = kb.nextDouble();
		return itemPrice;
	}
	public static double moneyTendered() {
		System.out.print("How much are you paying with? $");
		double moneyGiven = kb.nextDouble();
		return moneyGiven;
	}

}
