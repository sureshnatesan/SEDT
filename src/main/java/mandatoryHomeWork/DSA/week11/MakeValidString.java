package mandatoryHomeWork.DSA.week11;

import org.junit.Test;

public class MakeValidString {

	/*
	 * https://leetcode.com/problems/minimum-additions-to-make-valid-string/
	 * Postive
	 * 1.abc
	 * 2.a
	 * 3.c
	 * 4.abcc
	 * 5.abbb
	 * 6.bbbb
	 * 
	 * Pseudo code
	 * 1.create a for loop to iterate and use the char at method to get each character
	 * 2.use the if condition to check the charAt 0 position
	 *  
	 */

	@Test
	public void testData(){
		//bba
		System.out.println(addMinimum("aab"));
	}
	public int addMinimum(String word) {
		int count=0;
		if(word.charAt(0)=='b') {
			count+=1;
		}
		if(word.charAt(0)=='c') {
			count+=2;
		}
		if(word.charAt(word.length()-1)=='b') {
			count+=1;
		}
		if(word.charAt(word.length()-1)=='a') {
			count+=2;
		}
		for(int i=0;i<word.length()-1;i++) {
			char a1=word.charAt(i);
			char a2=word.charAt(i+1);
			
			if((a1=='a'&& a2=='a')||(a1=='b'&& a2=='b')||(a1=='c'&&a2=='c')) {
				count+=2;
			}
			
			if((a1=='a' && a2=='c')||(a1=='c' && a2=='b')||(a1=='b' && a2=='a')) {
				count+=1;
			}
		}
		return count;
		/*
		if(word.length()==1) return 2;
		StringBuilder sb= new StringBuilder();
		if(word.length()>1) {
			for(int i=0;i<word.length();i++) {
				if(i==0) {
					if(word.charAt(0)=='a') {
						sb.append('a');
					}
					if(word.charAt(0)=='b') {
						sb.append('a');
						sb.append('b');
					}
					if(word.charAt(0)=='c') {
						sb.append('a');
						sb.append('b');
						sb.append('c');
					}
				}
				
				if(word.charAt(i)=='a') {
					sb.append('a');
				}
				else if(word.charAt(i)=='b') {
				if(sb.charAt(sb.length()-1)=='a') {
					sb.append('b');
				}
				else {
					sb.append('a');
					sb.append('b');
				}
				
				}
				else if(word.charAt(i)=='c'){
					if(sb.charAt(sb.length()-1)=='b') {
						sb.append('c');
					}
					else {
						sb.append('b');
						sb.append('c');
					}
				}
			}
			
		}
		return sb.length()-word.length();*/
	}
}
