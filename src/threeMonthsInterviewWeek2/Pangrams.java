package threeMonthsInterviewWeek2;

import java.util.HashSet;
import java.util.Set;

public class Pangrams {

    public static void main(String[] args) {
        System.out.println(pangrams("We promptly judged antique ivory buckles for the next prize"));
        System.out.println(pangrams("qmExzBIJmdELxyOFWv LOCmefk TwPhargKSPEqSxzveiun"));
    }

    public static String pangrams(String s) {
        Set<Character> alphabets = new HashSet<>(); // using set to store non duplicate values
        s = s.toLowerCase().replace(" ", ""); // replacing whitespaces and converting to lower case
        for (int i = 0; i < s.length(); i++) {
            alphabets.add(s.charAt(i));
        }
        return (alphabets.size() == 26 ? "panagram" : "not panagram");
    }

}
