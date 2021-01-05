package U12;

import java.util.*;

public class S12_8 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		try {
			HexToDecUseHexFormatException hex = new HexToDecUseHexFormatException(sc.next());
			System.out.println(hex.getHexString());
		} catch (HexFormatException ex) {
			System.out.println(ex.getMessage());
		}
	}
}

class HexFormatException extends Exception {

	String str;

	public HexFormatException(String hexString) {
		super("HexFormatException:" + hexString);
		this.str = hexString;
	}

	public String getHexString() {
		return str;
	}
}

class HexToDecUseHexFormatException {

	String str;

	public HexToDecUseHexFormatException(String hexString) throws HexFormatException {
		setHexString(hexString);
	}

	public void setHexString(String hexString) throws HexFormatException {
		for (int i = 0; i < hexString.length(); i++) {
			if (judge(hexString.charAt(i)) == -1) {
				throw new HexFormatException("Error!");
			}
		}
		this.str = hexString;
	}

	public String getHexString() {
		return str;
	}

	private int judge(char ch) {
		if ((ch >= '0') && (ch <= '9')) {
			return (ch - '0');
		} else if ((ch >= 'A') && (ch <= 'F')) {
			return (ch - 'A' + 10);
		} else {
			return -1;
		}
	}

	public int hex2Dec() {
		int result = 0;
		for (int i = str.length() - 1; i >= 0; i--) {
			result += judge(str.charAt(i)) * (Math.pow(16, (str.length() - i - 1)));
		}
		return result;
	}
}
