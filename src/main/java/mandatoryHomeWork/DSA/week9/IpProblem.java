package mandatoryHomeWork.DSA.week9;

import org.junit.Test;

public class IpProblem {

	/*
	 * 
	 * Input: address = "1.1.1.1"
Output: "1[.]1[.]1[.]1"

		Pseudo code
		1.use the split operation and add the [.] into the string
	 */
	
	
	//@Test
	public void soluction() {
		String a="1.1.1.1";
		String sum="";
		String[] split = a.split("\\.");
	
		for (int i = 0; i < split.length-1; i++) {
			sum=sum+1+"[.]";
		}
		sum=sum+a.charAt(a.length()-1);
		System.out.println(sum);
	}
	@Test
	public void soluction1() {
		String a="1.1.1.1";
		String sum="";
		char[] charArray = a.toCharArray();
		for (int i = 0; i < charArray.length; i++) {
			if(charArray[i]!='.') {
				sum=sum+charArray[i];
			}
			else if(charArray[i]=='.') {
				sum=sum+"[.]";
			}
		}
		System.out.println(sum);
	}
}
