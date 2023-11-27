package mandatoryHomeWork.DSA.week20;

import org.junit.Test;

public class Palindrome {
	
	/*
	 * 
	 * Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.
	String input = "A man, a plan, a canal, Panama!";
	// Output: true
	 * 
	 * Pseudo code
	 * 
	 * 1. create two variable name left and right
	 * 2. left start at 0 and right at input length -1;
	 * 3. iterate each character and each character range in between 65 to 122
	 * 4. if the character value is greather 122 & less than 65, increament the count;
	 */
	
	

	@Test
	public void testData() {
		String s="A man, a plan, a canal, Panama!";
		System.out.println(soluction(s));
	}

	private boolean soluction(String s) {
		int left=0,right=s.length()-1;
		while(left<right) {
			if(!Character.isLetterOrDigit(s.charAt(left))) {
				left++;
			}
			if(!Character.isLetterOrDigit(s.charAt(right))) {
				right--;
			}
			if(Character.isLetterOrDigit(s.charAt(left))&& Character.isLetterOrDigit(s.charAt(right))){
				if(Character.toLowerCase(s.charAt(left))==Character.toLowerCase(s.charAt(right))){
					left++;
					right--;
				}
				else {
					return false;
				}
			}	
		}
		return true;
	}
}

/*
 * 
 * 
 




 * 
 * 

*/




