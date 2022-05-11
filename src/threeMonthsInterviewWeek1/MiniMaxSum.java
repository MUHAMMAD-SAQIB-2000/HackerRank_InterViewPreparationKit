package threeMonthsInterviewWeek1;

import java.util.Arrays;
import java.util.List;

public class MiniMaxSum {

    public static void main(String[] args) {
        miniMaxSum(Arrays.asList(1, 2, 3, 4, 5));
        miniMaxSum(Arrays.asList(256741038, 623958417, 467905213, 714532089, 938071625));
    }

    public static void miniMaxSum(List<Integer> arr) {
        if(arr.isEmpty()){
            System.out.println(0 + " " + 0);
            return;
        }

        long currSum = 0;
        long maxSum = 0;
        long minSum = 0;

        for (int i = 0; i < arr.size(); i++){
            for (int j = 0; j < arr.size(); j++) {
                if(i != j){
                    currSum += arr.get(j);
                }
            }
            if(i == 0){
                maxSum = currSum;
                minSum = currSum;
            }
            if(currSum >= maxSum){
                maxSum = currSum;
            } else if(currSum <= minSum){
                minSum = currSum;
            }
            currSum = 0;
        }

        System.out.println(minSum + " " + maxSum);
    }

}
