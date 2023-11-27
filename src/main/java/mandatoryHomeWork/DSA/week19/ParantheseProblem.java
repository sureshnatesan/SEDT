package mandatoryHomeWork.DSA.week19;

import java.util.Stack;

import org.junit.Test;

public class ParantheseProblem {


	/*
	 * ({[]})
	 */

	@Test
	public void testData() {
		String s="({[]})";
		System.out.println(soluction(s));
	}

	private boolean soluction(String s) {
		Stack<Character> stack = new Stack<>();

		for (int i = 0; i < s.length(); i++) {
			if(s.charAt(i)=='{'||s.charAt(i)=='['||s.charAt(i)=='(') {
				stack.push(s.charAt(i));
				continue;
			}

			switch (s.charAt(i)){
			case '}': {
				char d=stack.pop();
				if(d=='['||d=='(') {
					return false;
				}
				
				break;
			}
			case ')': {

				char d=stack.pop();
				if(d=='['||d=='{') {
					return false;
				}
				break;
			}
			case ']': {

				char d=stack.pop();
				if(d=='('||d=='{') {
					return false;
				}
				break;
			}
			default:
				throw new IllegalArgumentException("Unexpected value: " + s.charAt(i));
			}
			
			
		}
		return(stack.isEmpty());
	}
}
