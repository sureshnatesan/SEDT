package mandatoryHomeWork.DSA.week10;

import org.junit.Test;

public class DecodeProblem {

	/*
	 * https://leetcode.com/problems/decode-the-message/
	 * 
	 * Pseudo code
	 * 1.Create a int[] with size 26
	 * 2. use the for loop to iterate and add each character int value in int[]
	 * 3. retrive the charaacter from int[] array and append in the output and resturn the same
	 * 
	 * 
	 */


	@Test
	public void testData1() {
		System.out.println(decodeMessage("the quick brown fox jumps over the lazy dog","vkbs bs t suepuv"));
	}


	public String decodeMessage(String key, String message) {
		char[] sum= new char[26];
		String c="";
		for (int i = 0; i < key.length(); i++) {//O(n)
			c=c+key.charAt(i);
			key=key.replace(key.charAt(i)+"", " ");
		}
		c=c.replace(" ", "");
		StringBuilder sb= new StringBuilder();
		for (int i = 0; i < sum.length; i++) {//O(n)
				sum[i]=c.charAt(i);
		}
		
		for (int i = 0; i < message.length(); i++) {//O(n)^2
			if(message.charAt(i)==' ') {
				sb.append(" ");
			}
			else {
				char a=message.charAt(i);
				for (int j = 0; j < sum.length; j++) {
					if(a==sum[j]) {
						sb.append((char)(j+'a'));
					}
				}
			
			}
		}

		return sb.toString();
	}
}
