package jimenez_p2;

import java.util.Scanner;

public class BMI {
	
	public static void main(String[] args){
		
		Scanner scan = new Scanner(System.in);
		
		int system;
		double bmi = 0;
		double height_in_inches, height_in_meters;
		double weight_in_pounds, weight_in_kg;
		
		System.out.println("Which system would yo like to use?\n(1) Metric   (2) English");
		System.out.println("(Input in the form of 1 or 2)");
		
		system = scan.nextInt();
		
		
		if(system == 1) {
			
			System.out.println("Enter height in meters");
			height_in_meters = scan.nextDouble();
			System.out.println("Enter weight in kg");
			weight_in_kg = scan.nextDouble();
			bmi = (weight_in_kg)/(height_in_meters*height_in_meters);
			
			
			
		}
		
		else if(system == 2) {
			
			System.out.println("Enter height in inches");
			height_in_inches = scan.nextDouble();
			System.out.println("Enter weight in pounds");
			weight_in_pounds = scan.nextDouble();
			bmi = (703)*(weight_in_pounds)/(height_in_inches*height_in_inches);
			
			
			
		}
		
		System.out.printf("Your BMI is %.2f\n\n", bmi);
		System.out.println("You can evaluate your rate by the following categories:");
		System.out.println("Underweight =< 18.5");
		System.out.println("Normal weight = 18.5-24.9");
		System.out.println("Overweight = 25-29.9");
		System.out.println("Obesity = BMI of 30 or greater");
		


	}

}
