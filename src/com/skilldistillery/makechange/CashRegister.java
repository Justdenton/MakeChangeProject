package com.skilldistillery.makechange;

import java.util.Scanner;

// 1) Calculates the amount of change returned to a customer.
				  // Based on the purchase price & amount tendered. (trust user vs. scanning at grocery store)
// 2) Notifies attendant (how many) of each 'type of currency' is needed to make change for the customer.  
		// Change will be provided using combo of LARGEST bill & coin denominations as possible.
			// *** Denominations that are NOT used will NOT be displayed ***
	
// main -> inputMethods -> 'if change' -> calcChange -> 
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
		System.out.println("Thank the customer for shopping with us.");	// STOPS here if exact given. 
	} else if (trustPrice > trustTendered) {
		System.out.println("ERROR - The customer has not given you enough money.");	// STOPS here (error). 
	} else {
		calcChange(trustTendered, trustPrice); // "if" change is due, calls calcChange
	}
		
	} // MAIN END
	// **********************************************************************************************************
	
	// USER INPUT METHODS - These get called in main.
	public static void askPrice() {
		System.out.println("Ask the customer what the cost of the item is."); // Trusting the customer.
	
	} public static void askTendered() {
		System.out.println("How much money did the customer give you?");
	}
	// **********************************************************************************************************
	
	
	// The ONLY way to get here is IF -- PRICE < TENDERED
	public static void calcChange(double trustTendered, double trustPrice) {
		double tenderMinusPrice = trustTendered - trustPrice;
	
		System.out.println("Cost: " + trustPrice);
		System.out.println("Tendered: " + trustTendered);
		System.out.println("Change: " + tenderMinusPrice);
		
	// IF - Tests whether the change will include coins. (after confirming change is due)           
		if (tenderMinusPrice % 1 != 0 ) {						
		//withCoins(tenderMinusPrice);
		
		} else {
			billsOnly(tenderMinusPrice);
		
		} // END OF calcChange METHOD***********************************************************
	
	}	
		
	
	public static void billsOnly(double tenderMinusPrice) {
		double billsOnlyVar = tenderMinusPrice;	
		// $20
		if (billsOnlyVar / 20 >= 1) {
			int counter = (int) (billsOnlyVar / 20);
			billsOnlyVar -= counter * 20; 
			System.out.println("\t(" + counter + ") - $20");
		}
		// $10
		if (billsOnlyVar / 10 >= 1) {
			int counter = (int) (billsOnlyVar / 10);
			billsOnlyVar -= counter * 10; 
			System.out.println("\t(" + counter + ") - $10");
		}
		// $5
		if (billsOnlyVar / 5 >= 1) {
			int counter = (int) (billsOnlyVar / 5);
			billsOnlyVar -= counter * 5; 
			System.out.println("\t(" + counter + ") - $5");
		}
		// $1
		if (billsOnlyVar / 1 >= 1) {
			int counter = (int) billsOnlyVar;
			billsOnlyVar -= counter;
			System.out.println("\t(" + counter + ") - $1");
		}	

	}	 	// END OF billsOnly METHOD ********************************************************
	
	public static void withCoins(double tenderMinusPrice) {
		double billsOnlyVar = tenderMinusPrice;	
		// $20
		if (billsOnlyVar / 20 >= 1) {
			int counter = (int) (billsOnlyVar / 20);
			billsOnlyVar -= counter * 20; 
			System.out.println("\t(" + counter + ") - $20");
		}
		// $10
		if (billsOnlyVar / 10 >= 1) {
			int counter = (int) (billsOnlyVar / 10);
			billsOnlyVar -= counter * 10; 
			System.out.println("\t(" + counter + ") - $10");
		}
		// $5
		if (billsOnlyVar / 5 >= 1) {
			int counter = (int) (billsOnlyVar / 5);
			billsOnlyVar -= counter * 5; 
			System.out.println("\t(" + counter + ") - $5");
		}
		// $1
		if (billsOnlyVar / 1 >= 1) {
			int counter = (int) billsOnlyVar;
			billsOnlyVar -= counter;
			System.out.println("\t(" + counter + ") - $1");
		}
		
		// $0.25 - QUARTER
		if (billsOnlyVar / 20 >= 1) {
			int counter = (int) (billsOnlyVar / 20);
			billsOnlyVar -= counter * 20; 
			System.out.println("\t(" + counter + ") - $20");
		}
		// $0.10 - DIME
		if (billsOnlyVar / 10 >= 1) {
			int counter = (int) (billsOnlyVar / 10);
			billsOnlyVar -= counter * 10; 
			System.out.println("\t(" + counter + ") - $10");
		}
		// $0.05 - NICKEL
		if (billsOnlyVar / 5 >= 1) {
			int counter = (int) (billsOnlyVar / 5);
			billsOnlyVar -= counter * 5; 
			System.out.println("\t(" + counter + ") - $5");
		}
		// $0.01 - PENNY
		if (billsOnlyVar / 1 >= 1) {
			int counter = (int) billsOnlyVar;
			billsOnlyVar -= counter;
			System.out.println("\t(" + counter + ") - $1");
		}
		
		

	} // END OF withCoins METHOD *********************************************************
	
	// tomorrow:
	// combine/call billsMethod into coins? (reduce # of if's) (can't use double in switch)
	// 1) figure out how to format $$$ into calcChange method's println??
				// might need to review numeral and/or "CASTING"
	
	/// FUNCTIONAL:
	// prints cost, prints tendered, prints change $
			// next: bills only vs coins and how to consolidate
	

}
		
