public class MostProfitable {
	
	public static String bestItem(int[] costs, int[] prices, int[] sales, String[] items) {
		int[] profit = new int[costs.length];
		for (int i = 0; i < costs.length; i++)
			profit[i] = (prices[i] * sales[i]) - (sales[i] * costs[i]);

		int highest = 0;
		String highestName = "";
		for (int i = 0; i < profit.length; i++) {
			if (profit[i] > highest) {
				highest = profit[i];
				highestName = items[i];
			}
		}
		return highestName;
	}
}
