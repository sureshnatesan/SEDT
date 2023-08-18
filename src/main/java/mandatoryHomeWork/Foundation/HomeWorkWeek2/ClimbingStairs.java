package mandatoryHomeWork.Foundation.HomeWorkWeek2;

import org.junit.Test;

public class ClimbingStairs {

	/*
	 * Pseudo code
	 * 1. for input value, what are the possible way reach stairs
	 * only by using 1 ,2
	 * 2. example 3--> 1+1+1,2+1
	 * 

	 */

	@Test
	public void testData() {

		System.out.println(soluction(2));
	}

	public int soluction(int n) {

		if(n==0|| n==1) {
			return n;
		}

		int n1=0;
		int n2=1;
		int sum=0;

		for (int i = 0; i < n; i++) {
			sum=n1+n2;
			n1=n2;
			n2=sum;
		}

		return n1+n2;
	}
}
