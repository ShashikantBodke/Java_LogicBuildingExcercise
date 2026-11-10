package Excercises;
/*
Diamond Pattern
            n=4

   *      i=1 , sp=3 (n-i), st=1 (2*i)-1
  ***     i=2 , sp=2  4-2 , st=3  2*2-1
 *****    i=3 , sp=1  4-3 , st=5
*******   i=4 , sp=0  4-4 , st=7



 */



public class DiamondPattern2 {
    public static void main(String[] args) {
        int n = 4; // size of the diamond

        for (int i = 1; i <= n; i++) {
            //Spaces
            for(int j = 1; j <= n-i; j++){ // 4-1 = 3 sp, 1 st,
                System.out.print(" ");
            }
            //stars
            for(int k=1; k<=(2*i)-1; k++){
                System.out.print("*");
            }
            System.out.println();
        }

        // Reverse the code now for bottom part

        for (int i = n-1; i >= 1; i--) {
            //Spaces
            for(int j = 1; j <= n-i; j++){
                System.out.print(" ");
            }
            //stars
            for(int k=1; k<=(2*i)-1; k++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}