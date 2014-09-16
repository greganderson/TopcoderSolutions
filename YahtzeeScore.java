public class YahtzeeScore {
	
	public static int maxPoints(int[] toss) {
		int highest = 0;

		for (int i = 1; i <= 6; i++) {
			int current = getActive(toss, i);
			if (current > highest)
				highest = current;
		}

		return highest;
	}

	private static int getActive(int[] toss, int num) {
		int result = 0;
		for (int i = 0; i < toss.length; i++)
			if (toss[i] == num)
				result += num;
		return result;
	}
}
