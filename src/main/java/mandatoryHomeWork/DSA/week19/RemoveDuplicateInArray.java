package mandatoryHomeWork.DSA.week19;

import org.junit.Test;

public class RemoveDuplicateInArray {

	@Test
	public void testData(){
		int[] a= {1,1,1,2,3,4};
		//Bruteforce(a);
		twoPointer(a);
	}

	private void twoPointer(int[] a) {
		int left=0,right=1,count=0;

		while(right<a.length) {
			if(a[left]==a[right]) {
				a[right]=Integer.MIN_VALUE;
				right++;
			}
			else if(a[left]!=a[right]) {
				left=right;
				right++;		
			}
			else if(left==right)right++;	
		}

		for (int i = 0; i < a.length; i++) {
			if(a[i]!=Integer.MIN_VALUE) {
				a[count++]=a[i];
			}
		}
		System.out.println("count : "+count);
	}

	private void Bruteforce(int[] a) {

		int count=0 ,val=0;

		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				if(a[i]==a[j]) {
					a[j]=Integer.MIN_VALUE;
				}
			}
		}

		for (int i = 0; i < a.length; i++) {
			if(a[i]!=Integer.MIN_VALUE) {
				a[count++]=a[i];
			}
		}
		val=count;
		while(val<a.length) {
			a[val++]=Integer.MIN_VALUE;
		}

		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		System.out.println("count "+count);
	}

/*
 * while(count<a.length) {
			a[count++]=Integer.MIN_VALUE;
		}
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
 */

}
