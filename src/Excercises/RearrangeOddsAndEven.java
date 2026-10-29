package Excercises;

import java.util.Arrays;

public class RearrangeOddsAndEven {
    public static void main(String[] args) {
        // left ---even  && right ---odd
        int[] a= {1,0,2,0,4,3,5};
        int left=0;
        int right=a.length-1;
        System.out.println("Input: "+Arrays.toString(a));

        while(left<right){
            while(left<right && a[left]%2==0){
                left++;
            }
            while(left<right && a[right]%2!=0){
                right--;
            }
            if(left<right){
                int temp=a[left];
                a[left]=a[right];
                a[right]=temp;
                left++;
                right--;
            }
           // System.out.println(Arrays.toString(a));
        }
        int evenEnd=0;
        while(evenEnd<a.length && a[evenEnd]%2 == 0){
            evenEnd++;
        }
        Arrays.sort(a,0,evenEnd);  // Even part to sort
        Arrays.sort(a,evenEnd,a.length);
     //   System.out.println("Value is : "+evenEnd);
        System.out.println("Output: "+Arrays.toString(a));








    }
}
