package threeMonthsInterviewWeek1;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class CamelCase4 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

//        String line = scan.nextLine();
        List<String> list = Arrays.asList("S;M;plasticCup()", "C;V;mobile phone", "C;C;coffee machine", "S;C;LargeSoftwareBook", "C;M;white sheet of paper", "S;V;pictureFrame");

        for (String line : list) {
            String[] split = line.split(";");

            String operation = split[0]; //S or C
            String label = split[1]; // V, C, M
            String word = split[2]; // any String
            String result = "";

            if(operation.equals("S")){
                result = splitString(label, word);
            } else if(operation.equals("C")){
                result = combineString(label, word);
            }
            System.out.println(result);
        }
    }

    public static String splitString(String label, String word){
        if(label.equals("M")){
            word = word.substring(0, word.length()-2);
        }
        String result = fromCamelCaseToLowerCase(word);
        return result;
    }

    private static String fromCamelCaseToLowerCase(String s){
        String result = "";
        String[] temp = s.split("(?=\\p{Upper})");
        for (int i = 0; i < temp.length; i++) {
            result += temp[i].toLowerCase() + " ";
        }
        return result.trim();
    }

    public static String combineString(String label, String word) {
        String[] subWords = word.split(" ");
        String result = "";

        if(label.equals("V") || label.equals("M")){
            result += subWords[0];
        } else if (label.equals("C")){
            result += getCapitalizedWord(subWords[0]);
        }

        for (int i = 1; i < subWords.length; i++) {
            result += getCapitalizedWord(subWords[i]);
        }
        if(label.equals("M")){
            result += "()";
        }
        return result;
    }

    private static String getCapitalizedWord(String s){
        return (s.substring(0, 1).toUpperCase() + s.substring(1));
    }

}
