package mandatoryHomeWork.DSA.week15;

public class ConvertingBinary {
	
	/*
	 * 
	 * https://leetcode.com/problems/convert-binary-number-in-a-linked-list-to-integer/description/
	 */
	
	class Solution {
	    public int getDecimalValue(ListNode head) {
	        String s="";
	        while(head!=null){
	            s+=head.val;
	            head=head.next;
	        }

	        return Integer.parseInt(s,2);
	    }
	}

}
