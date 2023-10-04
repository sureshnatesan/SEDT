package mandatoryHomeWork.DSA.week14;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

public class Test1 {

	@Test
	public void testData(){
		List<Integer> a = new ArrayList<>();
		a.add(1);
		a.add(2);
		a.add(3);
		List<Integer> b = new ArrayList<>();
		b.add(2);
		b.add(5);
		b.add(5);
		
		
		System.out.println(mergeArrays(a,b));
	}

	public static List<Integer> mergeArrays(List<Integer> a, List<Integer> b) {
		List<Integer> list = new ArrayList<>();
		int left=0;
		int right =0;
		System.out.println(a.size());
		while(left<a.size()||right<b.size()){
			if(left==a.size()&&right<a.size()) {
				list.add(b.get(right++));
			}
			else if(right==b.size()&&left<a.size()) {
				list.add(a.get(left++));
			}
			else if(left<a.size()&&a.get(left)<b.get(right)){
				list.add(a.get(left++));	
			}
			else if(right<b.size()&&b.get(right)<a.get(left)){
				list.add(b.get(right++));   	
			}
			else if(right<b.size()&&left<a.size()&&b.get(right)==a.get(left)){
				list.add(b.get(right++)); 
				list.add(a.get(left++)); 
			}
		}
		return list;
		/*
		int [] sum= new int[a.size()*2];
		for (int i = 0; i < a.size(); i++) {
			
			sum[i]=a.get(i);
			sum[i+a.size()]= b.get(i);
		}
		
		
		Arrays.sort(sum);
		List<Integer> list1 = new ArrayList<Integer>();
		for (int i = 0; i < sum.length; i++) {
			list1.add(sum[i]);
		}
		
		return list1;*/
	}
	
    public static List<Integer> performOperations
    (List<Integer> arr, List<List<Integer>> operations) {

    	List<Integer> list = operations.get(0);
return list;
    }
}
