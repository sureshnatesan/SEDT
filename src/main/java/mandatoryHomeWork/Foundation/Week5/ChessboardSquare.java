package mandatoryHomeWork.Foundation.Week5;
import org.junit.Test;

import junit.framework.Assert;

public class ChessboardSquare {


	/*Pseudo code
	 * https://leetcode.com/problems/determine-color-of-a-chessboard-square/
    1. Get the string input and splict to two character
    2. get the first character asci value and sum with 2nd character number value
    3. use the % operator to get the reminder if 0 return false, else true

	 */

	@Test
	public void testData() {
		Assert.assertEquals(true, squareIsWhite("h3"));
	}

	@Test
	public void testData1() {
		Assert.assertEquals(false, squareIsWhite("a1"));
	}

	public boolean squareIsWhite(String coordinates) {
		int a= coordinates.charAt(0);
		int b= Character.getNumericValue(coordinates.charAt(1));

		if((a+b)%2==0){
			return false;
		}
		else{
			return true;
		}
	}

}
