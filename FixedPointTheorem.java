public class FixedPointTheorem {

/*
F(X)=R*X*(1-X)
*/
	public static double cycleRange(double R) {
		double x = 0.25;
		int count = 0;
		while (count < 200000) {
			x = R * x * (1.0 - x);
			count++;
		}

		count = 0;
		double old = x;
		while (count < 1001) {
			x = R * x * (1.0 - x);
			count++;
		}

		double highest = Math.max(old, x);
		double lowest = Math.min(old, x);

		return highest - lowest;
	}
}
