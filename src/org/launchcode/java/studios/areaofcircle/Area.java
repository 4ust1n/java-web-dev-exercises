package org.launchcode.java.studios.areaofcircle;

import java.util.Scanner;

public class Area {
	public static void main(final String[] args) {

		final Scanner input = new Scanner(System.in);
		double radius;

		do {
			System.out.println("Enter a radius: ");
			try {
				radius = input.nextDouble();
				if (radius < 0) continue;
				break;
			} catch (final Exception e) {
				input.next();
			}
		} while (true);

		final double area = Circle.getArea(radius);
		System.out.println("The area of a circle of radius " + radius + " is: " + area);
		input.close();
	}
}
