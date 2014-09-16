public class DivisorDigits {
	
	public int howMany(int number) {
		if (number == 0)
			return 0;

		String s = number + "";
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			int digit = s.charAt(i) - '0';
			if (digit == 0)
				continue;
			if (number % digit == 0)
				count++;
		}

		return count;
	}
}
