package com.skilldistillery.makechange;

import java.util.Scanner;

// 1) Calculates the amount of change returned to a customer.
// Based on the purchase price & amount tendered. (trust user vs. scanning at grocery store)
// 2) Notifies attendant (how many) of each 'type of currency' is needed to make change for the customer.  
// Change will be provided using combo of LARGEST bill & coin denominations as possible.
// *** Denominations that are NOT used will NOT be displayed ***

public class CashRegister {

	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		// Calling methods to prompt user input and store into price/tendered.
		askPrice();
		double trustPrice = scanner.nextDouble();
		askTendered();
		double trustTendered = scanner.nextDouble();

		if (trustPrice == trustTendered) {
			System.out.println("The customer has given you the correct amount.");
			System.out.println("Thank the customer for shopping with us."); // STOPS here if exact given.
		} else if (trustPrice > trustTendered) {
			System.out.println("ERROR - The customer has not given you enough money."); // STOPS here (error).
		} else {
			calcChange(trustTendered, trustPrice); // "if" change is due, calls calcChange
		}
		
		scanner.close();
		
	}

	// USER INPUT METHODS - These get called in main.
	public static void askPrice() {
		System.out.println("Ask the customer what the cost of the item is."); // Trusting the customer.

	}

	public static void askTendered() {
		System.out.println("How much money did the customer give you?");
	}

	// Calculates change IF -- PRICE < TENDERED
	public static void calcChange(double trustTendered, double trustPrice) {

		double tenderMinusPrice = roundedCoins(trustTendered - trustPrice);

		// Below: String.format = Ensures these values will always display 2 decimal
		// places.
		// %f -> floating -> decimal number (.2 = 2)
		System.out.println("Cost: $" + String.format("%.2f", trustPrice));
		System.out.println("Tendered: $" + String.format("%.2f", trustTendered));
		System.out.println("Change: $" + String.format("%.2f", tenderMinusPrice));

		calcBillsAndCoins(tenderMinusPrice);

	}

	public static void calcBillsAndCoins(double amount) {

		double remainingAmount = amount;
		// $20
		if (remainingAmount >= 20) {
			int counter = (int) (remainingAmount / 20);
			remainingAmount -= counter * 20;
			System.out.println("\t(" + counter + ") - $20");
		}
		// $10
		if (remainingAmount >= 10) {
			int counter = (int) (remainingAmount / 10);
			remainingAmount -= counter * 10;
			System.out.println("\t(" + counter + ") - $10");
		}
		// $5
		if (remainingAmount >= 5) {
			int counter = (int) (remainingAmount / 5);
			remainingAmount -= counter * 5;
			System.out.println("\t(" + counter + ") - $5");
		}
		// $1
		if (remainingAmount >= 1) {
			int counter = (int) remainingAmount;
			remainingAmount -= counter;
			System.out.println("\t(" + counter + ") - $1");
		}

		remainingAmount = roundedCoins(remainingAmount);

		// $0.25 - QUARTER
		if (remainingAmount >= 0.25) {
			int counter = (int) (remainingAmount / 0.25);
			remainingAmount -= counter * 0.25;
			System.out.println("\t(" + counter + ") - $0.25");
		}
		// $0.10 - DIME
		if (remainingAmount >= 0.10) {
			int counter = (int) (remainingAmount / 0.10);
			remainingAmount -= counter * 0.10;
			System.out.println("\t(" + counter + ") - $0.10");
		}
		// $0.05 - NICKEL
		if (remainingAmount >= 0.05) {
			int counter = (int) (remainingAmount / 0.05);
			remainingAmount -= counter * 0.05;
			System.out.println("\t(" + counter + ") - $0.05");
		}
		// $0.01 - PENNY
		if (remainingAmount >= 0.01) {
			int counter = (int) (remainingAmount / 0.01);
			remainingAmount -= counter * 0.01;
			System.out.println("\t(" + counter + ") - $0.01");
		}
	}

	public static double roundedCoins(double value) {
		return Math.round(value * 100.0) / 100.0;
	}

}
