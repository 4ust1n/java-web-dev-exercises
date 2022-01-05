package exercises;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapPractice {

	public static void main(final String[] args) {

		final HashMap<Integer, String> students = new HashMap<>();
		final Scanner input = new Scanner(System.in);
		int id;
		String studentName;

		System.out.println("Enter student ID and Name (or ENTER to finish):");

		do {
			System.out.println("Student ID: ");
			id = input.nextInt();

			if (!input.equals("")) {
				System.out.println("Student Name: ");
				studentName = input.next();
				students.put(id, studentName);

				input.nextLine();
			}

			if (!input.hasNextInt()) {
				break;
			}

		} while (!input.equals(""));

		System.out.println("\nClass Roster: ");

		for (final Map.Entry<Integer, String> student : students.entrySet()) {
			System.out.println("ID: " + student.getKey() + " | Student: " + student.getValue());
		}
	}
}
