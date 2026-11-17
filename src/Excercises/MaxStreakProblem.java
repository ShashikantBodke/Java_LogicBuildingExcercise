package Excercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MaxStreakProblem {
    public static void main(String[] args) {

        List<String> weekLogs = Arrays.asList("YYY","YNY","YYY","YYY","YYY");
        calculatMaxStreak(weekLogs);
    }

    private static void calculatMaxStreak(List<String>weekLogs){
        int currentStreak=0;
        int maxStreak=0;

        for(String data:weekLogs){
            if(!data.contains("N")){
           //     System.out.println(data);
            currentStreak=currentStreak+1;
            maxStreak=Math.max(currentStreak,maxStreak);
            }else{
                currentStreak=0;
            }
        }
        System.out.println("Max Streak Count: "+maxStreak);
    }
}
