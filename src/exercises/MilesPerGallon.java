package exercises;

import java.util.Scanner;

public class MilesPerGallon {
	public static void main(String[] args) {
		Scanner input;

		input = new Scanner(System.in);
		System.out.println("How many miles have you driven?");
		double miles = input.nextDouble();

		input = new Scanner(System.in);
		System.out.println("How many gallons of gas did you consumed?");
		double gallons = input.nextDouble();
		input.close();

		double mpg = miles / gallons;
		System.out.println("Your miles per gallon was " + mpg);
	}
}
