package threeMonthsInterviewWeek1;

import java.util.*;

public class DivisibleSumPairs {

    public static void main(String[] args) {
        System.out.println(divisibleSumPairs(6, 3, Arrays.asList(1, 3, 2, 6, 1, 2)));
    }

    public static int divisibleSumPairs(int n, int k, List<Integer> arr) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i+1; j < arr.size(); j++) {
                int tempSum = arr.get(i) + arr.get(j);
                if(tempSum % k == 0){
                    if (i < j){
                        count++;
                    }
                }
            }
        }
        return count;
    }

}
