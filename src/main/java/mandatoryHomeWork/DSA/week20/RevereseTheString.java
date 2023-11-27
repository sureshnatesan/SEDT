package mandatoryHomeWork.DSA.week20;

import java.util.Iterator;

import org.junit.Test;

public class RevereseTheString {

	/*
	 * 
	 * tring str = "I am happy  engineer";
Reverse the words and not the entire string 

"I ma yppah  reenigne" 
	 */


	/*
	 * Pseudo code
	 * 
	 * 1. create a variable called left, right and resetter;
	 * 2. use the while to iterate and check for spaces
	 * 3. if we could not find the spaces ,right the right alone
	 * 4. if you find the space or right==s.length, then reverse the left with right
	 * 5. and use the condition left<right for reverse the string
	 * 6. once reverese is completed, set left and right as the resetter value
	 * 5.
	 * 
	 */


	/*
	 * 
	 * 
	 * 
	 * raverse through each character in the sentence
For each character, check:
  Is this character a space or are we at the end of the sentence?
  If yes, then:
    We have found a word / we're at the last word.
    Reverse this word by swapping logic (push this as separate method)
    After reversing, skip over any extra spaces until we find a letter again.
    Reset the position as beginning of the next word.
When finished, convert the character array to string to return.

	 */
	@Test
	public void testData() {
		String s= "I am happy  engineer";
		soluction1(s);
	}
//12//19
	private char[] reverseString(char[] f, int l,int r) {
		int left =l, right=r;
		while(left<right) {
			char q=f[left];
			f[left++]=f[right];
			f[right--]=q;
		}
		return f;
	}



	private void soluction1(String s) {
		char[] charArray = s.toCharArray();
		int left=0,right=0,resetter=0;

		while(left<s.length()&& right<s.length()) {
			 if(right==s.length()-1) {
					reverseString(charArray,left,right);
				}
			if(Character.isLetterOrDigit(charArray[right])) {
				right++;
			}
		
			else {
				resetter=right;
				reverseString(charArray,left,right-1);
				right=resetter+1;
				left=right;
			}
			

		}
		System.out.println(new String(charArray));
	}
	private void soluction(String s) {

		char[] charArray = s.toCharArray();
		int left=0,right=0,resetter=0;

		while(left<s.length()&& right<s.length()) {
			if(Character.isLetterOrDigit(charArray[right])) {
				right++;
			}
			else {
				if(!Character.isLetterOrDigit(charArray[right]) &&Character.isLetterOrDigit(charArray[left])&& right<s.length()) {

				}
				System.out.println("hellow1");
				if(charArray[right]==' ' &&charArray[left]!=' '&& right<s.length()) {
					resetter=right;
					while(left<right) {
						char a= charArray[left];
						charArray[left++]=charArray[right];
						charArray[right--]=a;
					}

				}
				left=resetter;
				right=resetter;
				System.out.println("hellow2");
				if(charArray[left]==' '&& charArray[right]==' ') {
					left++;
					right++;
					System.out.println("hellow3");
				}
			}
			System.out.println("hellow3");
			System.out.println(new String(charArray));

		}


	}
}
