package mandatoryHomeWork.DSA.week15;

import java.util.Iterator;
import java.util.Random;

public class CreateLinkedCycle {

	ListNode head= new ListNode(0);
	ListNode sample=head;
	
	

	public void add(int a){
		head.val=a;
		head=head.next;
	}

	public static void main(String[] args) {
		int[] a= {1,2,3,4,5,6,7,8};
		int size1=0;
		CreateLinkedCycle d=new CreateLinkedCycle();
		for (int i = 0; i < a.length; i++) {
			d.add(a[i]);
			size1++;
		}
		
		  Random random = new Random();
//	        // Generate a random number in the range of 1 to 8
//	        int minValue = 1;  // Minimum value
//	        int maxValue = size1-1;  // Maximum value (inclusive)
	        int randomValue = random.nextInt(size1-1 - 1 + 1) + 1;
	        System.out.println(randomValue);

		
		
	}



}
