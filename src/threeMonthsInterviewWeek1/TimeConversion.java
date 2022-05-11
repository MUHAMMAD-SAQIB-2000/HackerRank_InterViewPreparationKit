package threeMonthsInterviewWeek1;

import java.text.DecimalFormat;

public class TimeConversion {

    public static void main(String[] args) {
        System.out.println(timeConversion("12:05:45AM"));
    }

    public static String timeConversion(String s) {
        if(s.length() == 0){
            return "";
        }

        String[] str = s.split(":");
        int hour = Integer.parseInt(str[0]);

        if(s.contains("PM")){
            if(hour != 12){
                hour += 12;
            }

        } else {
            if(hour == 12){
                hour -= 12;
            }
        }

        String time = "";
        for (int i = 1; i < str.length; i++) {
            time += str[i];
            if(i != str.length-1){
                time +=  ":";
            }
        }
        DecimalFormat df = new DecimalFormat("00");
        time = df.format(hour) +":"+ time;
        return time.substring(0, time.length()-2);
    }
}
