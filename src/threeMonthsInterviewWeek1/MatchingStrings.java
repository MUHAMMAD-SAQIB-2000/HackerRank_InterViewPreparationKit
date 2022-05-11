package threeMonthsInterviewWeek1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MatchingStrings {

    public static void main(String[] args) {
        System.out.println(matchingStrings(Arrays.asList("aba","baba", "aba", "xzxb"), Arrays.asList("aba", "xzxb", "ab")).toString());
    }
    public static List<Integer> matchingStrings(List<String> strings, List<String> queries) {
        List<Integer> matches = new ArrayList<>();

        for (int i = 0; i < queries.size(); i++) {
            int count = 0;
            for (int j = 0; j < strings.size(); j++) {
                if(queries.get(i).equals(strings.get(j))){
                    count++;
                }
            }
            matches.add(count);
        }
        return matches;
    }

}
