package Excercises;

import java.util.Arrays;

public class FindMaxProductOfTripletsSol1 {
    public static void main(String[] args) {
        //Max Product of the Triplet in the Array

        // int[] a= {-10,-3,5,6,-20};
         int[] a={5,2,4,0,7};

        //sort thr array
        Arrays.sort(a);
        int n = a.length;
        if(n<3){
            System.err.println("Minimum number of elements that should be there in an array is 3");
            System.exit(0);
        }

        System.out.println(Arrays.toString(a));

        int result1 = a[n - 1] * a[n - 2] * a[n - 3];

        int result2 = a[0] * a[1] * a[n - 1];

        int result = Math.max(result1, result2);
        System.out.println(result);


    }

}
