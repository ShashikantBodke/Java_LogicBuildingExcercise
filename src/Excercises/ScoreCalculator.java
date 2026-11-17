package Excercises;

import java.util.HashMap;

public class ScoreCalculator {
    public static void main(String[] args) {

        String erica="EMH";
        String bob="HME";

        if(erica.length() != bob.length()){
            System.err.println("Length of Erica & Bob should be same");
            System.exit(0);
        }

        //scorecard : Map
        HashMap<Character,Integer> scoreCard = new HashMap<>();
        scoreCard.put('E',1);
        scoreCard.put('M',3);
        scoreCard.put('H',5);

        int erica_FinalScore=0;
        int bob_FinalScore=0;

        for(int i=0; i<erica.length();i++){
            char ericaPointer=erica.charAt(i);
            char bobPointer=bob.charAt(i);

            erica_FinalScore=erica_FinalScore+scoreCard.get(ericaPointer);
            bob_FinalScore=bob_FinalScore+scoreCard.get(bobPointer);
        }

        if(erica_FinalScore>bob_FinalScore) {
            System.out.println("Winner is Erica "+erica_FinalScore);
        } else if (erica_FinalScore < bob_FinalScore) {
            System.out.println("Winner is Bob "+bob_FinalScore);
        } else if (erica_FinalScore==bob_FinalScore) {
            System.out.println("It's a Tie ");
        }
    }
}
