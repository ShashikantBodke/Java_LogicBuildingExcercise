package Excercises;

public class LinearSearchingInArray {

	public static void main(String[] args) {

		int numbers[]= {10,20,30,5,40};
		int key=5; // number we want to search present in the given array
		
//		for(int index=0; index<=numbers.length-1;index++) {
//			if(numbers[index]==key) {
//				System.out.println("Element found on the index "+index);
//				break;
//			}
//		}
		
		//2. Using for each loop and flag 
		boolean isPresent=false;
		for(int num : numbers) {
			if(num==key) {
				isPresent=true;
				break;
			}
		}
		
	}

}
