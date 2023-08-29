package mandatoryHomeWork.DSA.Week8;

import org.junit.Test;

public class SeniorCitizen {

	/*
	 * 
	 * Pseudo code
	 * 1. use the sub string method to get the count 11,13
	 * 2.Store in the int[] ,check if number is greather than 69
	 */
	@Test
	public void testData() {

		System.out.println(soluction(new String[] {"7868190130M7522","5303914400F9211","9273338290F4010"}));

	}

	public int soluction(String[] a) {
		int count=0;
		int[] sum= new int[a.length];
		for (int i = 0; i < a.length; i++) {
			if(a[i].charAt(10)=='M') {
				String[] value=a[i].split("M");
				if(value[1].length()==5) {
					sum[i]=Integer.parseInt(value[1].substring(0, 3));
				}
				else {
					sum[i]=Integer.parseInt(value[1].substring(0, 2));
				}
			}
			if(a[i].charAt(10)=='F') {
				String[] value=a[i].split("F");
				if(value[1].length()==5) {
					sum[i]=Integer.parseInt(value[1].substring(0, 3));
				}
				else {
					sum[i]=Integer.parseInt(value[1].substring(0, 2));
				}
			}
			if(a[i].charAt(10)=='O') {
				String[] value=a[i].split("O");
				if(value[1].length()==5) {
					sum[i]=Integer.parseInt(value[1].substring(0, 3));
				}
				else {
					sum[i]=Integer.parseInt(value[1].substring(0, 2));
				}
			}
		}
		for (int i = 0; i < sum.length; i++) {
			if(sum[i]>=60) {
				count++;
			}
		}
		return count;
	}
}
