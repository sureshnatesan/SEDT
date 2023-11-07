package mandatoryHomeWork.DSA.week18;

import org.junit.Test;

public class LongestCommonPrefix {

	/*
	 * https://leetcode.com/problems/longest-common-prefix/description/
	 * 
	 */

	/*
	 * 
	 * Pseudo code
	 *    1.create a for loop to iterate to all the string value
    2. take a single character and find it is available in each string or not
    3. if it is available, append one more character and check it is available or not
	 *
	 */
	
	@Test
	public void testData(){
		String[] a= {"flower","flow","flight"};
		String longestCommonPrefix = longestCommonPrefix(a);
		System.out.println(longestCommonPrefix);
	}

	public String longestCommonPrefix(String[] strs) {
		int left=0;
		int right=0;
		String check="";
		String sum="";
		for (int i = 0; i < strs[1].length(); i++) {
			String f=strs[1].charAt(i)+"";
			String helpFunction = helpFunction(f,strs);
			if (helpFunction.equals("")){
				check="";
			}
			if(sum.length()<helpFunction.length()) {
				sum=sum+helpFunction;
			}
		}
		return sum;  
	}

	public String helpFunction(String f, String[] strs){
		for (int i = 0; i < strs.length; i++) {
			if(!strs[i].contains(f)) {
				return "";
			}
		}

		return f;
	}
}
