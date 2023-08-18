package mandatoryHomeWork.Foundation.Week5;

import org.junit.Assert;
import org.junit.Test;

public class ExcelSheetColumnTitle {
	

    /*https://leetcode.com/problems/excel-sheet-column-title/
    Pseudo code
    1. use the while loop to iterate  the input
    2. use the % operator to get the reminder and sum with 64 to get the ASCi
    value
    3. use the div operatior to decreament the input
    

    */
	
	@Test
	public void testData() {
		Assert.assertEquals("ZY", convertToTitle(701));
	}
	
	
	@Test
	public void testData1() {
		Assert.assertEquals("AB", convertToTitle(28));
	}
	
	@Test
	public void testData2() {
		Assert.assertEquals("A", convertToTitle(1));
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
