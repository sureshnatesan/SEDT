package Week6;

import org.junit.Test;

import junit.framework.Assert;

public class DuckNumberTest {

	/*
	 * 
	 * Pseudo code
	 * 1. Convert the string to int, which helps us to remove the leading zero
	 * 2. use the modular operator to get the reminder and check for zero
	 * 3. if zero present return true
	 */

	@Test
	public void postiveData() {
		Assert.assertEquals(true, soluction("3056"));
		Assert.assertEquals(true, soluction("10045"));
		Assert.assertEquals(true, soluction("-770"));
	}
	
	@Test
	public void negativeData() {
		int a=0144;
		Assert.assertEquals(false, soluction("0144"));
		Assert.assertEquals(false, soluction("0123"));
	}
	
	@Test
	public void edgeData() {
		//Assert.assertEquals(true, soluction("0"));
		Assert.assertEquals(true, soluction("010"));
		Assert.assertEquals(false, soluction("000001"));
		Assert.assertEquals(false, soluction("-00001"));
	}
	

	public boolean soluction(String s) {
		int a=Integer.parseInt(s);
		a=a*1;
		if(a<0) {
			a=a*-1;
		}
		else if(a==0) {
			return true;
		}
		while(a>0) {
			if(a%10==0) {
				return true;
			}
			a=a/10;
		}
		return false;

	}

}
