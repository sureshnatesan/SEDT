package mandatoryHomeWork.DSA.week9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class MatchingRule {

	/*
	 * https://leetcode.com/problems/count-items-matching-a-rule/description/
	 * /*https://leetcode.com/problems/count-items-matching-a-rule/submissions/
    Test Data
    1.Postive
    [[phone,yellow, pixel],
    [bike,blue,yamaha],
    [wallet,black,lepord]
Pseudo code
1.create a for loop to iterate
2. use the .equals conditions to check rulekey and rule value
3. use the if condition to check matching rulekey, if maches return the count
    */
	 
	@Test
	public void testData() {
		List<List<String>> items = new ArrayList<>();
		items.add(0, Arrays.asList("phone","blue","pixel"));
		items.add(1, Arrays.asList("computer","silver","lenovo"));
		items.add(2, Arrays.asList("phone","gold","iphone"));
		
		System.out.println(soluction(items,"color","blue"));
	}

	public int soluction(List<List<String>> items, String ruleKey, String ruleValue) {
	int count=0;
		for (int i = 0; i < items.size(); i++) {
		List<String> list = items.get(i);
		if(ruleKey.equalsIgnoreCase("type")) {
			if(list.get(0).equalsIgnoreCase(ruleValue)) {
				count++;
			}
		}
		if(ruleKey.equalsIgnoreCase("color")) {
			if(list.get(1).equalsIgnoreCase(ruleValue)) {
				count++;
			}
		}
		if(ruleKey.equalsIgnoreCase("name")) {
			if(list.get(2).equalsIgnoreCase(ruleValue)) {
				count++;
			}
		}
		
	}
return count;
	}

}
