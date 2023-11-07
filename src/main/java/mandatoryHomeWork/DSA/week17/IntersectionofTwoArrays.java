package mandatoryHomeWork.DSA.week17;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.junit.Test;

public class IntersectionofTwoArrays {
	/*
	 * https://leetcode.com/problems/intersection-of-two-arrays/submissions/
	 */
	@Test
	public void testData(){
		int a[]= {1,2,2,1};
		int b[]= {2,2};
		System.out.println(intersection(a,b));
	}
	public int[] intersection(int[] nums1, int[] nums2) {
		Set<Integer> set1= new LinkedHashSet<>();
		Set<Integer> set2= new LinkedHashSet<>();
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < nums1.length; i++) {
			set1.add(nums1[i]);
		}

		for (int i = 0; i < nums2.length; i++) {
			if(set1.contains(nums2[i])) {
				set2.add(nums2[i]);
			}
		}
		int[] s= new int[set2.size()];
		int i=0;
		for (Integer element : set2) {
			// Perform some action with 'element'
			s[i++]=element;
			System.out.println(element);
		}
		/*
		int[] intArray = set2.stream()
				.mapToInt(Integer::intValue)
				.toArray();*/
		return s;  
	}
}
