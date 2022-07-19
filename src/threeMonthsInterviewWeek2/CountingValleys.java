package threeMonthsInterviewWeek2;

public class CountingValleys {

    public static void main(String[] args) {
        System.out.println(countingValleys(8, "UDDDUDUU"));
        System.out.println(countingValleys(12, "DDUUDDUDUUUD"));
    }

    public static int countingValleys(int steps, String path) {
        int valleys = 0;
        int stepsTaken = 0;
        for (int i = 0; i < steps; i++) {
            if(path.charAt(i) == 'U'){
                if(stepsTaken == -1){
                    valleys++;
                }
                stepsTaken++;
            }
            if(path.charAt(i) == 'D') {
                stepsTaken--;
            }

        }
        return valleys;
    }

}
