import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class SandwichBar {
	public int whichOrder(String[] available, String[] orders) {
		// TODO: replace this stubbed return value with your code
		return 0;
	}

	public static void main(String[] args) {
		SandwichBar bar = new SandwichBar();
		int result, expectation;
		int passed = 0, failed = 0;

		// Example 1
		result = bar.whichOrder(
			new String[]{ "ham", "cheese", "mustard" },
			new String[]{ "ham cheese" }
		);

		expectation = 0;
		if(result != expectation) {
			failed++;
			System.out.println("Example 1: expected result " + result + " to be " + expectation);
		}
		else {
			passed++;
		}

		// Example 2
		result = bar.whichOrder(
			new String[]{ "cheese", "mustard", "lettuce" },
			new String[]{ "cheese ham", "cheese mustard lettuce", "ketchup", "beer" }
		);

		expectation = 1;
		if(result == expectation) {
			passed++;
		}
		else {
			failed++;
			System.out.println("Example 2: expected result " + result + " to be " + expectation);
		}

		// Example 3
		result = bar.whichOrder(
			new String[]{ "cheese", "cheese", "cheese", "tomato" },
			new String[]{ "ham ham ham", "water", "pork", "bread", "cheese tomato cheese", "beef" }
		);

		expectation = 4;
		if(result == expectation) {
			passed++;
		}
		else {
			failed++;
			System.out.println("Example 3: expected result " + result + " to be " + expectation);
		}

		// Example 4
		result = bar.whichOrder(
			new String[]{ "foo", "bar", "baz", "gazonk", "quux", "bat", "xyzzy", "shme", "hukarz", "grault", "waldo", "bleh" },
			new String[]{ "kalatehas", "spam eggs", "needle haystack", "bleh blarg", "plugh", "the best sandwich in the universe" }
		);

		expectation = -1;
		if(result == expectation) {
			passed++;
		}
		else {
			failed++;
			System.out.println("Example 4: expected result " + result + " to be " + expectation);
		}

		System.out.println("SandwichBar: " + passed + " passed, " + failed + " failed.");
	}
}
