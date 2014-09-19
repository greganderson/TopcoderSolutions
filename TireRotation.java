public class TireRotation {

	public static int getCycle(String initial, String current) {
		if (current == initial)
			return 1;

		String rotated = rotate(initial);
		for (int i = 2; i <= 4; i++) {
			if (rotated.equals(current))
				return i;
			rotated = rotate(rotated);
		}

		return -1;
	}

	private static String rotate(String s) {
		return s.charAt(3) + s.charAt(2) + s.charAt(0) + s.charAt(1) + "";
	}
}
