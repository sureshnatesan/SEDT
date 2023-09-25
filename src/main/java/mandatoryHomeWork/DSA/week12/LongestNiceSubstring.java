package mandatoryHomeWork.DSA.week12;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class LongestNiceSubstring {



	/*
	 * 
	 * https://leetcode.com/problems/longest-nice-substring/description/
	 * Pseudo code
	 *YazaAay
	 * 1.
	 */

	@Test
	public void testData(){
		System.out.println(longestNiceSubstring("AaBb").toString());
	}

	public String longestNiceSubstring(String s) {
		char[] arr = s.toCharArray();
		
		int left =0;
		int right =left+1;
		String count="";
		List<String> list = new ArrayList<>();

		while(left<s.length()-1&&right<s.length()){
			String sum="";
			boolean lower=false;
			boolean upper=false;
			while( right<s.length()&&Character.toLowerCase(arr[left])==Character.toLowerCase(arr[right])) {

				if(Character.isLowerCase(arr[left])||Character.isLowerCase(arr[right])) {
					lower=true;
				}
				if(Character.isUpperCase(arr[left])||Character.isUpperCase(arr[right])) {
					upper=true;
				}
				right++;
			}
			
			if(lower==true &upper==true) {
				sum=s.substring(left,right);
				list.add(sum);
			}
			if(count.length()<sum.length()){
				count+=sum;
			}
			left++;
			right =left+1;
		}

		return count;
	}
}
