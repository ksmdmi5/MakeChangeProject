package com.skilldistilley.makechange;

import java.util.Scanner;

public class MakeChangeApp {

	static Scanner kb;

	public static void main(String[] args) {
		kb = new Scanner(System.in);
		double price = 0.00, change = 0.00;
		double cash = 0.00, change1 = 0.0; 
		int penny = 0, nickel ;
		int dime, quarter, dollar;
		int five, ten, twenty = 0;
		double pennyV = 0.01, nickelV = 0.05;
		double dimeV = 0.10, quarterV = 0.25;

		System.out.print("How much does the item cost? $");
		price = kb.nextDouble();

		System.out.print("How much are you paying with? $");
		cash = kb.nextDouble();

		change1 = cash - price;
		System.out.println("You're change is $"+change);
		
		twenty = (int) Math.floor(change - twenty / 20);

	    ten = (int) Math.floor((change - twenty * 20) / 10);

	    five = (int) Math.floor((change - twenty * 20 - ten * 10) / 5);

	    dollar = (int) Math.floor((change -twenty * 20 - ten * 10 - five * 5) / 1);

	    quarter = (int) Math.floor((change -  twenty * 20 - ten * 10 - five * 5 - dollar * 1)
	            / quarterV);

	    dime = (int) Math.floor((change - twenty * 20 - ten * 10 - five * 5 - dollar * 1 
	            - quarter * quarterV) / dimeV);

	    nickel = (int) Math.floor((change - twenty * 20 - ten * 10 - five * 5 - dollar * 1 
	            - quarter * quarterV - dime * dimeV) / nickelV);

	    penny = (int) Math.floor((change - twenty * 20 - ten * 10 - five * 5 - dollar * 1 
	            - quarter * quarterV - dime * dimeV - nickel * nickelV) / penny);
	    
	    
	    double remainder = change1; //make a copy of change variable so it remains final.
	    int count=0;
	    System.out.println("Your change is ");
	    if(remainder>=20){
	        twenty = (int)remainder/20;
	        remainder %= 20;
	        System.out.print(twenty+ " twenties, ");
	    }
	    if(remainder>=10){
	        ten = (int)remainder/10;
	        remainder %= 10;
	        System.out.println(ten+" tens, ");
	    }
	    if(remainder>=5){
	        five = (int)remainder/5;
	        remainder %= 5;
	        System.out.println(five+" fives, ");
	    }
	    if(remainder>=1) {
	    	dollar = (int)remainder/1;
	    		remainder %= 1;
	    		System.out.println(dollar+" ones, ");
	    }
		
	}

}
