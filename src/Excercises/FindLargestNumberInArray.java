package Excercises;

public class FindLargestNumberInArray {

	public static void main(String[] args) {
		int numbers[]= {10,20,30,40,60,50};
		
		int largest=numbers[0];
		for(int index=1; index<=numbers.length-1;index++) {
			if(numbers[index]>largest) {
				largest=numbers[index];
			}
		}
		
	}

}
