package Excercises;

public class CheckPangramWithCollectionSet {

	public static void main(String[] args) {
		// Should have >=26 letters, 
		//" The quick brown fox jumps over the lazy dog"
        String input="The quick brown fox jumps over the lazy dog";
        input=input.toLowerCase();
		System.out.println(input);
        boolean result=checkPangram(input);
        if(result) {
        	System.out.println("It's a Pangram");
        }
        else {
        	System.out.println("Not a Pangram");
        }
	}

	private static boolean checkPangram(String input) {
		if(input.length()<26) {
			return false;
		}
		for(char i='a'; i<='z';i++) {
			if(input.indexOf(i)<0) {
				return false;
			}
		}
		return true;
	}

}
