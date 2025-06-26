package Linkedlist;


class DubNode{
	int data;
	DubNode next;
	DubNode prev;
}
class Methods{
	static DubNode head,tail;
	public static void insertAtBegining(int data) {
		DubNode newNode=new DubNode();
		newNode.data=data;
		newNode.prev=null;
		newNode.next=null;
		if(head==null) {
			head=newNode;
			tail=newNode;
			
		}
		else
		{
			newNode.next=head;
			head.prev=newNode;
			head=newNode;
		}
		
	}
	public static void insertAtEnd(int data) {
		DubNode newNode=new DubNode();
		newNode.data=data;
		newNode.prev=null;
		newNode.next=null;
		if(head==null) {
			insertAtBegining(0);
			
		}
		else
		{
			tail.next=newNode;
			newNode.prev=tail;
			tail=newNode;
		}
		
	}
	public static void insertAtPos(int data,int pos) {
		DubNode newNode=new DubNode();
		newNode.data=data;
		newNode.prev=null;
		newNode.next=null;
		if(pos==0) {
			insertAtBegining(0);
		}
		DubNode temp=head;
		for(int i=1;i<pos;i++) {
			temp=temp.next;
		}
		newNode.next=temp.next;
		temp.next.prev=newNode;
		temp.next=newNode;
		newNode.prev=temp;
		temp.next=newNode;
	}
	
	
	
	public static void display() {
		DubNode temp=head;
		while(temp!=null) {
			System.out.print(temp.data+"  ");
			temp=temp.next;
		}
	}
}
public class Double extends Methods{
	public static void main(String[] args) {
		insertAtBegining(1);
		insertAtBegining(2);
		insertAtBegining(3);
		display();
		insertAtEnd(11);
		insertAtEnd(12);
		insertAtEnd(13);
		display();
		insertAtPos(5,1);
		display();
		
		
	}
	

}
