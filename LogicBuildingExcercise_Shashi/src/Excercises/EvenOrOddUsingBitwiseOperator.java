package Excercises;

public class EvenOrOddUsingBitwiseOperator {

	public static void main(String[] args) {

		
		int number=7;
		
		if((number & 1) ==1) {
			System.out.println("Number is Odd");
		}else {
			System.out.println("Number is Even");
		}
		
	}

}
