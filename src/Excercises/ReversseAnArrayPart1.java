package Excercises;

public class ReversseAnArrayPart1 {

	public static void main(String[] args) {
		
		int input [] = {10,20,30,40};
		int reverseInput[]= new int[input.length];
		
		int reverseIndex=0;
		for(int index=input.length-1;index>=0;index--) {
			reverseInput[reverseIndex]=input[index];
			reverseIndex++;
		}
		
		for(int num : reverseInput) {
			System.out.print(num + " ");
		}
		
		System.out.println(" ");
		input=reverseInput;
		for(int num : input) {
			
		}
	}

}
