package Week5;

import org.junit.Test;

import junit.framework.Assert;

public class Rev {
	
	@Test
	public void testData() {
		Assert.assertEquals(2, reverse_digit(200));
	}
	@Test
	public void testData1() {
		Assert.assertEquals(221, reverse_digit(122));
	}

	public int reverse_digit(int n)
	{
		int rev =0;
		while(n>0){
			int rem= n%10;
			rev=rev*10+rem;
			n=n/10;

		}
		return rev;
	}

}
