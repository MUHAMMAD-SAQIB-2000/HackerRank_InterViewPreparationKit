package threeMonthsInterviewWeek3;

import java.util.Arrays;
import java.util.List;

public class SubarrayDivision2 {

    public static void main(String[] args) {
        System.out.println(birthday(Arrays.asList(2, 2, 1, 3, 2), 4, 2) + "\n");
        System.out.println(birthday(Arrays.asList(4), 4, 1) + "\n");
    }

    public static int birthday(List<Integer> s, int d, int m) {
        // Write your code here
        int count = 0;
        for (int i = 0; i <= s.size() - m; i++) {
            int sum = 0;
            for (int j = 0; j < m; j++) {
                sum += s.get(i + j);
            }
            if(sum == d){
                count++;
            }
        }
        return count;
    }

}
