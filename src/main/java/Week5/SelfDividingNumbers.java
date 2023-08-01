package Week5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class SelfDividingNumbers {
	
	/*https://leetcode.com/problems/self-dividing-numbers/
	 * Pseudo code
	 * 1.create a for loop to iterate the left and right input
	 * 2. passing the iterator to another method and convert them to string
	 * 3. In a string check,if its contains ->0 then return false
	 * 4. use % operator check the reminder, if reminder is not 0 return false
	 */

	@Test
	public void testData() {
		Assert.assertEquals(Arrays.asList(1,2,3,4,5,6,7,8,9,11,12,15,22), selfDividingNumbers1(1,22));
	}
	
	@Test
	public void testData1() {
		Assert.assertEquals(Arrays.asList(48,55,66,77), selfDividingNumbers1(47,85));
	}
	
	public boolean solction(int kl) {
		boolean status=true;
		String s=String.valueOf(kl);
		if(s.contains('0'+"")==true) {
			return false;
		}
		for (int i = 0; i < s.length(); i++) {
			if((kl%(s.charAt(i)-'0'))!=0) {
				return false;
			}
		}
		return status;

	}

	public List<Integer> selfDividingNumbers1(int left, int right) {
		List<Integer> list= new ArrayList<Integer>();
		for(int i=left;i<=right;i++){
			if(solction(i)==true) {
				list.add(i);
			}
		}
		return list;
	}


}
