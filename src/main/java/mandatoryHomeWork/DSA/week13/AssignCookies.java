package mandatoryHomeWork.DSA.week13;

import java.util.Arrays;

import org.junit.Test;

public class AssignCookies {

	/*
	 * 
	 * Pseudo code
	 * 1. create two point, namely child and cokies
	 * 2. start the children array from zero and same for cokies
	 * 3. sort the both given input and use the if condition to check children need is equals to or greather than cookies;
	 * 4. if then increase the count variable;
	 */

	
	@Test
	public void testData(){
		int[] a= {1, 2, 3, 4, 5};
		int[] b= {1,2,5};
		System.out.println(findContentChildren(a,b));
	}
	public int findContentChildren(int[] ch, int[] coo) {
		int childer=0;
		int cookies=0;
		int count=0;
		Arrays.sort(ch);
		Arrays.sort(coo);
		while(childer<ch.length&&cookies<coo.length) {
			if(ch[childer]<=coo[cookies]) {
				count++;
				cookies++;
				childer++;
			}
			else {
				cookies++;
			}
		}
		return count;
	}
}
