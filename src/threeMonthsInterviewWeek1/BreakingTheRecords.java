package threeMonthsInterviewWeek1;

import java.util.Arrays;
import java.util.List;

public class BreakingTheRecords {

    public static void main(String[] args) {
        System.out.println(breakingRecords(Arrays.asList(12, 24, 10, 24)).toString());
    }

    public static List<Integer> breakingRecords(List<Integer> scores) {
        int maximum = scores.get(0);
        int minimum = scores.get(0);

        int min = 0, max = 0;

        for (int i = 1; i < scores.size(); i++) {
            int currScore = scores.get(i);
            if (currScore > maximum){
                max++;
                maximum = currScore;
            }
            if (currScore < minimum){
                min++;
                minimum = currScore;
            }
        }

        return Arrays.asList(max, min);
    }
}
