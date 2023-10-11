package mandatoryHomeWork.DSA.week14;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class IsomorphicStrings {

	/*
	 * https://leetcode.com/problems/isomorphic-strings/
	 * Pseudo code
	 * 1. create a two int array with size of 256
	 * 2. create a for loop and iterate the each character and add i+1 value in there respective places.
	 * 3. And compare the two value if not equals return false
	 * 
	 * 
	 */

	@Test
	public void testData(){
System.out.println(isIsomorphic("abbaa","cddcd"));
	}
	public boolean isIsomorphic(String s, String t) {
		int[] a= new int[256];
		int [] b = new int[256];

		for (int i = 0; i < s.length(); i++) {
			
			if(a[s.charAt(i)]!=	b[t.charAt(i)]) {
				return false;
			}
			a[s.charAt(i)]=i+1;
			b[t.charAt(i)]=i+1;
			System.out.println(a[s.charAt(i)]+" "+b[t.charAt(i)]);
		}
		return true;
	}

}
