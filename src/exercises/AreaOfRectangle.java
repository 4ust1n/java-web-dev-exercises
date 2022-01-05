package exercises;

import java.util.Scanner;

public class AreaOfRectangle {
	public static void main(final String[] args) {
		Scanner input;

		input = new Scanner(System.in);
		System.out.println("What is the length of the rectangle?");
		final int length = input.nextInt();

		input = new Scanner(System.in);
		System.out.println("What is the width of the rectangle?");
		final int width = input.nextInt();
		input.close();

		final int area = length * width;
		System.out.println("Area of rectangle is " + area);

	}
}
