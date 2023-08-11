package Week6;

import java.math.BigInteger;

import org.junit.Test;

public class Factorial {

	/*
	 * Ip-->int
	 * OP-->int
	 * Pseudo code
	 * 1. Create a int variable to store the factorial value with 1 as the initial value
	 * 2. Create a for loop for iteration upto the inputvalue
	 * 3.  Mulpitle the factorial with iterate value
	 * 
	 * 
	 *---------------------------------
	 *Pseudo code
	 *1. use the BigInteger to store the bigger value
	 *2.Create a for loop to iterate and use the bigInteger multiple operation
	 *
	 * 
	 * TC
	 * 
	 * P-> 5,8,13
	 * N/E->0
	 */

	@Test
	public void PostiveData() {
		System.out.println(soluction(17));

	}
	
	
	public BigInteger soluction(int s) {
		BigInteger value = BigInteger.ONE;
		
		for (int i = s; i >=2; i--) {
			value=value.multiply(BigInteger.valueOf(i));
		}
	//return	value.intValue();
	
	return value;
		/*
		if(s==0) {
			return 0;
		}
		BigInteger sum=1;
		for (int i = 2; i <=s; i++) {
			sum=valueOf*i;
		}
		return sum;
		*/
	}

}
