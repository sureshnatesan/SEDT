package mandatoryHomeWork.DSA.week16;

import java.util.Stack;

public class BackspaceStringCompare {

	/*
	 * 
	 * https://leetcode.com/problems/backspace-string-compare/
	 */


	public void testData(){

	}

	static boolean isSameStack(Stack<Character> stack1, 
			Stack<Character> stack2)
	{
		// Create a flag variable
		boolean flag = true;

		// Check if size of both stacks are same
		if (stack1.size() != stack2.size())
		{
			flag = false;
			return flag;
		}

		// Until the stacks are not empty
		// compare top of both stacks
		while (stack1.empty() == false)
		{
			// If the top elements of both stacks
			// are same
			if (stack1.peek() == stack2.peek())
			{
				// Pop top of both stacks
				stack1.pop();
				stack2.pop();
			}
			else
			{
				// Otherwise, set flag to false
				flag = false;
				break;
			}
		}

		// Return flag
		return flag;
	}

	/*public boolean backspaceCompare(String s, String t) {
		Stack<Character> stack1 = new Stack<>();
		Stack<Character> stack2 = new Stack<>();

		for(char a:s.toCharArray()){
			if(a=='#') {
				stack1.pop();
			}
			stack1.push(a);
		}
		for(char a:t.toCharArray()){
			if(a=='#') {
				stack2.pop();
			}
			stack2.push(a);
		}
		System.out.println(isSameStack(stack1, stack2));
	}*/
}
