package Excercises;

public class PrintTheLengthOfLastWord {

	public static void main(String[] args) {

		String s = "  Hello World Moon         ";
		System.out.println(s);
	//	s = s.trim();
		System.out.println(s);

		char inputArray[] = s.toCharArray();
		int count = 0;

		for (int i = inputArray.length-1; i >= 0; i--) {

			if (inputArray[i] != ' ') {
				count = count + 1;
			} else {
				if (count > 0) {
					System.out.println(count);
					if(count%2==0) {
						System.out.println("Count is even");
					}else {
						System.out.println("Count is odd");
					}
					break;
				}

			}

		}

	}

}
