package Excercises;

public class ArmstrongNumberCheck {

	public static void main(String[] args) {
		
		int number=153;
		int armstrongNumber=0;
		int lastDigit;
		int copyNumber=number;
		
		while(copyNumber!=0) {
			lastDigit=copyNumber%10;
			armstrongNumber=armstrongNumber+(lastDigit*lastDigit*lastDigit);
			copyNumber=copyNumber/10;
		}
		if(number==armstrongNumber) {
			System.out.println("It's an armstrong number");
		}else {
			System.out.println("Not an armstrong number");
		}
	}

}
