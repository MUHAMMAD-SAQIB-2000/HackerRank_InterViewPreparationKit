package s01.warmupChallenges;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;

public class SalesByMatch {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<Integer>();
//		list.addAll(Arrays.asList(1, 2, 1, 2, 1, 3, 2));
		list.addAll(Arrays.asList(10, 20, 20, 10, 10, 30, 50, 10, 20));
		sockMerchant(list.size(), list);

	}

	public static int sockMerchant(int n, List<Integer> ar) {
		int numberOfPairs = 0;
		Map<Integer, Long> pairs = ar.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

		for (Entry<Integer, Long> entry : pairs.entrySet()) {
			int value = entry.getValue().intValue();
			int pair = 0;
			if (value % 2 == 0) {
				pair = value / 2;
			} else {
				pair = (value - 1) / 2;
			}
			numberOfPairs += pair;
		}

		return numberOfPairs;
	}

}
