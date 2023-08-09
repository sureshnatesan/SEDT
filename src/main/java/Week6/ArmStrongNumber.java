package Week6;

import org.junit.Test;

import junit.framework.Assert;

public class ArmStrongNumber {

	/*
	 * Pseudo code
	 * 1. create a while loop to get the count of the input variable
	 * 2. create one more variable and assign the input value to it 
	 * 3. create one more while to get reminder and create one method to give power of the reminder
	 * 4. sum all the power of the reminder use to check for Armstrong number
	 */
	@Test
	public void testData(){
		Assert.assertEquals(153, soluction(153));;
	}
	public int soluction(int a) {
		int count=0;
		int sum=0;
		int b=a;
		while(a>0) {
			int rem=a%10;
			a=a/10;
			count++;
		}
		while(b>0) {
			int rem1 =b%10;
			sum=sum+getPowervalue(rem1,count);
			b=b/10;
		}
		return sum;
	}

	public int getPowervalue(int rem, int count) {
		int sum=rem;
		for (int i = 1; i < count; i++) {
			sum=sum*rem;
		}
		return sum;
	}

}
