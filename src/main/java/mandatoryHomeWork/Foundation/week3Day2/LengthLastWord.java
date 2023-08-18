package mandatoryHomeWork.Foundation.week3Day2;

import org.junit.Test;

import junit.framework.Assert;

public class LengthLastWord {
	
	/*
	 * pseudo Code
	 * 1. input.trim
	 * 2.input.subString(lastIndexof(" ")+1, input.length).length();
	 * 
	 */
	
	@Test
	public void testData() {
	Assert.assertEquals(5, soluction("Hello World"));
	}
	
	@Test
	public void testData1() {
	Assert.assertEquals(4, soluction("   fly me   to   the moon  "));
	}
	
	@Test
	public void testData2() {
	Assert.assertEquals(6, soluction("luffy is still joyboy"));
	}
	
	public int soluction(String a) {
		a=a.trim();
	return a.substring(a.lastIndexOf(" ")+1, a.length()).length();
				

	}

}
