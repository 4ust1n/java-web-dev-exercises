package exercises;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListPractice {
	public static void main(final String[] args) {
		final String rhyme = "I would not, could not, in a box. I would not, could not" +
				" with a fox. I will not eat them in a house. I will not eat them with a mouse.";
		final ArrayList<String> numbers = new ArrayList<>(Arrays.asList(rhyme));
		sum(numbers);
	}

	static void sum(final ArrayList<String> i) {
		final int size = i.size();
		int calculate;
		if (size % 2 == 0) {
			//size
		}
	}
}
/* LEFT OFF HERE, NOT SURE WHAT TO DO. BREAK TIME */
