/**************************************************************************/
/* This program will calculate the monthly car payment a user should expect to make after before taking out a car loan.
/* Coded by: Evense Zetrenne
/**************************************************************************/

import java.util.Scanner;

public class CarLoan {
	public static void main(String[] args) {

		
		System.out.println("Enter car amount:");
		Scanner scan = new Scanner(System.in);
		int carLoan = scan.nextInt();
		
		System.out.println("Enter desired length of car loan:");
		int loanLength = scan.nextInt();
		
		System.out.println("Enter intrest rate:");
		int intrestRate = scan.nextInt();
		
		System.out.println("Enter your down payment amount:");
		int downPayment = scan.nextInt();
   
		if(loanLength <= 0 || intrestRate <= 0 ) {
  
			System.out.println("Error! You must take out a valid car loan.");
		}    
		else if (downPayment >= carLoan) {

			System.out.println("The car can be paid in full.");
		}
		else {
		
			int remainingBalance = carLoan - downPayment; 
			int months = loanLength*12;
			int monthlyBalance = remainingBalance/months; 
			int intrest = (monthlyBalance*intrestRate)/100;
			int monthlyPayment = monthlyBalance+intrest;
     
			System.out.println(monthlyPayment);
		}	 
    
	}
}
