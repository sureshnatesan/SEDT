package mandatoryHomeWork.Foundation.homework_Week1;

import java.util.Arrays;

import org.junit.Test;


/*
 * 
 * https://leetcode.com/problems/add-digits/submissions/
 */
public class AddSum {
	@Test
	public void testData(){
		System.out.println(addDigits(38));
	}
	
	
	public int addDigits(int a) {
		int sum=0;

		while(a>0) {
			sum=sum+a%10;
			a=a/10;
		}
		if(sum>9) {
			return addDigits(sum);
		}
		return sum;
	}
}
