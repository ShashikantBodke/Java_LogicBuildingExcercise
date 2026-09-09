package Excercises;

public class RotateAnArrayRightByKPositions {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        // Rotate the array by k positions --   // output: [5, 6, 7, 1, 2, 3, 4]

        int n= 3; // rotate by 3 positions
        int k= n % arr.length; // modulus means remainder

        int left = 0;
        int right = arr.length - 1;

        arr = reverse(arr, left, right);
        System.out.println("Reversed array: " + java.util.Arrays.toString(arr)); // [7, 6, 5, 4, 3, 2, 1]

        arr=reverse(arr, left, k - 1);
        System.out.println("Reversed array: " + java.util.Arrays.toString(arr)); // [5, 6, 7, 4, 3, 2, 1]

        arr=reverse(arr, k, right); // right= arr.length-1
        System.out.println("Rotated array: " + java.util.Arrays.toString(arr)); // [5, 6, 7, 1, 2, 3, 4]
    }

    private static int[] reverse(int[] arr, int left, int right) {
        //reverse the array from left to right --> 2 Pointer approach
        int temp;
        while (left < right) {
            temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        return arr;
    }




//        rotate(arr, k);
//        for (int num : arr) {
//            System.out.print(num + " ");
//        }

    }

//    public static void rotate(int[] arr, int k) {
//        k = k % arr.length;
//        reverse(arr, 0, arr.length - 1);
//        reverse(arr, 0, k - 1);
//        reverse(arr, k, arr.length - 1);
//    }
//    public static void reverse(int[] arr, int start, int end) {
//        while (start < end) {
//            int temp = arr[start];
//            arr[start] = arr[end];
//            arr[end] = temp;
//            start++;
//            end--;
//        }
//    }




