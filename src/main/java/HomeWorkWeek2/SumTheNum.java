package HomeWorkWeek2;

import org.junit.Test;

import junit.framework.Assert;

public class SumTheNum {
	
	/*
	 * pseudo code
	 * 1.create variable named as rem and output, used to store the reminder
	 * 2. create the while loop with out>9
	 * 3.use the moduler and dsiv operator to sume value
	 * 
	 * 
	 */
	@Test
	public void testdata() {
		int a=147;
		a=soluction(a);
		if(a>9) {
			soluction(soluction(a));
		}
		else {
			Assert.assertEquals(3, soluction(a));
		}
	}
	
	@Test
	public void testdata1() {
		int a=38;
		a=soluction(a);
		if(a>9) {
			soluction(soluction(a));
		}
		else {
			Assert.assertEquals(2, soluction(a));
		}
	}
	
	@Test
	public void testdata3() {
		int a=0;
		a=soluction(a);
		if(a>9) {
			soluction(soluction(a));
		}
		else {
			Assert.assertEquals(0, soluction(a));
		}
	}
	

	public int soluction(int a) {
		int rem=0;
		int output=0;
		while(a>0) {
			rem=a%10;
			output=output+rem;
			a=a/10;
		}
		return output;
	}
}
