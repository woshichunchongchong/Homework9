package U12;

import java.util.*;

public class S12_9 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		
		try {
			int i = bin2Dec(str);
			System.out.print(i);
		} catch (NumberFormatException e) {
			System.out.println("Error!\n" + e);
			System.exit(1);
		}
	}

	public static int bin2Dec(String str) throws BinaryFormatException {
		int cnt = 0;
		for (int i = 0; i < str.length(); i++) {
			char hexChar = str.charAt(i);
			if (hexChar == '0' || hexChar == '1') {
				cnt = cnt * 2 + hexChar - '0';
			} else {
				throw new NumberFormatException("Error!");
			}
		}
		return cnt;
	}
}

class BinaryFormatException extends NumberFormatException {
	public BinaryFormatException(String str) {
		super(str);
	}
}
