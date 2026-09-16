package Excercises;

public class CheckIfNumberIsPalindromeOrNot {
 // A palindrome is a number that reads the same backward as forward.
 // For example, 121 is a palindrome because it reads the same from left to right and from right to left.
 // Other examples of palindromic numbers include 12321, 45654, and 789987.
	public static void main(String[] args) {
		int number=121;
		int originalNumber=number; // Store the original number to compare later
		
		int reverseNumber = 0;
		int lastDigit; // default value of lastDigit is 0
		
		while(number!=0) {
			lastDigit=number%10; // 121%10=1, 12%10=2, 1%10=1
			reverseNumber=reverseNumber*10+lastDigit;  // 0*10+1=1, 1*10+2=12, 12*10+1=121
			number=number/10;		// 121/10=12,	 12/10=1, 1/10=0
		}
			if(reverseNumber-originalNumber == 0) {
				System.out.println("Palindrome");
			}else {
				System.out.println("Not Palindrome");
			}
	}

}
