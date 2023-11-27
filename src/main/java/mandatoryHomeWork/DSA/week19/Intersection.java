package mandatoryHomeWork.DSA.week19;

import org.junit.Test;

public class Intersection {

	@Test
	public void testData(){
		int [] a= {1,3,4,5,6} , b= {1,2,3,4,5};
		soluction(a,b);
	}

	private void soluction(int[] a,int[] b) {
		int left=0,right=0;
		boolean status= false;
		while(left<a.length&&right<b.length) {
			if(a[left]<b[right]) {
				left++;
			}
			else if( a[left]>b[right]) {
				right++;
			}
			else if(a[left]==b[right]) {
				status= true;
				System.out.println(a[left]);
				left++;
				right++;
			}
		}
		if(status==false) {
			System.out.println("Did not not any matching value");
		}
	}


}
