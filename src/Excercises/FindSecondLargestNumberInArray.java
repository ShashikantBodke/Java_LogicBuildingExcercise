package Excercises;

public class FindSecondLargestNumberInArray {

	public static void main(String[] args) {
		int numbers[]= {10,20,30,40,60,75};
		
		int largest= Integer.MIN_VALUE;
		int secondLargestNumber=Integer.MIN_VALUE;	
		for(int num : numbers) {
			if(num >largest) {
				secondLargestNumber=largest;
				largest=num;
			}else if(num>secondLargestNumber & num!=secondLargestNumber){
				secondLargestNumber=num;
			}
		}
		System.out.println(largest);
		System.out.println(secondLargestNumber);
	}

}
