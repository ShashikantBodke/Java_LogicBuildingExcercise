package Excercises;

import java.util.Arrays;

public class MovedAllZerosToLastAndSortsTheArray {
    public static void main(String[] args) {
        //VIMP

        int[] inputList = {1,3,0,4,2,0,5,0,7,6,0,9,8};
        int index=0;
        System.out.println(Arrays.toString(inputList));
        System.out.println("array length: " +inputList.length );

        for(int number : inputList){
            if(number!=0){
              //  System.out.print(number);
                inputList[index]=number;
                index++;
            }
        }
        for(int i=index;i<=inputList.length-1;i++){
            inputList[i]=0;
        }

        Arrays.sort(inputList,0,index); //sorting
        System.out.println(index); //non-zero count

        for(int i=index;i<=inputList.length-1;i++){
            inputList[index]=0;
        }
        System.out.println(Arrays.toString(inputList));
    }
}
