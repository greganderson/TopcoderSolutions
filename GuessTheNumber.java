public class GuessTheNumber {
	
	public static int noGuesses(int upper, int answer) {
		int guesses = 0;
		int b_range = 1;
		int guess = (upper + b_range) / 2;

		while (guess != answer) {
			if (guess > answer)
				upper = guess - 1;
			else
				b_range = guess + 1;

			guesses++;
			guess = (upper + b_range) / 2;
		}

		return ++guesses;
	}
}
