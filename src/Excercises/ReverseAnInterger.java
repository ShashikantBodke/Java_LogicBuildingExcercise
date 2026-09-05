package Excercises;

public class ReverseAnInterger {

	public static void main(String[] args) {
		
		int number=210;
		int reverseNumber=0;
		int lastDigit;
		
		
		while(number!=0) {
		 lastDigit=number%10;
		 
		 //check overflow condition
		 if(reverseNumber>Integer.MAX_VALUE/10 ||(reverseNumber==Integer.MAX_VALUE/10 && lastDigit >7)) {
			 System.out.println(0);
			 System.exit(0);//underflow, return 0;
		 }
		 if(reverseNumber<Integer.MAX_VALUE/10 ||(reverseNumber==Integer.MIN_VALUE/10 && lastDigit <-8)) {
			 System.out.println(0);
			 System.exit(0);//underflow, return 0;
		 }
		 
		 
		 reverseNumber=reverseNumber*10+lastDigit;
		 number=number/10;
		}
		
		System.out.println("reverse number is "+reverseNumber);
		
		
		
		
		
		
		
		
		
		
		
		
		

	}
	

}
