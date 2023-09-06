package mandatoryHomeWork.DSA.week10;

import org.junit.Test;

public class AapperisbeforB {
	
	/*
	 * https://leetcode.com/problems/check-if-all-as-appears-before-all-bs/
	 * Pseudo code
	 * 1. get the index of b and last index of a
	 * 2.chek using if condition, ifa<b, then return true;
	 * 
	 * 
	 */
	@Test
	public void testData() {
		System.out.println(soluction("aaa"));
	}

	public boolean soluction(String s) {
		
		if(s.length()<=1) {
			return true;
		}
		int b=s.indexOf('b');
		System.out.println(b);
		int a=s.lastIndexOf('a');
		if(s.length()<=1||b==-1||a==-1) {
			return true;
		}
		if(a<b) {
			return true;
		}
		return false;
	}
}
