package Examples;

public class LinkedList {
	static Node head;
	static class Node{
		int data;
		Node next;
		Node(int d){
			this.data=d;
			next=null;
		}
	}
	//1->2->3->4
	Node Reverse(Node head) {
		Node prev=null;
		Node next=null;
		Node curr=head;
		
		while(curr!=null) {
			next=curr.next;
			curr.next=prev;
			prev=curr;
			curr=next;
		}
		return prev;
	}
	
	public static void main(String[] args) {
		LinkedList li= new LinkedList();
		li.head=new Node(1);
		li.head.next=new Node(2);
		li.head.next.next=new Node(3);
		li.head.next.next.next=new Node(4);
		Print(head);
		System.out.println();
		Node head_1=li.Reverse(head);
		Print(head_1);
		
		
	}

	private static void Print(Node head) {
		// TODO Auto-generated method stub
		while(head!=null) {
			System.out.print(head.data+"->");
			head=head.next;
		}
		
	}

}
