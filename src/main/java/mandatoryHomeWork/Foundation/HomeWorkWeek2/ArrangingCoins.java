package mandatoryHomeWork.Foundation.HomeWorkWeek2;

import org.junit.Test;

import junit.framework.Assert;

public class ArrangingCoins {


	/*
	 * pseudo code
	 * 1. Create the 2 for loop
	 * 2. 
	 */


	@Test
	public void testData() {	
		Assert.assertEquals(2, soluction(5));
	}
	
	@Test
	public void testData1() {
		Assert.assertEquals(3, soluction(8));
	}


	public int soluction(int a) {

		int sum=0;
		int out =0;

		for (int i = 1; i < 5; i++) {
			for (int j = 1; j < i+1; j++) {
				sum=sum+1;
			}
			if(sum>a) {
				break;
			}
			out=i;
		}
		return out;


	}
	
	@Test
	public void test1() {
		System.out.println(arrangeCoins(5));
	}
	
	public int arrangeCoins(int n) {
		int completeRow=0;
		for (int coinCount = 0; coinCount <= n; coinCount++) {
			if(n>=coinCount) {
				n = n-coinCount;
			}else {
				break;
			}
			completeRow = coinCount;
		}
		return completeRow;
	}
}
