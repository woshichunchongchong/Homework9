package U12;

import java.util.*;

public class S12_10 {
	public static void main(String[] args) {
		double i = 123456;
		
		ArrayList<Double> list = new ArrayList<Double>();
		
		while (true) {
			i++;
			try {
				list.add(i);
			} catch (OutOfMemoryError e) {
				System.out.println("Error!\n" + e);
				System.exit(1);
			}
		}
	}

}