import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class SimpleWordGame {
	public int points(String[] player, String[] dictionary) {
		// TODO: replace this stubbed return value with your code
		return 0;
	}

	public static void main(String[] args) {
		SimpleWordGame game = new SimpleWordGame();
		int result, expectation;
		int passed = 0, failed = 0;

		// Example 1
		result = game.points(
			new String[]{},
			new String[]{}
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
		result = game.points(
			new String[]{},
			new String[]{}
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
		result = game.points(
			new String[]{},
			new String[]{}
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
		result = game.points(
			new String[]{},
			new String[]{}
		);

		expectation = -1;
		if(result == expectation) {
			passed++;
		}
		else {
			failed++;
			System.out.println("Example 4: expected result " + result + " to be " + expectation);
		}

		System.out.println("SimpleWordGame: " + passed + " passed, " + failed + " failed.");
	}
}
