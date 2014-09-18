public class ExerciseMachine {

	public static void main(String[] args) {
		String s = "00:30:00";
		System.out.println("Total: " + getPercentages(s));
	}
	
	public static int getPercentages(String time) {
		String[] times = time.split(":");
		int hours = Integer.parseInt(times[0]);
		int min = Integer.parseInt(times[1]);
		int sec = Integer.parseInt(times[2]);

		sec += min * 60;
		sec += hours * 60 * 60;
		double secD = (double)sec;

		int total = 0;
		int t = 18;
		for (double i = 1.0; i < secD; i += 1.0) {
			double pct = i / secD * 100.0;
			if (pct - (int)pct == 0.0) {
				System.out.println("i -> " + i + " t -> " + t);
				t += 18;
				total++;
			}
		}

		return total;
	}
}
