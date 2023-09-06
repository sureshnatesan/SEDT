package mandatoryHomeWork.DSA.week9;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class RangeOfExcel {


	/*https://leetcode.com/problems/cells-in-a-range-on-an-excel-sheet/submissions/
    Test Data
    1.Postive
    i.B1,C3
    ii.C1, F1
    Negative
    i.C1,C1

Pseudo code
1. create two for loop one col & row
2. Split the input by using charAt operator
3. create a new list to add the values
	 */

	@Test
	public void testData(){
		System.out.println(cellsInRange("K1:L2"));
	}

	public List<String> cellsInRange(String s) {
		List<String> sum=new ArrayList<String>();
		for(char i=s.charAt(0); i<=s.charAt(3);i++){
			for(int j=Integer.parseInt(s.charAt(1)+"");j<=Integer.parseInt(s.charAt(4)+"");j++){
				sum.add(""+i+""+j);
				System.out.println(i);
			}
		}
		return sum;
	}

}
