package U12;

import java.util.*;

public class S12_7 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		
		try {
			Integer.parseInt(str, 2);
		} catch (NumberFormatException e) {
			System.out.println("Error!");
			System.exit(1);
		}
		
		System.out.println(bin2Dec(str));
	}

	public static int bin2Dec(String str) {
		return Integer.parseInt(str, 2);
	}
}
