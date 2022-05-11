package s02.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Arrays_LeftRotation {

	public static void main(String[] args) {
		List<Integer> a = Arrays.asList(1, 2, 3, 4, 5);
		System.out.println("Result: " + rotLeft(a, 4));
	}

	public static List<Integer> rotLeft(List<Integer> a, int d) {
		List<Integer> b = new ArrayList<Integer>();
		for (int i = d; i < a.size(); i++) {
			b.add(a.get(i));	
		}
		for (int i = 0; i < d; i++) {
			b.add(a.get(i));	
		}
		return b;
	}

}
