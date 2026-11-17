package Excercises;

import java.util.ArrayList;
import java.util.Arrays;

public class RodCuttingProblem {
    public static void main(String[] args) {

        int[] rods ={1,1,3,4,6,5,9};

        Arrays.sort(rods);
//        System.out.println("OG: "+Arrays.toString(rods)); // sorted order

        ArrayList<Integer> rodList = new ArrayList<>();
        ArrayList<Integer> result = new ArrayList<>();
        for(int rod : rods){
            rodList.add(rod);
        }
        System.out.println("OG- Arrays : "+rodList);  // [1, 1, 3, 4, 5, 6, 9]

        while(!rodList.isEmpty()){
          //  System.out.println("rodList size: "+rodList.size());
            result.add(rodList.size());  // 7 , 5 , 4 , 3 , 2 , 1
            int shortest=rodList.get(0); // 1 , 2 , 1 , 1 , 1 , 4

            ArrayList<Integer> next = new ArrayList<>();
            for(int rod : rodList){
                if(rod == shortest){
                    //discard
                }
                else{
                    next.add(rod-shortest);           //[2,3,4,5,8] , [1,2,3,6] , [1,2,5] , [1,4] , [4] ,[]
                }
            }
            rodList=next;
        }
        System.out.println(result);
    }
}
