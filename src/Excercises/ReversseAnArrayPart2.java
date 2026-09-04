package Excercises;

public class ReversseAnArrayPart2 {

	public static void main(String[] args) {
		
		int input [] = {10,20,30,40,50};
		int left=0;
		int right=input.length-1;
		
		int temp;
		for (int num : input) {
			System.out.print(num);
		}
		System.out.println(" ");
		
		while(right>left) {
			temp=input[left];
			input[left]=input[right];
			input[right]=temp;
			right--;
			left++;
		}
		
		for (int num : input) {
			System.out.print(num);
		}
		
		
	}

}
