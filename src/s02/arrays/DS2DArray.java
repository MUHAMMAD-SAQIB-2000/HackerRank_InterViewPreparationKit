package s02.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DS2DArray {

	public static void main(String[] args) {
		List<List<Integer>> arr = new ArrayList<List<Integer>>();
//		arr.add(Arrays.asList(1, 1, 1, 0, 0, 0));
//		arr.add(Arrays.asList(0, 1, 0, 0, 0, 0));
//		arr.add(Arrays.asList(1, 1, 1, 0, 0, 0));
//		arr.add(Arrays.asList(0, 0, 0, 0, 0, 0));
//		arr.add(Arrays.asList(0, 0, 0, 0, 0, 0));
//		arr.add(Arrays.asList(0, 0, 0, 0, 0, 0));
//		arr.add(Arrays.asList(-9, -9, -9, 1, 1, 1));
//		arr.add(Arrays.asList(0, -9, 0, 4, 3, 2));
//		arr.add(Arrays.asList(-9, -9, -9, 1, 2, 3));
//		arr.add(Arrays.asList(0, 0, 8, 6, 6, 0));
//		arr.add(Arrays.asList(0, 0, 0, -2, 0, 0));
//		arr.add(Arrays.asList(0, 0, 1, 2, 4, 0));
		arr.add(Arrays.asList(0, 0, 0, 1, 2, 7));
		for (List<Integer> list : arr) {
			for (Integer el : list) {
				System.out.print(el + " ");
			}
			System.out.println("");
		}
//		System.out.println(arr.size());
		System.out.println("Result: " + hourglassSum(arr));
	}

	public static int hourglassSum(List<List<Integer>> arr) {
		int maxSum = -10000;
		for (int i = 0; i < arr.size() - 2; i++) {
			for (int j = 0; j < arr.size() - 2; j++) {
				int sum = 0;
				int row1 = arr.get(i).get(j) + arr.get(i).get(j + 1) + arr.get(i).get(j + 2);
				int row2 = arr.get(i + 1).get(j + 1);
				int row3 = arr.get(i + 2).get(j) + arr.get(i + 2).get(j + 1) + arr.get(i + 2).get(j + 2);
				sum = row1 + row2 + row3;
				if(sum > maxSum) {
					maxSum = sum;
				}
			}
		}
		return maxSum;
	}
}
