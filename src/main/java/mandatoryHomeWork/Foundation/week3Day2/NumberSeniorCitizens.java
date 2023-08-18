package mandatoryHomeWork.Foundation.week3Day2;

import org.junit.Test;

import junit.framework.Assert;

public class NumberSeniorCitizens {
	
	/*
	 * pseudo code
	 * 1. use the sub string(11,13)
	 * 2.convert string to int
	 * 3. Integer.parseInt();
	 * 4. if(value >=60) count++;
	 * return count
	 * 
	 * 
	 * 
	 */
	@Test
	public void testData() {
		Assert.assertEquals(2, soluction(new String[] {"7868190130M7522","5303914400F9211","9273338290F4010"}));
	}
	
	
	@Test
	public void testData1() {
		Assert.assertEquals(0, soluction(new String[] {"1313579440F2036","2921522980M5644"}));
	}
	
	
	public int soluction(String[] a) {
		int count=0;
		for (int i = 0; i < a.length; i++) {
			String subSequence = (String) a[i].subSequence(11, 13);
		if(	Integer.parseInt(subSequence)>60) {
			count++;
		}	
		}
		return count;
	}

}
