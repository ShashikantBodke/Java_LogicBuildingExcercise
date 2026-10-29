package Excercises;

import java.util.TreeSet;

public class FindSecondLargestNumberFromString2 {

	public static void main(String[] args) {
		String input = "a4b2c0" ;
		findSecondLargest(input);

	}

	private static void findSecondLargest(String input) {
		int num;
		char[] data=input.toCharArray();
		TreeSet<Integer> dataSet = new TreeSet<>(); // data stored in Asc order with unique
		for(char character : data) {
			if(Character.isDigit(character)){
				num=character - '0';  // converting character to num , keeping data in ASC char to get the value
				dataSet.add(num);
			}
		}
		System.out.println(dataSet);
		dataSet.pollLast();
		System.out.println(dataSet);
		System.out.println(dataSet.last());

	}


}
