package Excercises;

public class ArmstrongNumberCheck {

	public static void main(String[] args) {
		//Armstrong number is a number that is equal to the sum of its own digits raised to the power of the number of digits.
		// For example, 153 is an Armstrong number because 1^3 + 5^3 + 3^3 = 153.
		int number=153; // Other examples: 0, 1, 153, 370, 371, 407
		int armstrongNumber=0;
		int lastDigit;
		int copyNumber=number;
		
		while(copyNumber!=0) {
			lastDigit=copyNumber%10; // example: 153%10=3, 15%10=5, 1%10=1
			armstrongNumber=armstrongNumber+(lastDigit*lastDigit*lastDigit); // example: 0+(3*3*3)=27, 27+(5*5*5)=152, 152+(1*1*1)=153
			copyNumber=copyNumber/10; // example: 153/10=15, 15/10=1, 1/10=0
		}
		if(number==armstrongNumber) {
			System.out.println("It's an Armstrong number");
		}else {
			System.out.println("Not an Armstrong number");
		}
	}

}
