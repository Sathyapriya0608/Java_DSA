package Linkedlist;
class Node{
	int data;
	Node link;
	
}
class Method{
	static Node head;
	public static void insertAtBegin(int data) {
		Node newNode=new Node();// node creation
		newNode.data=data;
		newNode.link=null;// 1 null
		if(head==null) // if head is null list is empty
		{
			head=newNode;
			
		}
		else {
			newNode.link=head;
			head=newNode;
		}
		//stem.out.println(head);
		
	
}
	

	public static void insertAtEnd(int data) {
		Node newNode=new Node();// node creation
		newNode.data=data;
		newNode.link=null;// 1 null
		if(head==null) // if head is null list is empty
		{
			head=newNode;
			
		}
		else {
			Node temp=head;
			while(temp.link!=null) {
				temp=temp.link;
			}
			temp.link=newNode;
		}
		//stem.out.println(head);
		
	
}

	
	public static void insertAtPos(int data,int pos) {
		Node newNode=new Node();// node creation
		newNode.data=data;
		newNode.link=null;// 1 null
		if(pos==0) // if head is null list is empty
		{
			insertAtBegin(data);
			
		}
		Node temp=head;
		for(int i=1;i<pos;i++) {
			temp=temp.link;
		}
		newNode.link=temp.link;
		temp.link=newNode;
		
		
	
}
	public static void deleteAtBegin() {
    	if(head==null) {
    		return;
    	}
    	else {
    		Node temp=head;
	    	head=temp.link;
	    	temp.link=null;
	    }
 	}

	

	
	
	public static void display() {
		Node temp=head;
		while(temp!=null) {
			System.out.print(temp.data+"  ");
			temp=temp.link;
		}
	}
	 
}
public class Singly extends Method{
	public static void main(String[] args) {
		insertAtBegin(1);
		insertAtBegin(2);
		insertAtBegin(3);
		display();
		insertAtEnd(11);
		insertAtEnd(12);
		insertAtEnd(13);
		display();
		insertAtPos(4,2);
		display();
		deleteAtBegin();
		display();

}
}

