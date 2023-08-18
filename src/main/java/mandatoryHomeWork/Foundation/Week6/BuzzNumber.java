package mandatoryHomeWork.Foundation.Week6;

import org.junit.Test;

import junit.framework.Assert;

public class BuzzNumber {

	/*Pseudo code
	ip :- int, op :- boolean

Check Buzz Number in Java:

A number which either ends with 7 or divisible by 7 is called Buzz number. For example, 35 is a Buzz number as it is divisible by 7, similarly 47 is also a Buzz number as it ends with 7. In this tutorial, we will write java programs to check Buzz number and print Buzz numbers in a given range.


	Testdata
	p->37,35
	N->33,78,79
	E->77, 7,66

	1.Use the % operator get the reminder of the input
	2.if reminder is 7 or 0 return true.
	 */
	@Test
	public void Postive() {
		Assert.assertEquals(true, soluction(35));
		Assert.assertEquals(true, soluction(707));
		Assert.assertEquals(true, soluction(157));
	}

	@Test
	public void negative() {
		Assert.assertEquals(false, soluction(34));
		Assert.assertEquals(false, soluction(699));
		Assert.assertEquals(false, soluction(90));
	}

	@Test
	public void edge() {
		Assert.assertEquals(false, soluction(0));
		Assert.assertEquals(false, soluction(-10));
		Assert.assertEquals(true, soluction(-7));
		Assert.assertEquals(true, soluction(-47));
	}

	public boolean soluction(int a){
		
		if(a==0) {
			return false;
		}
		
		if(a%7==0||a%10==7||a%10==-7){
			return true;
		}
		else

			return false;
	}



}
