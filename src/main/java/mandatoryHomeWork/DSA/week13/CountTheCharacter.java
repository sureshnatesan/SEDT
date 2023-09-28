package mandatoryHomeWork.DSA.week13;

import org.junit.Test;

public class CountTheCharacter {
	/*
	 * 
	 *.S = ‘aaabbccaad’
O/p = ‘a3b2c2a2d’

Pseudo code
1. create two point left and right and both starting at 0
2. if left position of character is equals to right position character, increment right by one
3. else make left equals to right and add the character and there count in output
 
	 */

	@Test
	public void testData(){
		System.out.println(soluction("aaabbccaadd"));
	}
	
	public String soluction(String s){
		int left=0;
		int right =0;
		int count=0;
		String sum="";
		while(left<s.length()&&right<s.length()) {
			//‘aaabbccaadd’
			if(s.charAt(left)==s.charAt(right)) {
				 count++;
				 right++;
			}
			else if(s.charAt(left)!=s.charAt(right)){
				sum+=s.charAt(left)+""+count;
				left=right;
				count=0;
			}
			if(right==s.length()-1) {
				count++;
				sum+=s.charAt(right)+""+count;
			}
		}
		return sum;
	}
}
