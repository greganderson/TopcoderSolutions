public class ImageDithering {
	
	public static int count(String dithered, String[] screen) {
		int width = screen[0].length();
		int height = screen.length;
		boolean[][] countArray = new boolean[height][width];

		for (int i = 0; i < height; i++) {
			for (int j = 0; j < width; j++) {
				char currentChar = screen[i].charAt(j);
				if (dithered.indexOf(currentChar) >= 0) {
					// Right
					if ((j + 1) != width) {
						char right = screen[i].charAt(j+1);
						//if ((dithered.indexOf(right) >= 0) && right != currentChar) {
						if ((dithered.indexOf(right) >= 0)) {
							countArray[i][j] = true;
							countArray[i][j+1] = true;
						}
					}
					// Down
					if ((i + 1) != height) {
						char down = screen[i+1].charAt(j);
						//if ((dithered.indexOf(down) >= 0) && down != currentChar) {
						if ((dithered.indexOf(down) >= 0)) {
							countArray[i][j] = true;
							countArray[i+1][j] = true;
						}
					}
					// Down, right
					if ((i + 1) != height && (j + 1) != width) {
						char downRight = screen[i+1].charAt(j+1);
						if ((dithered.indexOf(downRight) >= 0)) {
							countArray[i][j] = true;
							countArray[i+1][j+1] = true;
						}
					}
					// Down, left
					if ((i + 1) != height && (j - 1) > 0) {
						char downLeft = screen[i+1].charAt(j-1);
						if ((dithered.indexOf(downLeft) >= 0)) {
							countArray[i][j] = true;
							countArray[i+1][j-1] = true;
						}
					}
				}
			}
		}

		int result = 0;
		for (int i = 0; i < height; i++)
			for (int j = 0; j < width; j++)
				if (countArray[i][j])
					result++;

		return result;
	}
}
