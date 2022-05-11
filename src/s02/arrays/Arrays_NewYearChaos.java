package s02.arrays;

import java.util.Arrays;
import java.util.List;

public class Arrays_NewYearChaos {

	public static void main(String[] args) {
		minimumBribes(Arrays.asList(1, 2, 3, 5, 4, 6, 7, 8));
		minimumBribes(Arrays.asList(2, 5, 1, 3, 4));
		minimumBribes(Arrays.asList(2, 1, 5, 3, 4));
	}

	public static void minimumBribes(List<Integer> q) {
        int bribes = 0;
        for (int i = q.size() - 1; i >= 0; i--) {
            int diff = q.get(i) - (i + 1);
            if(diff > 2) {
                System.out.println("Too chaotic");
                return;
            }
            for (int j = q.get(i) - 2; j < i; j++) {
                if(j >= 0) {
                    if (q.get(j) > q.get(i)) bribes++;                                   
                }
            }
        }
        System.out.println(bribes);
    }
}
