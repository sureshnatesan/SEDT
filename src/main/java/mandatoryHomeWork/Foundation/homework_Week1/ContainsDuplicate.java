package mandatoryHomeWork.Foundation.homework_Week1;
import org.junit.Assert;
import org.junit.Test;

public class ContainsDuplicate {


	/*
	 * Psudeo code
	 * 1. compare the int[] using two for loop
	 * 2. In a iteration if any one iteration matches the each loop value
	 * 3. return as true else false
	 */

	@Test
	public void testData() {
		int[] a=	{1,2,3,1};
		Assert.assertEquals(true, soluction(a));
	}
	
	@Test
	public void testData1() {
		int[] a=	{1,2,3,4};
		Assert.assertEquals(false, soluction(a));
	}
	
	@Test
	public void testData2() {
		int[] a=	{1,1,1,3,3,4,3,2,4,2};
		Assert.assertEquals(true, soluction(a));
	}
	
	public boolean soluction(int [] a) {

		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				if(a[i]==a[j]) {
					return true;
				}
			}
		}
		return false;
	}
}
