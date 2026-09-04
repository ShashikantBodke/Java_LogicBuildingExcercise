package Excercises;

public class PatternPrintingProgram {

	public static void main(String[] args) {
		
		int totalNumberOfLines=5;
		
		for(int row=1; row<=totalNumberOfLines; row++) {
			for(int col=1; col<=row; col++) {
				System.out.print(col);  // "*" , "aababcabcdabcde"
			}
			System.out.println("");
		}
			
	}

}
