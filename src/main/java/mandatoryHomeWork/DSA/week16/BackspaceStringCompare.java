package mandatoryHomeWork.DSA.week16;

import java.util.Stack;

import org.junit.Test;

public class BackspaceStringCompare {

	/*
	 * 
	 * https://leetcode.com/problems/backspace-string-compare/
	 */


	@Test
	public void testData(){
		System.out.println(backspaceCompare("a##c","#a#c"));
	}

	public boolean backspaceCompare(String s, String t) {
		Stack<Character> stack1 = new Stack<>();
		Stack<Character> stack2 = new Stack<>();

		for(char a:s.toCharArray()){
			if(a=='#') {
				try {
					stack1.pop();
				} catch (Exception e) {
					// TODO: handle exception
				}
				
			}
			else {
				try {
					stack1.push(a);
				} catch (Exception e) {
					
				}
				
			}
			
		}
		for(char a:t.toCharArray()){
			if(a=='#') {
				try {
					stack2.pop();
				} catch (Exception e) {
					// TODO: handle exception
				}
				
			}
			else {
				try {
					stack2.push(a);
				} catch (Exception e) {
					// TODO: handle exception
				}
					
			}
			
		}
		if(stack1.equals(stack2))return true;
		else return false;
	}
}
