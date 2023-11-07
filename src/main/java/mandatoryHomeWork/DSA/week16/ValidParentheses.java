package mandatoryHomeWork.DSA.week16;

import java.util.Stack;

import org.junit.Test;

public class ValidParentheses {
	/*
	 * https://leetcode.com/problems/valid-parentheses/
	 */

	@Test
	public void testData(){
		//soluction("(())");
	}


	public boolean soluction(String s) {

		Stack<Character> stack1=new  Stack();
		for (int i = 0; i < s.length(); i++) {


			switch (s.charAt(i)) {
			case ')': {
				if(!stack1.isEmpty()&& stack1.peek()=='(') {
					stack1.pop();
				}
				else
					return false;
				break;
			}
			case '}': {

				if(!stack1.isEmpty()&&stack1.peek()=='{') {
					stack1.pop();
				}
				else
					return false;
				break;
			}
			case ']': {

				if(!stack1.isEmpty()&&stack1.peek()=='[') {
					stack1.pop();
				}
				else
					return false;
				break;
			}
			default:
				stack1.push(s.charAt(i));
			}
		}
		if( stack1.isEmpty()) return true;
		else return false;
	}

}
