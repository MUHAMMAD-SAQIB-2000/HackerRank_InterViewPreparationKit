package threeMonthsInterviewWeek2;

public class MarsExploration {

    public static void main(String[] args) {
        System.out.println(marsExploration("SOSOOSOSOSOSOSSOSOSOSOSOSOS"));
    }

    public static int marsExploration(String s) {
        int changedLetters = 0;
        for (int i = 0; i < s.length(); i = i + 3) {
            if(s.charAt(i) != 'S'){
                changedLetters++;
            }
            if(s.charAt(i + 1) != 'O'){
                changedLetters++;
            }
            if(s.charAt(i + 2) != 'S'){
                changedLetters++;
            }
        }
        return changedLetters;
    }
}
