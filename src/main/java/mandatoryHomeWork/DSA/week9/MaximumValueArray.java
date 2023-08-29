package mandatoryHomeWork.DSA.week9;

import org.junit.Test;

import junit.framework.Assert;

public class MaximumValueArray {
	/*
	 * https://leetcode.com/problems/maximum-value-of-a-string-in-an-array/description/
    Test Cases
    1.Postive
    i. alpha3
    ii. 09
    iii. world
    iv.0000
    Negative 
    i.@$%%
    edge case
    {}
Pseudo code
1. create a for loop to iterate 
2. use the Integer.parse int method to get the numerical value and if its throw the error use the length method to get the value;

	 */


	public int maximumValue(String[] strs) {
		int max=0;
		for (int i = 0; i < strs.length; i++) {
			int count=0;

			try {
				count= Integer.parseInt(strs[i]);
			} catch (Exception e) {
				count= strs[i].length();
			}
			if(count>max) {
				max=count;
			}
		}
		return max; 
	}

	public int maximumValue1(String[] strs) {
		int max=0;
		boolean status=false;
		for (int i = 0; i < strs.length; i++) {
			String s=strs[i];
			for (int j = 0; j < s.length(); i++) {
				char a=s.charAt(j);
				if(a>=97&&a<=122) {
					
				}
			}
			int count=0;
			try {
				count= Integer.parseInt(strs[i]);
			} catch (Exception e) {
				count= strs[i].length();
			}
			if(count>max) {
				max=count;
			}
		}
		return max; 
	}

	@Test
	public void tesss() {
		Assert.assertEquals(5, maximumValue(new String[]{"alic3","bob","3","4","00000"}));
	}
}
