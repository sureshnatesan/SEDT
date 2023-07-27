package Week3Day1;

import org.junit.Test;

import junit.framework.Assert;

public class ShuffleString {



	/*
	 * Pseudo code
	 * 1. create one String array
	 * 2. create one String as output
	 * 3.use for loop & add the in the created array based on the indices
	 */

	@Test
	public void testData() {
		Assert.assertEquals("leetcode", soluction("codeleet", new int[] {4,5,6,7,0,2,1,3}));
	}

	@Test
	public void testData1() {

		Assert.assertEquals("abc",soluction("abc", new int[] {0,1,2}));
	}

	public String soluction(String s, int[] indices) {
		Character[] sum= new Character[s.length()];
		String output="";
		for (int i = 0; i < indices.length; i++) {
			sum[indices[i]]= s.charAt(i);
		}

		for (int i = 0; i < sum.length; i++) {
			output=output+sum[i];
		}

		return output;
	}



}
