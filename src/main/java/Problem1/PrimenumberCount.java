package Problem1;

import org.junit.Test;

public class PrimenumberCount {

	@Test
	public void testdata() {
		System.out.println(soluction1(10));
	}


	public boolean soluction(int input) {
		for (int i = 2; i < input; i++) {
			if(input%i==0) {
				return false;
			}
		}
		return true;
	}
	public int soluction1(int input) {
		int count=0;
		while(input>1) {
			if(soluction(input)) {
				count=count+1;
			}
			input--;

		}
		return count;

	}
}
