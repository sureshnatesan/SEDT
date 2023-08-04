package Week5;

import org.junit.Test;

import junit.framework.Assert;

public class CalculateMoneyBank {



	/*https://leetcode.com/problems/calculate-money-in-leetcode-bank/description/
    Pseudo code
    1.Create one for loop to iterate up to the given number
    2.use the / && % operator to get the value and sum them

	 */
	
	@Test
	public void testData() {
		Assert.assertEquals(10, totalMoney(4));
	}
	
	@Test
	public void testData1() {
		Assert.assertEquals(37, totalMoney(10));
	}
	
	@Test
	public void testData2() {
		Assert.assertEquals(96, totalMoney(20));
	}
	
	public int totalMoney(int n) {
		int sum=0;
		int count=1;
		for(int i=1;i<=n;i++){
			if(i<8){
				sum=sum+i;
			}
			else if(i/7>0&&i%7!=0){
				sum=sum+((i/7)+(i%7));
			}
			else if(i%7==0){
				if(i/7>1){
					sum=sum+(i-(6*count++));
				}

			}
		}
		return sum;
	}

}
