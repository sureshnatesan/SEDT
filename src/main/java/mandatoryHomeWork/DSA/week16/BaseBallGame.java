package mandatoryHomeWork.DSA.week16;

import java.util.Stack;

import org.junit.Test;

public class BaseBallGame {


	/*
	 * 
	 * https://leetcode.com/problems/baseball-game/
	 */

	@Test
	public void testData(){
		String[] a= {"5","2","C","D","+"};
		System.out.println(calPoints(a));
	}

	public int calPoints(String[] operations) {
		Stack<Integer> stack = new Stack<>();
		int sum=0;
		for (int i = 0; i < operations.length; i++) {
			switch (operations[i]) {
			case "+": {
				Integer peek1 = stack.peek();
				stack.pop();
				Integer peek2 = stack.peek();
				stack.push(peek1);
				stack.push(peek1+peek2);

				break;	
			}
			case "D": {
				Integer peek = stack.peek();
				stack.push(peek*2);
				break;	
			}
			case "C": {
				stack.pop();
				break;	
			}
			default:
				stack.push(Integer.parseInt(operations[i]));
			}
		}

		while(!stack.isEmpty()) {
			sum+=stack.peek();
			stack.pop();
		}
		return sum;
	}
}
