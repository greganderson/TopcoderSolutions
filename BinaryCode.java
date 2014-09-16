public class BinaryCode {
	
	public static String[] decode(String message) {
		String[] result = new String[2];

		// Only one character
		if (message.length == 1) {
			if (message.charAt(0) != '0')
				result[0] = "NONE";
			else
				result[0] = "0";

			if (message.charAt(0) != '1')
				result[1] = "NONE";
			else
				result[1] = "1";
		}

		String p0 = "";
		String p1 = "";
		
		// Check first two characters
		char l = message.charAt(0);
		char m = message.charAt(1);
		char r = message.charAt(1);
		// P[0] = 0
		if (l == '0') {
			p0 += "00";
			if (m != '0')
				p0 = "NONE";
		}
		else if (l == '1') {
			p0 = "01";
			if (m != '1')
				p0 = "NONE";
		}
		else
			p0 = "NONE";

		// P[0] = 1

		// Loop through starting at i = 1, going to i = message.length - 2

		// Check last two characters

		// Assume P[0] = 0
		for (int i = 0; i < message.length; i++) {
			//
		}

		// Assume P[0] = 1

		return result;
	}
}
