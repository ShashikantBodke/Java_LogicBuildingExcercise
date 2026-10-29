package Excercises;

public class MountainArrayCheck {
    public static void main(String[] args) {

        int[] a = {1,3,5,10,4,2,0};
        boolean result=mountainArrayCheck(a);
        System.out.println(result);
    }

    // IMP --- Check array first, is it mountain array , number of element length, element must be ingreasing and decreasing like stair case



//    private static boolean mountainArrayCheck(int[] a) {
//        // 1. Length of the array must be greater than 2
//        if (a.length < 3) {
//            return false;
//        }
//        // 2. Element must be an increasing order
//        int i = 0;
//        while (i+1<a.length && a[i] < a[i + 1]) {
//            i++;
//        }
//        while (i+1<a.length && a[i] > a[i + 1]) {
//            i++;
//        }
//        return a.length-1 == i;
//    }

    private static boolean mountainArrayCheck(int[] a) {
        if (a == null || a.length < 3) {
            return false;
        }

        int i = 0;
        while (i + 1 < a.length && a[i] < a[i + 1]) {
            i++;
        }

        if (i == 0 || i == a.length - 1) {
            return false;
        }

        while (i + 1 < a.length && a[i] > a[i + 1]) {
            i++;
        }

        return i == a.length - 1;
    }




}
