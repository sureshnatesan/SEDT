package mandatoryHomeWork.DSA.week15;

import java.util.LinkedList;
import java.util.List;

public class ListNode {

	int val;
	public ListNode next;
	ListNode head;
	ListNode tail;
	ListNode() { 
	}
	
	ListNode(int val) { 
		this.val = val;
	}
	ListNode(int val, ListNode next) { 
		this.val = val; 
		this.next = next; 
	}

	/*
	 * https://leetcode.com/problems/reverse-linked-list/
	 * 
	 * 1,2,3,4,5
	 */

	public  void adddata(int data) {  
		List<Integer> list = new LinkedList<>();
		if(head== null) {  
			tail = new ListNode(data,head);  
			head = tail;  
		}  
		else {  
			tail.next = new ListNode(data,head);  
			tail = tail.next;  
		}  
		//reverseList1(head);
	}


	public void reverseList1(ListNode head) {

		ListNode pre=null,next =null;
		ListNode current=tail;
		while(current!=null) {
			next=current.next;
			current.next=pre;
			pre=current;
			current=next;	
			System.out.println(pre.val);
		}
	}

	public void remove(ListNode head, int a) {
		
	}

		
	public void display1(ListNode head){
		while(head!=null) {
			head=head.next;
			System.out.println(head.val);
		}
	}
	public void display() { 
		//ListNode current = head;    
		while(head != null) {      
			System.out.print(head.val + " ");    
			head = head.next;    
		}    
		System.out.println();    
	}  


	public static void main(String[] args) {
		ListNode sd=new ListNode(11);
		int[] a= {1,2,3,4,5};
		for (int i = 0; i < a.length; i++) {
			sd.adddata(a[i]);
		}
		//sd.reverseList1(sd);
		sd.display();
	}


	public ListNode reverseList(ListNode head) {
		if(head == null) return  null;
		if(head.next == null) return head;

		ListNode currentHead = null;
		while(head != null){
			currentHead = new ListNode(head.val, currentHead);
			head = head.next;
		}

		return currentHead;
	}

}
