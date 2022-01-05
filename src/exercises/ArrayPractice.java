package exercises;

import java.util.Arrays;

public class ArrayPractice {
	public static void main(final String[] args) {
		final int[] data = {1, 1, 2, 3, 5, 8};

		for (int i = 0; i < data.length; i++) {
			if (data[i] % 2 != 0) {
				System.out.println(data[i]);
			}
		}

		final String rhyme = "I would not, could not, in a box. I would not, could not" +
				" with a fox. I will not eat them in a house. I will not eat them with a mouse.";
		final String[] words = rhyme.split("\\.");
		System.out.println(Arrays.toString(words));
	}
}
