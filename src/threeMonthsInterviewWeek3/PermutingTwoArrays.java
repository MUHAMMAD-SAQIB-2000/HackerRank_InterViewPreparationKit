package threeMonthsInterviewWeek3;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PermutingTwoArrays {

    public static void main(String[] args) {
        List<Integer> A = Arrays.asList(18, 73, 55, 59, 37, 13, 1, 33);
        List<Integer> B = Arrays.asList(81, 11, 77, 49, 65, 26, 29, 49);
        Integer[] a = A.toArray(new Integer[0]);
        Integer[] b = B.toArray(new Integer[0]);

        Arrays.sort(a, Collections.reverseOrder());
        Arrays.sort(b);

        A = Arrays.asList(a);
        B = Arrays.asList(b);


        int k = 91;
        System.out.println(A.toString() +"\n" + B.toString());
        String result = twoArrays(k, A, B);
        System.out.println(result);
    }

    public static String twoArrays(int k, List<Integer> A, List<Integer> B) {
        // Write your code here
        for (int i = 0; i < A.size(); i++) {
            if(A.get(i) + B.get(i) < k)
                return "NO";
        }
        return "YES";
    }

}
