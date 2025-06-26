package Linkedlist;
class Nodes{
	Nodes prev,next;
	int data;
}
class Methodss{
	static Nodes head,tail,temp;
	public  static void insertAtStart(int data) {
		Nodes newNode=new Nodes();
		newNode.data=data;
		newNode.next=null;
		newNode .prev=null;
		if(head==null) {
			head=newNode;
			tail=newNode;
			head.next=newNode;
			head.prev=newNode;
			
		}
		else {
			head.prev=newNode;
			newNode.next=head;
			head.next=newNode;
			newNode.prev=head;
			head=newNode;
		}
		while(temp!=head);
	}
	public static void display() {
		Nodes temp=head;
		while(temp!=head) {
			System.out.println(temp.data);
			temp=temp.next;
			
		}
	}
}

public class circularsingly extends Methodss {
	public static void main(String[] args) {
		insertAtStart(1);
		insertAtStart(2);
		insertAtStart(3);
		display();
		
	}
	
	

}
