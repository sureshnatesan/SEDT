package mandatoryHomeWork.DSA.week12;

import java.util.Arrays;

import org.junit.Test;

public class ProductOfELTS {
	/*
	 * given a array of nums {1,2,3} return output array with product of elts except elt at index
output = {6,3,2}
	 * 
	 * Pseudo code
	 * 1. create two variable, left and right
	 * 
	 */

	@Test
	public void test() {
		int [] a= {1,2,3};
		int [] a1= {0,1,2};
		
		System.out.println(Arrays.toString(soluction1(a1)));

	}
	public void soluction(int[] a) {

		int [] b =new int[a.length];
		for (int i = 0; i < a.length; i++) {
			int sum=1;
			for (int j = 0; j < a.length; j++) {
				if(j!=i) {
					sum=sum*a[j];
				}
			}
			b[i]=sum;
		}
		System.out.println(Arrays.toString(b));
	}

	//{0,1,2} o/p -> {2,0,0}
	public int[] soluction1(int[] a) {
		int sum=1;
		boolean status=false;
		int zero=0;
		int [] b =new int[a.length];
		for (int i = 0; i < a.length; i++) {
			if(a[i]!=0) {
				sum*=a[i];
			}
			if(a[i]==0) {
				status=true;
				zero++;
			}
		}

		for (int j = 0; j < a.length; j++) {
			if(zero==1) {
				if(a[j]==0) {
					b[j]=sum;
					return b;
				}			
			}
			if(zero>1) {
				return b;
			}
			else {
				b[j]=sum/b[j];
			}
		}
		return b;
	}

}
