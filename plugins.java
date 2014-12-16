import java.util.*;

class Node{
	int data;
	Node  next;
}


class LinkListNode{
	private Node head = null;
	public static void main(String[] args){
		LinkListNode obj = new LinkListNode();
		obj.insertAtBegin(4);		
		obj.insertAtBegin(3);
		obj.insertAtBegin(2);
		obj.insertAtEnd(7);
		obj.insertAtEnd(8);
		obj.insertAtEnd(9);
		obj.insertAtMiddle(3,6);
		obj.showNodes();
		obj.deleteNode(9);
		obj.showNodes();
	}

	public void insertAtBegin(int data){
		Node temp = new Node();
		if(temp == null){
			System.out.println("Sorry New Node Cannot Created");
		}
		else{
			temp.data = data;		
			temp.next = null;
			if(head == null){
				head = temp;
			}
			else{
				temp.next = head;
				head = temp;
			}	
		}
		
	}

	public void insertAtEnd(int data){
		Node temp1 = head;
		while(temp1.next != null){
			temp1 = temp1.next;
		}
		Node temp2 = new Node();
		if (temp2 == null) {
			System.out.println("Sorry new Node Cannot be Create");
		}
		else{
			temp2.data = data;
			temp2.next = null;
			temp1.next = temp2;
		}
	}

	public void insertAtMiddle(int pos,int data){
		if(head == null){
			System.out.println("There is No element in Linklist so It can only insert at first position");
		}
		else{
			Node temp1 = head;
			Node temp = null;		
			int k = 1;
			while(k < pos){
				k++;
				temp = temp1;
				temp1 = temp1.next;
			}
			Node temp2 = new Node();
			if (temp2 == null) {
				System.out.println("Sorry new Node Cannot be Create");
			}
			else{
				temp2.data = data;
				temp2.next = temp1;
				temp.next = temp2;
			}
		}
	}

	public void showNodes(){
		if (head == null) {
			System.out.println("Sorry There is no element to Show in LinkedList");
		}
		else{
			Node temp = head;
			while(temp != null){
				System.out.print(temp.data+" -> ");
				temp = temp.next;
			}
		}
	}

	public void deleteNode(int key){
		if(head == null){
			System.out.println("Sorry There is no element available in Linklist to delete");

		}
		else{			
			Node temp = head;
			Node temp1 = null;
			while(temp.data != key || temp.next !=null){
				temp1 = temp;
				temp = temp.next;
			}
			temp1.next = temp.next;
			temp = null;
		}
	}

}














