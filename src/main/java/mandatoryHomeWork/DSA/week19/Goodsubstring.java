package mandatoryHomeWork.DSA.week19;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.junit.Test;

public class Goodsubstring {

	@Test
	public void testData(){
		String s="xyzzaz";
		soluction(s);
		
	}

	private void soluction(String s) {
		Set<Character> set = new HashSet<>();
		StringBuilder sb = new StringBuilder();
		int sum=0;
		for (int i = 0; i < 3; i++) {
			set.add(s.charAt(i));
		}
		if(set.size()==3) {
			sum++;
		}
		
		for (int i = 3; i < s.length(); i++) {
			set.remove(s.charAt(i-3));
			set.add(s.charAt(i));
			if(set.size()==3) {
				sum++;
			}
		}
		System.out.println(sum);
	}
}
