package Excercises;

public class LeaderInTheArray {
    public static void main(String[] args) {
        //*********************IMP***************************
        //Leader number is identified by a number, number to the right in the Arrays are less that the current largets nymber
        int[]a={16,17,4,3,5,2};

        int length=a.length;
        int maxRight=a[length-1];
        System.out.println(maxRight);
        for(int index=length-2;index>=0;index--){
            if(a[index]>maxRight){
                maxRight=a[index];
                System.out.println(maxRight);
            }
        }

    }
}
