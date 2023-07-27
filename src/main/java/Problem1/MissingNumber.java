package Problem1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.junit.Assert;
import org.junit.Test;

public class MissingNumber {
	
	@Test
	public void testdata1(){
		int[] a = {9,6,4,2,3,5,7,0,1};
		int missnum = Soluction(a);
		System.out.println(Soluction(a));
		Assert.assertEquals(8, missnum);
		int[] c = {9,6,4,2,3,5,7,0,1};
		System.out.println(Soluction(c));

	}
	
	public  int Soluction1(int[] a) {
		Arrays.sort(a);
		Set<Integer> sum = new TreeSet<>();
		for (int i = 0; i < a.length; i++) {
			sum.add(a[i]);

		}
		List<Integer> list = new ArrayList<>(sum);
		int output=0;
		for (int i = 0; i <a.length; i++) {
			if( list.contains(i)) {
				
			}
			else {
				output=i;
			}
		}

		return output;
	}
	
	public int Soluction(int[] a) {
		Arrays.sort(a);
		int output=0;
		for (int i = 0; i <= a.length; i++) {
			if(a[i]==i) {
				
			}
			else {
				output=i;
			}
		}
		
		return output;

	}

}
