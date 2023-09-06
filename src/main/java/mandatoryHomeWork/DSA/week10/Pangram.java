package mandatoryHomeWork.DSA.week10;

import org.junit.Test;

public class Pangram {

	/*
	 * https://leetcode.com/problems/check-if-the-sentence-is-pangram/
	 * 
	 * 1. create a for loop to iterate and 
	 * 2. check the give length is grether than or equal to 26
	 * 3. use the if condition to check index of a-to z if return -1; return false; 
	 * 
	 * 
	 * 2nd approcach
	 * 1. create a int array with the size of 26
	 * 2. create a for loop to iterate and use the charAtmethod to get each character
	 * 3. subtract the each character with a and if return less than equla to 26 in the arrray update its as 1
	 * 
	 */



	@Test
	public void testdata(){
		System.out.println(checkIfPangram("thequickbrownfoxjumpsoverthelazydog"));
		System.out.println(checkIfPangram1("theqownfoxjumpsoverthelazydog"));
		
	}

	public boolean checkIfPangram(String sentence) {
		boolean status=false;
		if(sentence.length()>=26){
			for(char a='a';a<='z';a++){
				if(	sentence.indexOf(a)==-1) {
					status= false;
					break;
				}
				else if(sentence.indexOf(a)!=-1) {
					status= true;
				}
			}
		} 
		return status;
	}

	public boolean checkIfPangram1(String sentence) {
		int[] sum= new int[26];
		for (int i = 0; i < sentence.length(); i++) {
			int a=sentence.charAt(i)-'a';
			if(a<=26) {
				sum[a]=1;
			}
		}
		for (int i = 0; i < sum.length; i++) {
			if(sum[i]==0) {
				return false;
			}
		}

		return true;
	}

}
