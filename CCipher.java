public class CCipher {
	
	public static String decode(String cipherText, int shift) {
		String result = "";

		for (int i = 0; i < cipherText.length(); i++) {
			char c = cipherText.charAt(i);
			c -= shift;
			if (c < 'A')
				c += 26;
			result += c;
		}

		return result;
	}
}
