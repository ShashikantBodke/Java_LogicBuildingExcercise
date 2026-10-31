package Excercises;

import java.util.HashSet;

public class FindUniqueElementsInsideArray2 {
    public static void main(String[] args) {

        int[] numbers= {1,2,3,1,2};

        for(int i=0; i<numbers.length;i++){
            int count=0;
            for(int j=0; j<numbers.length;j++){
                if(numbers[i]==numbers[j]){
                    count++;
                }
            }
            if(count==1){
                System.out.println(numbers[i]);
            }
        }




    }
}
