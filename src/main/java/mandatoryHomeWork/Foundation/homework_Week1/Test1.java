package mandatoryHomeWork.Foundation.homework_Week1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.junit.Assert;
import org.junit.Test;

public class Test1 {

	//@Test
	public void testData() {
		Assert.assertEquals("abcdef",replaceDigits("a1c1e1"));
	}

	public String replaceDigits(String s) {
		for (int i = 1; i < s.length(); i+=2) {
			int a= Character.getNumericValue(s.charAt(i))+s.charAt(i-1);
			s=s.replaceFirst(s.charAt(i)+"", (char)a+"");

		}
		return s;
	}

	@Test
	public void testData1() {
		System.out.println(20%10);
		//System.out.println(convertToTitle1(702));
		//System.out.println(convertToTitle(27));
		//System.out.println(convertToTitle1(27));
		//System.out.println(702/26);
	}

	
	public String convertToTitle(int columnNumber) {
		String out="";
		while(columnNumber>0){
			columnNumber--;
			char toAdd = (char)((columnNumber % 26) + 65);
			out=toAdd+out;
			columnNumber = columnNumber/26;
		}
		return out;
	}
}
