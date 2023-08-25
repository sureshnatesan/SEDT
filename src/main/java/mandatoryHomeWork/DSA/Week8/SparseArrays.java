package mandatoryHomeWork.DSA.Week8;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class SparseArrays {

	/*
	 * 
	 * https://www.hackerrank.com/challenges/sparse-arrays/problem?isFullScreen=true
	 * Pseudo code
	 * 1. create a two for loop and queries as outer for loop and input as the inner
2. create a int variable to store the count
	 */
	@Test
	public void testData(){
		List<String> list=new ArrayList<>();
		list.add("ab");
		list.add("ab");
		list.add("abc");
		
		List<String> list1=new ArrayList<>();
		list1.add("ab");
		list1.add("abc");
		list1.add("bc");
	
		System.out.println(matchingStrings(list,list1));
	}
	public static List<Integer> matchingStrings(List<String> stringList, List<String> queries) {
		List<Integer> list=new ArrayList<>();

		for (int i = 0; i < queries.size(); i++) {
			int count=0;
			for (int j = 0; j < stringList.size(); j++) {
				if(queries.get(i).equals(stringList.get(j))) {
					count++;
				}
				
			}
			list.add(count);
		}
		return list;
	}
}
