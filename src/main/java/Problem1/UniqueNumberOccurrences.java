package Problem1;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.junit.Assert;
import org.junit.Test;

public class UniqueNumberOccurrences {

	@Test
	public void testData(){
		int[] a= {1,2,2,1,1,3};
		Assert.assertEquals(true, soluction1(a));
	}
	
	@Test
	public void testData1(){
		int[] a= {1,2};
		Assert.assertEquals(false, soluction1(a));
	}

	public boolean soluction(int[] a) {
		boolean status=false;
		Map<Integer,Integer> map= new HashMap<>();
		Set<Integer> set= new HashSet<>();
		for (int i = 0; i < a.length; i++) {
			if(map.containsKey(a[i])) {
				map.put(a[i], map.get(a[i])+1);
			}
			else {
				map.put(a[i], 1);
			}
		}
		Set<Integer> keySet = map.keySet();
		for(Integer d:keySet ) {
			if(set.add(map.get(d))) {
				status=true;
			}
			else {
				status=false;
				break;
			}
		}

		return status;

	}
	
	public boolean soluction1(int[] a) {
		boolean status=true;
		Map<Integer,Integer> map= new HashMap<>();
		Set<Integer> set= new HashSet<>();

		for (int i = 0; i < a.length; i++) {
			if(map.containsKey(a[i])) {
				map.put(a[i], map.get(a[i])+1);
			}
			else {
				map.put(a[i], 1);
			}

		}
		//1,2
		Set<Integer> keySet = map.keySet();
		for(Integer d:keySet ) {
			int count=1;
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				if(a[i]==a[j]) {
					count++;
				}
			}
			if(count==map.get(d)) {
				status=false;
				break;
			}
		}
		
		}
		

		return status;

	}
	
}
