import java.util.Arrays;

public class Bonuses {

	public static int[] getDivision(int[] points) {
		double total = 0.0;
		double leftover = 0.0;
		int[] bonuses = new int[points.length];
		int[] toSort = new int[points.length];
		for (int i = 0; i < points.length; i++)
			total += points[i];

		for (int i = 0; i < points.length; i++) {
			double pctTotal = points[i] / total * 100;
			int pct = (int)pctTotal;
			leftover += pctTotal - pct;
			bonuses[i] = pct;
			toSort[i] = points[i];
		}

		int leftoverWhole = (int)(leftover + 0.1);

		Arrays.sort(toSort);

		for (int i = 1; i <= leftoverWhole; i++) {
			for (int j = 0; j < points.length; j++) {
				if (points[j] == toSort[toSort.length - i]) {
					points[j] += 1;
					bonuses[j] += 1;
					break;
				}
			}
		}

		return bonuses;
	}
}
