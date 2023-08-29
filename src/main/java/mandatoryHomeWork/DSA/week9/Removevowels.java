package mandatoryHomeWork.DSA.week9;

import org.junit.Test;

public class Removevowels {
	
	
	/*
	 * 
	 * Write a program to remove vowels from a String
Example:
Input: "Hi testleaf students"
Output: "H tstlf students"

Pseudo code
1.create a for loop to iterate
2. if input[i]=='a'||'e'||'i'||'o'||'u|| =""
	 */
	
	@Test
	public void testData() {
		String Input="Hi testleaf students";
		System.out.println(soluction(Input));
	}
	
	public StringBuilder soluction(String a) {
		char[] s=a.toCharArray();
		StringBuilder sb=new StringBuilder();
		for (int i = 0; i < a.length(); i++) {
			if(s[i]=='a'||s[i]=='e'||s[i]=='i'||s[i]=='0'||s[i]=='u'||s[i]=='A'||s[i]=='E'||s[i]=='I'||s[i]=='0'||s[i]=='U') {
			
			}else {
				sb.append(s[i]);
			}
		}
		System.out.println(sb);
		return sb;
	}

}
