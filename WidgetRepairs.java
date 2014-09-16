public class WidgetRepairs {

/*
Can arrivals be 0?
How big can arrivals get?
Will the numbers ever be negative?
Will the numbers ever be MAX_INT?
Will it ever take more days than can be held in an int?
Can numPerDay be negative?
Can numPerDay be 0?

Complexity: N

*/
	
	public static int days(int[] arrivals, int numPerDay) {
		int widgets = 0;
		int totalWorkDays = 0;

		for (int i = 0; i < arrivals.length; i++) {
			widgets += arrivals[i];

			if (widgets > 0) {
				widgets -= numPerDay;
				totalWorkDays++;
			}

			if (widgets < 0)
				widgets = 0;
		}

		while (widgets > 0) {
			widgets -= numPerDay;
			totalWorkDays++;
		}

		return totalWorkDays;
	}
}
