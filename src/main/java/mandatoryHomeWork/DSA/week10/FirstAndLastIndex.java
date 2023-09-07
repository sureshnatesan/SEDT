package mandatoryHomeWork.DSA.week10;

import org.junit.Test;

public class FirstAndLastIndex {
	@Test
	public void testData1() {
		System.out.println(soluction(new int[] {2,2,3,8,7,3,4,4},3));
	}

	public String soluction(int[] a,int target ) {
	int first=0;
	int last=0;	
		for (int i = 0; i < a.length; i++) {//O(n)
			if(a[i]==target) {
				first=i;
				break;
			}
		}
		
		for (int i = a.length-1; i >=0; i--) {//O(n)
			if(a[i]==target) {
				last=i;
				break;
			}
		}
		return first+"&"+last;
	}
}
