package mandatoryHomeWork.DSA.week14;

import java.util.Arrays;
import java.util.List;

public class ToreversetheList {
	
	
	public static void main(String[] args) {
		List<List<Integer>> operations = Arrays.asList(
                Arrays.asList(0, 9),
                Arrays.asList(4, 5),
                Arrays.asList(3, 6),
                Arrays.asList(2, 7),
                Arrays.asList(1, 8),
                Arrays.asList(0, 9));
		
	 List<Integer> asList = Arrays.asList(9, 8, 7, 6, 5, 4, 3, 2, 1, 0);
	 System.out.println(performOperations(asList,operations));
	 
	}

	public static List<Integer> performOperations
	(List<Integer> arr, List<List<Integer>> operations) {

		List<Integer> list = operations.get(0);
		
		for(List<Integer> data:operations) {
			
			int left=data.get(0);
			int right=data.get(1);
		while(left<right) {
			int temp = arr.get(left);
			arr.set(left++,arr.get(right));
			arr.set(right--,temp);
		}
	}
		return arr;
	}
}
