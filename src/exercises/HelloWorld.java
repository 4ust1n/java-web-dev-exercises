package exercises;

import java.util.Scanner;

public class HelloWorld {
	public static void main(final String[] args) {
		final Scanner input = new Scanner(System.in);
		System.out.println("Hello, what is your name?");
		final String name = input.nextLine();
		input.close();
		System.out.println("Hello " + name);
		
	}
}
