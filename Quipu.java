public class Quipu {
	
	public static int readKnots(String knots) {
		int num = 0;
		for (int i = 0; i < knots.length(); i++) {
			char c = knots.charAt(i);
			if (c == 'X') {
				int count = 0; 
				while (c == 'X') {
					count++;
					i++;
					c = knots.charAt(i);
				}
				num += count;
				num *= 10;
			}
			else {
				num *= 10;
			}
		}
		return num / 10;
	}
}
