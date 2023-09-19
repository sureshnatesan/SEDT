package mandatoryHomeWork.DSA.week12;

import org.junit.Test;

public class MaximumSum {

	/*
	 *1,5,2,3,7,1
	 * 
	 * Pseudo code
	 * 1.create a while loop and create three variable ,min, start & end
	 * 2.use the two pointer approaches and first point should start from zero and send point should be k-1;
	 * 3. compare the sum with  maximum
	 * 
	 */

	@Test
	public void soluction() {
		int[] a= {1,5,2,3,7,1};
		int k=3;
		System.out.println(soluction(a,k));
	}

	public int soluction(int[] a,int k){
		int sum=Integer.MIN_VALUE;
		int count=0;
		int start=0;
		int end =k-1;

		while(start<=end&&start<a.length-k-1) {
			if(start<=end) {
				count+=a[start++];

			}
System.out.println(" count" +count);
System.out.println("start" +start);
System.out.println("end "+end);
			if(start>(end+1)) {
				if(count>sum) {
					sum=count;
				}
				end+=2;
				start=end-2;
				count=0;
			}
		}

		return sum;
	}
}
