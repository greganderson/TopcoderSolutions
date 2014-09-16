/*
 * This algorithm is too slow, sitting at a huge O(3N^2).  But, it works!
 */
public class RectangularGrid {
	
	public static long countRectangles(int width, int height) {
		long total = 0;

		int wSize = width * (width + 1) >> 1;
		int hSize = height * (height + 1) >> 1;

		int[] widthNum = new int[wSize];
		int[] heightNum = new int[hSize];

		int index = 0;
		for (int i = 0; i < width; i++)
			for (int j = 0; j < width - i; j++)
				widthNum[index++] = 1 + i;


		index = 0;
		for (int i = 0; i < height; i++)
			for (int j = 0; j < height - i; j++)
				heightNum[index++] = 1 + i;

		for (int i = 0; i < widthNum.length; i++)
			for (int j = 0; j < heightNum.length; j++)
				if (widthNum[i] != heightNum[j])
					total++;

		return total;
	}
}
