package mandatoryHomeWork.DSA.week15;


public class Node {
	
	int val;
	Node Current;
	
	Node(int val){
		this.val=val;
	}
	
	
	//11,12,15
	public static void main(String[] args) {
		Node l1= new Node(11);
		Node l2 = new Node(12);
		Node l3 = new Node(15);
		
		l1.Current=l2;
		l2.Current=l3;
		l3.Current=null;
		
		Node head=l1;
		while(head!=null){
			System.out.println(head.val);
			head=head.Current;
			
		}
		
	}
}
