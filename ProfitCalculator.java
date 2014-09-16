public class ProfitCalculator {
	
	public static int percent(String[] items) {
		double storeCost = 0.0;
		double customerPrice = 0.0;

		for (int i = 0; i < items.length; i++) {
			String[] prices = items[i].split(" ");
			customerPrice += Double.parseDouble(prices[0]);
			storeCost += Double.parseDouble(prices[1]);
		}
		double margin = (customerPrice - storeCost) / customerPrice;
		return (int)(margin * 100);
	}
}
