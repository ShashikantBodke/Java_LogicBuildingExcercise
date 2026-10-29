package Excercises;

import java.util.Arrays;

public class ArrayProblemsRevision {
    public static void main(String[] args) {
        int[] a ={4,5,10,3,7};
        System.out.println("OG :"+Arrays.toString(a));
        //Calculate total sum of the Array !!!
        int totalSum=0;
        for(int value: a){
            totalSum=totalSum+value;
        }
        System.out.println(totalSum);

        //Calculate Avg of the array
        int totalNumberOfElements=a.length;
        double avg=((double)totalSum)/totalNumberOfElements;
        System.out.println(avg);

        //Find largest and second largest number
        int largest=Integer.MIN_VALUE ;
        int secondLargest=Integer.MIN_VALUE;

        for(int number:a){
            if(number>largest){
                secondLargest=largest;
                largest=number;
            }else if(number>secondLargest && number!=largest){
                secondLargest=number;
            }
        }
        System.out.println(secondLargest);
        System.out.println(largest);

        //reverse first half of the array
        int left=0;
        int mid=a.length/2;
        int right=mid-1;
        int temp;
        while(left<right){
            temp=a[left];
            a[left]=a[right];
            a[right]=temp;
            left++;
            right--;
        }
        System.out.println(Arrays.toString(a));
    }
}
