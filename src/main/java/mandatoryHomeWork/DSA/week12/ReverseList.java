package mandatoryHomeWork.DSA.week12;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class ReverseList {
	
	/*
	 * 
	 * 
	 * 
	 * Pseudo code
	 * 1. 
	 */
	@Test
	public void testData(){
		List<Integer> list=new ArrayList<>();
		
		list.add(10);
		list.add(1233);
		list.add(23);
		list.add(1);
		System.out.println(soluction(list));
}
	
	
	public List soluction(List<Integer>list){
		int left=0;
		int right=list.size()-1;
		
		while(left<right) {
		int temp=list.get(left);
		list.set(left,list.get(right));
		list.set(right, temp);
		left++;
		right--;
		}
		
		return list;
	}
	
}
