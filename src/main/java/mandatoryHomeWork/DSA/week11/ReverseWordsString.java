package mandatoryHomeWork.DSA.week11;

import org.junit.Test;
import org.testng.Assert;

public class ReverseWordsString {
	
	
	
	/*
	 * 
	 * 
	 * https://leetcode.com/problems/reverse-words-in-a-string-iii/
	 */

	@Test
	public void testData(){
		String s="Let's take LeetCode contest";
		Assert.assertEquals("s'teL ekat edoCteeL tsetnoc", reverseWords(s));
	}
	
	 public String reverseWords(String s) {
		 String[] split = s.split(" ");
		 String out="";
		 StringBuilder sb= new StringBuilder();
		 for (int i = 0; i < split.length; i++) {
			 String sum="";
			 for(int j=split[i].length()-1;j>=0;j--) {
				 sum=sum+split[i].charAt(j);
			 }
			 out=out+sum+" ";
		 }
		 
		 return out.trim();
	 }
}
