package Excercises;

public class FindMaxProductOfTripletsSol2 {
    public static void main(String[] args) {
        //Max Product of the Triplet in the Array
        //Use the same logic which we used to find second-largest number in an Array
        int[] numbers={7,5,3,2,-10,-20};
        int max1=Integer.MIN_VALUE;
        int max2=Integer.MIN_VALUE;
        int max3=Integer.MIN_VALUE;
        int min1=Integer.MAX_VALUE;
        int min2=Integer.MAX_VALUE;


        for(int number: numbers){
            if(number>max1){  // add max1 value to max2 then number to max1
                max3=max2;
                max2=max1;
                max1=number;
            } else if (number>max2) { //add max2 to max3 then number to max2
                max3=max2;
                max2=number;
            } else if (number>max3) { //add max3 to number
                max3=number;
            }
            if(number<min1){
                min2=min1;
                min1=number;
            } else if (number<min2) {
                number=min2;
            }
        }
        System.out.println("Numbers are: "+max1+" "+max2+" "+max3+ " "+min1+" "+min2);

        int resultOne= max1*max2*max3;
        int resultTwo= max1*min1*min2;
//        System.out.println(resultOne);
//        System.out.println(resultTwo);
        int result = Math.max(resultOne,resultTwo);
        System.out.println(result);












    }

}
