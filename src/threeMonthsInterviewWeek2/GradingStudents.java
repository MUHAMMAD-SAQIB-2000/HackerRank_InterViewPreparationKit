package threeMonthsInterviewWeek2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GradingStudents {

    public static void main(String[] args) {
        System.out.println(gradingStudents(Arrays.asList(4, 73, 67, 38, 33)).toString());
    }

    public static List<Integer> gradingStudents(List<Integer> grades) {
        List<Integer> resultingGrades = new ArrayList<>();
        for(Integer grade : grades){
            int temp = grade;
            if(grade < 38){
                resultingGrades.add(grade);
            } else {
                int addUp = 0;
                while (grade % 5 != 0){
                    grade++;
                    addUp++;
                }
                if(addUp < 3){
                    resultingGrades.add(grade);
                } else{
                    resultingGrades.add(temp);
                }
            }
        }
        return resultingGrades;
    }
}
