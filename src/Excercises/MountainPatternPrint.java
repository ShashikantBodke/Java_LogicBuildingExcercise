package Excercises;

public class MountainPatternPrint {
    public static void main(String[] args) {

        int n = 5;
        for (int row = 1; row <= n; row++) { // number of rows
            for (int col = 1; col <= row; col++) { // number of column
                System.out.print(col);
            }
            System.out.println(" ");
        }

        for(int row=n-1;row>=1;row--){
            for (int col = 1; col <= row; col++) {
                System.out.print(col);
            }
            System.out.println(" ");
        }


    }
}
