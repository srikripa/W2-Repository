package com.sri.WeekTwoWork;

public class Loops {

	public static void main(String[] args) {
		
		System.out.println("*** *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** ***");
		System.out.println("*** Week 2 Coding Assignment - Boolean & Loops                                  *** ***");
		System.out.println("*** Student: SRI SRINIVASAN                                                     *** ***");
		System.out.println("*** Boolean Variables - isHotOutside, isWeekDay, hasMoneyInPocket               *** ***");
		System.out.println("*** Other variables costOfMilk, moneyInWallet, thirstLevel (1-10)               *** ***"); 
		System.out.println("*** Variables based on Boolean Operators - shouldBuyIceCream, willGoSwimming    *** ***");
		System.out.println("***                                         isAGoodDay, and willBuyMilk         *** ***");
		System.out.println("*** *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** ***");
		System.out.println();		
				
		// Declaring boolean variables
			boolean isHotOutside = true;
			boolean isWeekDay = false;
			boolean hasMoneyInPocket = true;
			
		//Declaring numerical variables 
			float costOfMilk = 2.50f;
			float moneyInWallet = 20.00f;
			int thirstLevel = 4;				// Scale of 1-10
			
		// Declaring Boolean Operators an ddisplaying the results
			
			boolean shouldBuyIceCream = (isHotOutside && hasMoneyInPocket); //Boolean Operator
			
			System.out.println();
			System.out.println("Using Boolean Operator for shouldBuyIceCream");
			System.out.println();
			
			if (shouldBuyIceCream) {
				System.out.println("Yay, I should buy Ice Cream today because it is Hot Outside & I got Money");					
			}
			else {
				System.out.println("Sorry, no ice cream today");
			}
			
			System.out.println("*** *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** ***");
			System.out.println();				
			
			boolean willGoSwimming = (isHotOutside && !isWeekDay);	// Boolean Operator
				
			System.out.println("Using Boolean Operator for willGoSwimming");
			System.out.println();

			if (willGoSwimming) {
				System.out.println("I will go swimming today because it is Hot Outside & it is not a weekday");					
				}
				else {
					System.out.println("Sorry, no swimming today");
				}
				System.out.println("*** *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** ***");
				System.out.println();
				
				boolean isAGoodDay = (isHotOutside && hasMoneyInPocket && !isWeekDay);	//Boolean Operator
				
				System.out.println("Using Boolean Operator for isAGoodDay");
				System.out.println();

				if (isAGoodDay) {
					System.out.println("I have money to spend during this hot weekend!");					
				}
				else {
					System.out.println("Sorry, no money to spend during this hot weekend!");
				}		
				System.out.println("*** *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** ***");
				System.out.println();
				
				boolean willBuyMilk = (isHotOutside && (thirstLevel >= 3) && (moneyInWallet > (costOfMilk * 2)));	// Boolean Operator
				
				System.out.println("Using Boolean Operator for willBuyMilk");
				System.out.println();
				
				if (willBuyMilk) {
					System.out.println("I have money to buy milk today to quench my thirst!");					
				}
				else {
					System.out.println("Sorry, I am not buying milk today!");
				}
				
				System.out.println("*** *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** ***");
				System.out.println();
				
				/*
				/* 
				 * A while loop that prints all even numbers from 0 to 100
				 */
				
				System.out.println("** While loop that prints all even numbers from 0 to 100");
				System.out.println();				
				
				int x = 0; //declare variable x and assign 0

				while (x <=100) {
					if (x % 2 == 0 && x != 0) {	//checks for divisibility by 2 and ensure x is not 0
						System.out.println(x);
						
					}
					x++;
				}
				System.out.println("*** *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** ***");
				System.out.println();

				/* 
				 * A while loop that prints every 3rd number going backwards from 100 until we reach 0
				 */
				
				System.out.println("** While loop result for every 3rd number going backwards from 100 until we reach 0");
				System.out.println();
				
				int y = 100;
				while (y >= 0) {
					if (y <= 100 && y != 0) {	//checks for range being with 0-100
						System.out.println(y);
					}
					y = (y - 3);
				}
				System.out.println("*** *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** ***");
				System.out.println();
								
				/*
				 * A for loop that prints every other number from 1 to 100
				 */
				
				System.out.println("** A for loop that prints every other number from 1 to 100");
				System.out.println();
				
				for (int i = 1; i <= 100; i = i + 2) {	//variable i is initialized to 1 and then incremented by 2 till it reaches 100
				System.out.println(i);
				}
				System.out.println("*** *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** ***");
				System.out.println();
							
				
				/*
				 * A for loop that prints every number from 0 to 100, but if the number is divisible by 3, 
				 * it prints “Hello” instead of the number, and if the number is divisible by 5, 
				 * it prints “World” instead of the number, and if it is divisible by both 3 and 5, 
				 * it prints “HelloWorld” instead of the number.
				 */
				
				
				 System.out.println("**A for loop that prints every number from 0 to 100, but if the number is divisible by 3,"); 
				 System.out.println("**it prints “Hello” instead of the number, and if the number is divisible by 5,"); 
				 System.out.println("**it prints “World” instead of the number, and if it is divisible by both 3 and 5,"); 
				 System.out.println("**it prints “HelloWorld” instead of the number.");
				 System.out.println();
				
				for (int j = 0; j <= 100; j++) {
					if (j % 3 == 0 && j % 5 == 0 && j!= 0) {	//It is important to test this condition first
																//otherwise a number divisible by 15 (5*3) will fall through
						System.out.println("HelloWorld");		
					}
					else if (j % 3 == 0 && j!= 0) {				//Checks if divisible by 3
						System.out.println("Hello");
					}
					
					else if(j % 5  == 0 && j!= 0) {				//Checks if divisible by 5
						System.out.println("World");
					}
					else {
						System.out.println(j);	
					}
				}
				System.out.println("*** *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** ***");
	}
}

