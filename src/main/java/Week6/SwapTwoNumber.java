package Week6;

import org.junit.Test;

public class SwapTwoNumber {

	/*
	 * Pseudo code
	 * 1. Consider a input int a & b
	 * 2.Sum two number of the input and assign to variable a
	 * 3.subtract a-b and assign to b and perform same operation to get value for a
	 * 
	 */
	
	@Test
	public void testData(){
		soluction(98,35);
	}

	public void soluction(int a, int b) {
		a=a+b;
		b=a-b;
		a=a-b;

		System.out.println("a "+a);
		System.out.println("b "+b);
	}

}
