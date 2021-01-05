package U12;

import java.util.*;

public class S12_6 {

	public static void main(String[] args) throws Exception {

		Scanner sc = new Scanner(System.in);

		String hex = sc.next();

		try {
			System.out.print(hexToDec(hex.toUpperCase()));
		} catch (NumberFormatException e) {
			System.out.println(e.getMessage());
		}
	}

	public static int hexToDec(String hex) {
		int decimalValue = 0;
		for (int i = 0; i < hex.length(); i++) {
			char hexChar = hex.charAt(i);
			decimalValue = decimalValue * 16 + hexCharToDecimal(hexChar);
		}

		return decimalValue;
	}

	public static int hexCharToDecimal(char ch) {
		if (!(ch >= '0' && ch <= '9') && !(ch >= 'A' && ch <= 'F')) {
			throw new NumberFormatException("ERROR!");
		}
		if (ch >= 'A' && ch <= 'F') {
			return 10 + ch - 'A';
		} else if (ch >= '0' && ch <= '9') {
			return ch - '0';
		}
		return 1;
	}
}
