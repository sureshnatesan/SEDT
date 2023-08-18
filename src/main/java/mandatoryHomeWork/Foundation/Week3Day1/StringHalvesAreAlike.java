package mandatoryHomeWork.Foundation.Week3Day1;

import org.junit.Test;

import junit.framework.Assert;

public class StringHalvesAreAlike {




	/*
	 * Pseudo code
	 * 1. split the string into 2 array.
	 * 2. check for the no of vowels in both array
	 * 3. if count match we should return true;
	 * 
	 */
	
	
	@Test
	public void testData() {
	
		Assert.assertEquals(true, soluction("book"));

	}

	public boolean soluction(String a) {
		int count=0;
		String a1=(String) a.subSequence(0, (a.length()/2));
		String a2=(String) a.subSequence((a.length()/2), a.length());

		for (int i = 0; i < a1.length(); i++) {
			if(a1.charAt(i)=='a'||a1.charAt(i)=='e'||a1.charAt(i)=='i'||a1.charAt(i)=='o'||a1.charAt(i)=='u'||a1.charAt(i)=='A'||a1.charAt(i)=='E'||a1.charAt(i)=='I'||a1.charAt(i)=='O'||a1.charAt(i)=='U');
			count++;
		}
		
		for (int i = 0; i < a2.length(); i++) {
			if(a2.charAt(i)=='a'||a2.charAt(i)=='e'||a2.charAt(i)=='i'||a2.charAt(i)=='o'||a2.charAt(i)=='u'||a2.charAt(i)=='A'||a2.charAt(i)=='E'||a2.charAt(i)=='I'||a2.charAt(i)=='O'||a2.charAt(i)=='U');
			count--;
		}

		return count==0;
	}
}
