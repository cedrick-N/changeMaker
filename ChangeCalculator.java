package myFirstProject;


import java.util.Scanner;

public class ChangeCalculator {

	public static void main(String[] args) {
		changeDue();

	}

	public static void changeDue() {
		double Q = 0.25;
		double D = 0.10;
		double N = 0.05;
		double P = 0.01;
		
		
		// max change is 0.99
		System.out.println("Enter Change needed (between 1 and 99)");
		
		Scanner scan = new Scanner(System.in);
		double moneyInAsInterger = scan.nextDouble();
		
		System.out.println("you requested " +moneyInAsInterger +" cents in change");
		
		double moneyIn = moneyInAsInterger/100;
		
		if( moneyIn <= 0 || moneyIn >= 1) {
System.out.println("invalid request: change must not exceed $0.99");
		}
		else {
			
			int Quarters= (int)((moneyIn / Q));
			if(Quarters > 0) {System.out.println("Quarter(s): " + Quarters);}
			
			double remainder = ((moneyIn -(Q*Quarters))+0.01);  //account for accuracy loss.
			//System.out.println("the remainder " + remainder);
			 int Dimes = (int)(remainder/D);
			 if(Dimes > 0) { System.out.println("Dime(s): " + Dimes);}
			 
			double remainder2 = moneyIn-(Q*Quarters) -(Dimes*D);
			//System.out.println("the remainder2 " + remainder2);
			
			int Nickels= (int)(remainder2 / N);
			if(Nickels > 0) { System.out.println("Nickel(s): " + Nickels);}
			
			double remainder3 = remainder2 - (Nickels * N);
			//System.out.println("the remainder3 " + remainder3);
			
			int Penny = (int)((remainder3 / P)+0.01); //account for loss in accuracy.
			if(Penny > 0) { System.out.println("Penny(ies): " + Penny);}
			
		}
		
		
	}		
}
