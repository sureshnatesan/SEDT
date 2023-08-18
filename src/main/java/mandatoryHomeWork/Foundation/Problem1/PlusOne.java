package mandatoryHomeWork.Foundation.Problem1;

import org.junit.Test;

public class PlusOne {
	
	@Test
	public void testdata(){
		int[] input= {1,2,9};
		System.out.println(soluction(input));
		for (int i = 0; i < soluction(input).length; i++) {
			System.out.print(soluction(input)[i]);
		}
	}
	
	public int[] soluction(int[] a) {
		String sum="";
		
		for (int i = 0; i < a.length; i++) {
			sum=sum+String.valueOf(a[i]);
		}
		int parseInt = Integer.parseInt(sum)+1;
		String valueOf = String.valueOf(parseInt);
		int [] output=new int[valueOf.length()];
		for (int i = 0; i < valueOf.length(); i++) {
			char charAt = valueOf.charAt(i);
			int z= Character.getNumericValue(charAt);
			output[i]=z;
		}
		
		return output;
	}

	
	public int[] soluction1(int[] a) {
		String sum="";
		
		for (int i = 0; i < a.length; i++) {
			sum=sum+String.valueOf(a[i]);
		}
		int parseInt = Integer.parseInt(sum)+1;
		String valueOf = String.valueOf(parseInt);
		int [] output=new int[valueOf.length()];
		for (int i = 0; i < valueOf.length(); i++) {
			char charAt = valueOf.charAt(i);
			int z= Character.getNumericValue(charAt);
			output[i]=z;
		}
		
		return output;
	}
}
