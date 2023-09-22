package mandatoryHomeWork.DSA.week12;

import org.junit.Test;

public class GSTProgram {

	/*
	 * 
	 * 
	 * Pseudo
	 */

	@Test
	public void testData(){
		//int [] nums= {0,1,4,6,7,10};
		System.out.println(soluction("AACCC6016B", "29AACCC6016B1Z4"));
		System.out.println(soluction("AACCC6016B", "29AACCC6016C1Z4"));
		
	}
	public boolean soluction(String a, String b){

		if(b.contains(a)) {//O(n)- contains method
			return true;
		}
		else {
			return false;
		}
	}
}
