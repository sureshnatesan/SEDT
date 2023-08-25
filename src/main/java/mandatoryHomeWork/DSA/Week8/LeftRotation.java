package mandatoryHomeWork.DSA.Week8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.junit.Test;

public class LeftRotation {

	/*
	 * pseudo code
	 * 1.create a new array with the size of input, list size
	 * 2. create a for loop to iterate and index start from d input
	 * 3. create a count variable to set the index value for new array
	 * 4. And add all the value in the new array in the mentioned order.
	 */
	
	//@Test
	public void testData() {
		int[] arr= {1, 2, 3, 4, 5};
	List<Integer> array_list = 
	            new ArrayList<Integer>();
		for (int i = 0; i < arr.length; i++) {
			array_list.add(arr[i]);
		}
		List<Integer> array_list1 = 
	            new ArrayList<Integer>(rotLeft(array_list,4));
		for (int i = 0; i < array_list1.size(); i++) {
			System.out.println(array_list1.get(i));
		}
	}
	
	@Test
	public void testData1() {
		int[] arr= {1, 2, 3, 4, 5};
	List<Integer> array_list = 
	            new ArrayList<Integer>();
		for (int i = 0; i < arr.length; i++) {
			array_list.add(arr[i]);
		}
	int[] d=	rotLeft12(array_list,2);
		for (int i = 0; i < d.length; i++) {
			//System.out.println(d[i]);
		}

	}
	
	public static List<Integer> rotLeft(List<Integer> a, int d) {
		int count=0;
		List<Integer> sum = new ArrayList<Integer>();
		for(int i=d;i<a.size();i++){
			sum.add(a.get(i));
			count++;
		}
		int w= a.size()-count-1;
		for(int i=0;i<=w;i++){
			sum.add(a.get(i));
		}
		return sum;
	}
	
	public static int[] rotLeft1(List<Integer> a, int d) {
		int count=0;
		int[] sum1= new int[a.size()];
		
		List<Integer> sum = new ArrayList<Integer>();
		for(int i=d;i<a.size();i++){
			sum1[count++]=a.get(i);
		}
		int w= a.size()-count-1;
		for(int i=0;i<=w;i++){
			sum1[count++]=a.get(i);
			//sum.add(a.get(i));
		}
		return sum1;
	}
	public static int[] rotLeft12(List<Integer> a, int d) {
		int count=0;
		int[] sum1= new int[a.size()];
		
		List<Integer> sum = new ArrayList<Integer>();
		for(int i=d;i<a.size();i++){
			int temp=a.get(count);
			a.set(count, a.get(i));
			a.set(i, temp);
			count++;
		}
		for (int i = 0; i < a.size(); i++) {
			System.out.println("a "+a.get(i));
		}
		return sum1;
	}
	
	@Test
	public void testName() {
		int[] a = {1, 2, 3, 4, 5};
		int b[] =returnInSameArray(a, 3);
		for (int i = 0; i < b.length; i++) {
			
		}
	}
	public static int[] returnInSameArray(int[] a, int d) {
		int count=0;
		List<Integer> sum = new ArrayList<Integer>();
		for(int i=d;i<a.length;i++){
			int temp=a[count];
			a[count]=a[i];
			a[i]=temp;
			count++;
		}
		return a;
	}
}
