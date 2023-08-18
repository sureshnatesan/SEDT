package mandatoryHomeWork.Foundation.Problem1;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class CountCharFromString {

	//Psudeo code

	/* 1.convert the given string to lower case and Cerate the map 
	 * 2. convert the string to char
	 * 3. create the for loop
	 * 4. add character one by one in the map.
	 * 
	 * 
	 */

	@Test
	public void testdata(){
		System.out.println(soluction("Chennai Is In Tamilnadu @ South India"));
	}
	private Map <Character, Integer> soluction(String value) {
		Map <Character, Integer> map=new HashMap<>();

		value=value.toLowerCase();
		char[] charArray = value.toCharArray();
		for (int i = 0; i < charArray.length; i++) {
			if(map.containsKey(charArray[i])) {
				map.put(charArray[i], map.get(charArray[i])+1);
			}
			else {
				map.put(charArray[i], 1);
			}
		}
		return map;
		
	}

}
