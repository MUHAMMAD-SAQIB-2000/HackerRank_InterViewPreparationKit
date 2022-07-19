package threeMonthsInterviewWeek2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MockTestFlippingTheMatrix {

    public static void main(String[] args) {
        List<List<Integer>> matrix = new ArrayList<>();
        matrix.add(Arrays.asList(112, 42, 83, 119));
        matrix.add(Arrays.asList(56, 125, 56, 49));
        matrix.add(Arrays.asList(15, 78, 101, 43));
        matrix.add(Arrays.asList(62, 98, 114, 108));
        System.out.println(flippingMatrix(matrix));
    }

    public static int flippingMatrix(List<List<Integer>> matrix) {
        int maxSum = 0;
        List<Integer> maxValues = new ArrayList<>();
        int temp = 0;
        // Write your code here
        for (int i = 0; i < 2; i++) {
            int r0c0 = matrix.get(0).get(0);
            int r0c1 = matrix.get(0).get(1);
            int r1c0 = matrix.get(1).get(0);
            int r1c1 = matrix.get(1).get(1);
            int sum = r0c0 + r0c1 + r1c0 + r1c1;
            System.out.println(sum);
            if(matrix.get(i).get(0) < matrix.get(i).get(matrix.size()-1)){

                temp = matrix.get(i).get(0);
                matrix.get(i).set(0, matrix.get(i).get(matrix.size()-1) );
                matrix.get(i).set(matrix.size()-1, temp);

                if(matrix.get(i).get(1) < matrix.get(i).get(matrix.size()-2)){
                    temp = matrix.get(i).get(1);
                    matrix.get(i).set(1, matrix.get(i).get(matrix.size()-2));
                    matrix.get(i).set(matrix.size()-2, temp);
                }
            }
            maxValues.add(sum);
        }
        System.out.println(maxValues.toString());
//        for (int i = 0; i < 2; i++) {
//            for (int j = 0; j < 2; j++) {
//
//            }
//        }
        return maxSum;
    }

}
