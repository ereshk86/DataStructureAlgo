//https://practice.geeksforgeeks.org/problems/parenthesis-checker2744/1https://practice.geeksforgeeks.org/problems/parenthesis-checker2744/1
package practice.stack;

import java.util.Stack;

public class ParenthesisChecker {
	public static void main(String[] args) {
		String s = "[({[([{}])]})]";
		boolean r = ispar(s);
		System.out.println(r);
	}

	private static boolean ispar(String s) {
		Stack<Character> stack = new Stack();
		for (int i = 0; i < s.length(); i++) {
			if (!stack.isEmpty()) {
				char temp = stack.peek();
				if (temp == '{' && s.charAt(i) == '}')
					stack.pop();
				else if (temp == '(' && s.charAt(i) == ')')
					stack.pop();
				else if (temp == '[' && s.charAt(i) == ']')
					stack.pop();
				else
					stack.push(s.charAt(i));
			} else {
				stack.push(s.charAt(i));
			}
		}
		if (stack.isEmpty()) {
			return true;
		}
		return false;
	}
}
