package Excercises;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateLettersFromString {

	public static void main(String[] args) {
		
		String input = "Java"; //Convert the string to char array
		
		Set<Character> linkedHashSet = new LinkedHashSet<Character>();
		
		char inputCharArray[]= input.toCharArray();
		
	//	String result= " ";
		StringBuilder sb=new StringBuilder();
		for (char character : inputCharArray) {
			
			if(linkedHashSet.add(character)) {
			//	result=result+character;  //J , //Ja, //Jav
				sb.append(character);
			}
		}
		System.out.println(sb);
		

	}

}
