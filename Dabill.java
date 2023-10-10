package waterBill;

import java.util.Scanner;

public class Dabill {

	public static void main(String[] args) {
		
		//talk to user
		talk();
		
		// logic and calculation
		int years = dayear();		
		
		double water = calc(years);
		
		int nuMonths = months(years);
		
		double average = ave(water);
		
		//display
		display(nuMonths,average);
		
	}public static void talk() {
		
		System.out.println("Please enter the total of years");
	
	}public static int dayear() {
		
		Scanner kb = new Scanner (System.in);
		
		int year = kb.nextInt();
		
		return year;
		
	} public static double calc(int years) {
		
		Scanner kb = new Scanner (System.in);
		
		int counter = 1;
		
		
		
		double waterBill = 0.0;
		
		double neWaterBill = 0.0;
		
		for (int i=1; i<=years; i++) {
			
			while(counter<=12) {
				
				System.out.printf("Enter water bill for the month %d", counter);
				waterBill = kb.nextDouble();
				
				neWaterBill = neWaterBill + waterBill;
				
				counter++;
			}
				counter = 1;
		}
		
		return neWaterBill;
		
	} public static int months(int years) {
		
		int numMonths = 12 * years;
		
		return numMonths;
		
		
	} public static double ave(double water ) {
	
	double average = water/24;
	
	return average;
	

	}public static void display(int nuMonths,double average) {
	
	System.out.printf("The total of months is %d%n", nuMonths);
	System.out.printf("%nThe average of all the money combine will be %.2f", average );
	
}
}
