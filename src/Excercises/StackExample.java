package Excercises;

import java.util.Stack;

public class StackExample {

	public static void main(String[] args) {
		
		Stack<String> stack = new Stack<String>();
		stack.push("Java");
		stack.push("TypeScript");
		stack.push("JavaScript");
		stack.push("Python");
		System.out.println(stack);
		
		String topElement=stack.peek();
		System.out.println(topElement);
		
		String elementOutFromStack=stack.pop(); // remove the element and return the value
		System.out.println(elementOutFromStack);
		
		topElement=stack.peek(); // not remove but return the value
		System.out.println(topElement);
		
		System.out.println(stack.isEmpty()); // true - if empty & false - if not empty
		
		
		int searchPosition=stack.search("TypeScript");
		System.out.println(searchPosition); // Position from top to bottom (1 to 4)
	}

}
