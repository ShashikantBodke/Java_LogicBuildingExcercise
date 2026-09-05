package Excercises;

import java.util.Stack;

public class ValidParanthesis {

	public static void main(String[] args) {
		
		String input= "(())";
		System.out.println(checkParanthesis(input));

	}
	
	private static boolean checkParanthesis(String input) {
		
		char inputArray[]=input.toCharArray();
		Stack<Character> stack = new Stack<Character>();
		for(char currentChar:inputArray) {
			if(currentChar== '(') {
				stack.push(currentChar);
			}else {
				if(currentChar==')') {
					if(stack.isEmpty()) {
						return false; // mismatch occurred, no opening bracket
					}
					else {
						char topchar = stack.pop();
						if(topchar!='(') {
							return false;
						}
					}
				}
			}
		}
		
		
		
		
		
		
		return stack.isEmpty();
	}

}
