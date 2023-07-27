package Problem1;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class MajorityElement {


	/*
	 *1. Create a Map to store the int and int numbers
	 * 2. create a for loop to travers
	 * 3. get the int length and divide them by 2
	 * 4. identify the which int gives the more number of occurces
	 * 
	 */

	@Test
	public void testdata() {
		int[] a= {2,2,1,1,1,2,2};
		System.out.println(soluction(a));
		int[] b={3,2,3};
		System.out.println(soluction(b));
	}

	private int soluction(int[] a) {
		Map<Integer,Integer> map= new HashMap<>();
		int length=a.length/2;
		int max=0;
		for (int i = 0; i < a.length; i++) {

			if(map.containsKey(a[i])) {
				map.put(a[i], map.get(a[i])+1);
			}
			else {
				map.put(a[i], 1);
			}				
		}

		for (int i = 0; i < a.length; i++) {
			if(map.get(a[i])>=length) {
				if(map.get(a[i])>=max) {
					max=a[i];
				}

			}
		}

		return max;

	}

}
