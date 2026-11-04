package Excercises;

public class FindLargestNumberInArray {

	public static void main(String[] args) {
		// This program finds the largest number in an array of integers.
		// It initializes the largest number to the first element of the array and then iterates through the array,
		// updating the largest number whenever it finds a larger element.

		int[] numbers = {10,20,30,40,60,50};
		
		int largest=numbers[0];
		for(int index=1; index<=numbers.length-1;index++) {
			if(numbers[index]>largest) {
				largest=numbers[index];
			}
		}
		
	}

}
