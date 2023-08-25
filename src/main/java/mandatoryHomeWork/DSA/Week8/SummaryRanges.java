package mandatoryHomeWork.DSA.Week8;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class SummaryRanges {
	
	/*
	 * Input: nums = [0,1,2,4,5,7]
Output: ["0->2","4->5","7"]
	 * https://leetcode.com/problems/summary-ranges/description/
	 * Pseudo code
	 * 1.create a for loop and iterate, start the index with 1 and end with length-1;
	 * 
	 * 
	 */
	
	
	/*
	 * Input: nums = [0,1,2,4,5,7]
Output: ["0->2","4->5","7"]
	 */
//	 public List<String> summaryRanges(int[] nums) {
//		
//		 List<String>list =new ArrayList<String>();
//		 int start =0;
//		 int count=0;
//	        for (int i = 0; i < nums.length; i++) {
//				if(nums[i]==count) {
//					count++;
//				}
//				else if((count-start)==1) {
//					list.add(nums[count-1]+"");
//					count++;
//				}
//				else {
//					if((count-start)>1) {
//						list.add(nums[start]+"->"+nums[count-1]);
//						start=count;
//						count++;
//						i=start;
//					}
//				}
//			}
//	        return list;
//	    }
	 
	 	@Test
		public void testData() {
			System.out.println(summaryRanges1(new int[] {0,2,3,4,6,8,9}));
			//System.out.println(summaryRanges1(new int[] {0,1,2,4,5,7}));
		}
	 
	 public List<String> summaryRanges1(int[] nums) {
		 int count=0;
		 int start =0;
		 List<String>list =new ArrayList<String>();
		 System.out.println("hellow");
		 for (int i = 0; i <=nums[nums.length-1]; i++) {
			if(count<nums.length) {
				if(nums[count]==i) {
					count++;
				}
				else if(nums[count]!=i&&(count-start)>1) {
					list.add(nums[start]+"->"+nums[count-1]);
					start=count;
					i=start;
					//count++;
				}
				else if(count-start==0||count-start==1) {
					list.add(nums[start]+"");
					start=count;
					i=start;
				}
				else {
					count++;
				}
			}
		}
		 return list;
	 }

}
