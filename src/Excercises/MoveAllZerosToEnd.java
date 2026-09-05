package Excercises;

public class MoveAllZerosToEnd {

	public static void main(String[] args) {
		
		int a[] = {1,0,2,0,3,0,4};
		
		int putNonZeroValuesHere=0;
		int temp; //Swapping 
		
		
		for(int current=0; current<=a.length-1;current++) {
			if(a[current]!=0) {
				// Swapping
				temp=a[putNonZeroValuesHere];
				a[putNonZeroValuesHere]=a[current];
				a[current]=temp;
				putNonZeroValuesHere++;
			}
		}
		
		for(int num : a ) {
			System.out.println(num);
		}

	}

}
