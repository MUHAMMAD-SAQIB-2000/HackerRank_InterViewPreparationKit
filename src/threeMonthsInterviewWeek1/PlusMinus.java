package threeMonthsInterviewWeek1;

import java.util.ArrayList;
import java.util.List;

public class PlusMinus {

	public static void main(String[] args) {
//		List<Integer> arr = Arrays.asList(1, 1, 0, 0, -1);
//		List<Integer> arr = Arrays.asList(-4, 3, -9, 0, 4, 1);
		List<Integer> arr = new ArrayList<>();

		plusMinus(arr);

	}

	public static void plusMinus(List<Integer> arr) {
		double totalDigits = arr.size();
		int positives = 0;
		int negatives = 0;
		int zeros = 0;
		double positiveRatio = 0.0;
		double negativeRatio = 0.0;
		double zerosRatio = 0.0;

		if(!arr.isEmpty()){
			for (int i = 0; i < totalDigits; i++) {
				int digit = arr.get(i);

				if (digit < 0) {
					negatives++;
				} else if (digit > 0) {
					positives++;
				} else if (digit == 0) {
					zeros++;
				}
			}

			positiveRatio = (positives / totalDigits);
			negativeRatio = (negatives / totalDigits);
			zerosRatio = (zeros / totalDigits);
		}

		System.out.println(String.format("%.6f", positiveRatio));
		System.out.println(String.format("%.6f", negativeRatio));
		System.out.println(String.format("%.6f", zerosRatio));
	}

}
