package mandatoryHomeWork.Foundation.week7;

import org.junit.Test;

import junit.framework.Assert;

public class SpyNumber {



	/*
	 * Test Cases
	 * Postive
	 * 1.153
	 * 2.453
	 * Negative
	 * 1-987
	 * 2.-56
	 * Edge 
	 * 1.5
	 * 2 0
	 * 3.100
	 * 
	 * Pseudo code
	 * 1.create a three variable, one to store the input,sum and product respectively
	 * 2.create a while loop and use the % & / operator to iterate
	 * 3. check project of digit with some of digit
	 */

	@Test
	public void postiveTest(){
		Assert.assertEquals(true,solution(132));
		Assert.assertEquals(true,solution(1124));
	}

	@Test
	public void negativeTest(){
		Assert.assertEquals(true,solution(-132));
		Assert.assertEquals(false,solution(137));
	}

	@Test
	public void edgeTest(){
		System.out.println(0%10);
		//Assert.assertEquals(true,solution(9));
		Assert.assertEquals(true,solution(0));
	}

	public boolean solution(int a) {
		int sum=0;
		int prod=1;
		if(a>=0&&a<10) {
			return true;
		}
		else if(a>9) {
			while(a>0) {
				int rem =a%10;
				sum=sum+rem;
				prod=prod*rem;
				a=a/10;
			}
			if(prod==sum) {
				return true;
			}

		}
		else if(a<0){
			a=a*-1;
			while(a>0) {
				int rem =a%10;
				sum=sum+rem;
				prod=prod*rem;
				a=a/10;
			}
			if(prod==sum) {
				return true;
			}
		}
		return false;
	}

}
