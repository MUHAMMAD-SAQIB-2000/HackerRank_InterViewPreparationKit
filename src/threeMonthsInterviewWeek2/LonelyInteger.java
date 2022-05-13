package threeMonthsInterviewWeek2;

import java.util.Arrays;
import java.util.List;

public class LonelyInteger {

    public static void main(String[] args) {
        System.out.println(lonelyinteger(Arrays.asList(1,2,3,4,3,2,1)));
        System.out.println(lonelyinteger(Arrays.asList(1,1,2)));
        System.out.println(lonelyinteger(Arrays.asList(0,0,1,2,1)));
    }

    public static int lonelyinteger(List<Integer> a) {
        if(a.size() == 1){
            return a.get(0);
        }
        int lonely = 0;
        for (int i = 0; i < a.size(); i++) {
            int count = 0;
            int index = 0;
            for (int j = 0; j < a.size(); j++) {
                if(a.get(i) == a.get(j)){
                    count++;
                    index = j;
                }
            }
            if(count == 1){
                lonely = a.get(index);
            } else {
                count = 0;
                index = 0;
            }
        }
        return lonely;
    }

}


