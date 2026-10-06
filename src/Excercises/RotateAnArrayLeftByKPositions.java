package Excercises;

public class RotateAnArrayLeftByKPositions {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        // Rotate the array by k positions --   // output: [3,4,5,1,2]

        int k= 2; // rotate by 2 positions
        k= k % arr.length; // modulus means remainder, it should rotate between 0 to arr.length-1, if k>arr.length, then it will rotate by k%arr.length positions

        arr = reverse(arr, 0, k-1);// reverse the first k elements -- 0,1 indexes
        System.out.println("Reversed first k elements: " + java.util.Arrays.toString(arr)); // [2, 1, 3, 4, 5]

        arr = reverse(arr, k, arr.length - 1); // reverse the remaining elements -- 2,3,4 indexes
        System.out.println("Reversed remaining elements: " + java.util.Arrays.toString(arr)); // [2, 1, 5, 4, 3]

        arr = reverse(arr, 0, arr.length - 1); // reverse the whole array
        System.out.println("Rotated array: " + java.util.Arrays.toString(arr)); // [3, 4, 5, 1, 2]

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




