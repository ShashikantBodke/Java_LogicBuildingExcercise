package Excercises;

public class PatternPrintingProgram4 {

	public static void main(String[] args) {
		
		int totalNumberOfLines=5;
		
		for(int row=1; row<=totalNumberOfLines; row++) {
			for(int col=1; col<=row; col++) {
			 // Hallow Pyramid
				if(col==1 || col==row) {
					System.out.print(col);
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println(" ");
		}
			
	}

}
