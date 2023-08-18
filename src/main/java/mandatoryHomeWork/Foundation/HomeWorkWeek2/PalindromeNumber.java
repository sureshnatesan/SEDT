package mandatoryHomeWork.Foundation.HomeWorkWeek2;

import org.junit.Assert;
import org.junit.Test;

public class PalindromeNumber {


	/*
	 * Pseudo Code
	 * 
	 * 1. We have to reverse the number
	 * a. 
	 * 2. check the both number are same
	 * 3. if yes return true, else false
	 */


	//@Test
	public void Testdat1() {
		Assert.assertEquals(true, Soluction(121));
	}

	@Test
	public void Testdat2() {
		Assert.assertEquals(false, Soluction(-121));
	}

	@Test
	public void Testdat3() {
		Assert.assertEquals(false, Soluction(127));
	}

	public boolean Soluction(int a) {
		int out=a;
		int rev=0;
		int rem=0;
		while(a>0) {
			rem=a%10;
			rev=(rev*10)+rem;
			a=a/10;
		}
		if(out-rev==0) {
			return true;
		}
		else {
			return false;
		}

		//System.out.println();
		//System.out.println(rev);

	}
}
