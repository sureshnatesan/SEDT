package mandatoryHomeWork.Foundation.Problem1;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import junit.framework.Assert;

public class Count1 {

	@Test
	public void testdata1(){
		int[] a= {0,0,0,1,1,1};
		Assert.assertEquals(3, Soluction1(a));
	}

	@Test
	public void testdata2(){
		int[] b= {0,0,1,2,3};
		Assert.assertEquals(1, Soluction1(b));
	}

	public int Soluction(int[] a) {
		int count =0;
		
		for (int i = 0; i < a.length; i++) {
			if(a[i]==1) {
				count=count+1;
			}
		}
		return count;
	}
	
	public int Soluction1(int[] a) {
		int count =0;
		List<Integer>list = new ArrayList<>();
		
		for (int i = 0; i < a.length; i++) {
			if(a[i]==1) {
				list.add(a[i]);
				
			}
		}
		return list.size();
	}

}
