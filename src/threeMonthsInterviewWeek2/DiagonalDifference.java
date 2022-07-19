package threeMonthsInterviewWeek2;

import java.util.Arrays;
import java.util.List;

public class DiagonalDifference {

    public static void main(String[] args) {
        List<Integer> row1 = Arrays.asList(1,2,3);
        List<Integer> row2 = Arrays.asList(4,5,6);
        List<Integer> row3 = Arrays.asList(7,8,9);

        List<List<Integer>> arr = Arrays.asList(row1, row2, row3);

        System.out.println(diagonalDifference(arr));
    }

    public static int diagonalDifference(List<List<Integer>> arr) {
        int diagonalDiff = 0;
        int diagonalLeft = 0;
        int diagonaRight = 0;
        int elements = arr.size() - 1;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = 0; j < arr.size(); j++) {
                if(i == j){
                    diagonalLeft += arr.get(i).get(j);
                }
                if (( i + j) == (elements)) {
                    diagonaRight += arr.get(i).get(j);
                }
            }
        }
        diagonalDiff = diagonalLeft - diagonaRight;
        return Math.abs(diagonalDiff);
    }
}
