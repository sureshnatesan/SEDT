package mandatoryHomeWork.DSA.week16;

import java.util.Stack;

public class RemoveValidParantheses {

	
	
	/*
	 * https://leetcode.com/problems/remove-outermost-parentheses/
	 * 
	 * 
	 */
	
	
	public String removeOuterParentheses(String s) {
		if(s.charAt(0)=='(') {
			s=s.replace("(","");	
		}
		else return "";
		if(s.charAt(s.length()-1)=='(') {
			s=s.replace("(","");	
		}
		else return "";
		
		Stack<Character> stack = new Stack<>();
		
		for (int i = 0; i < s.length(); i++) {
			
			if(s.charAt(i)=='(') {
				stack.push(s.charAt(i));
			}
			else {
				if(stack.peek()==')') {
					stack.pop();
				}
				else return "";
			}
		}
		
		if(stack.isEmpty()) return s;
		else return "";
    }
}
