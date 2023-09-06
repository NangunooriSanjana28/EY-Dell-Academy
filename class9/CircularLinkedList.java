package class9;

public class CircularLinkedList {
	
	static class Node{
		int data;
		Node next;
		
		Node() {}
		
		Node(int data){
			this.data = data;
		}
	}
	private Node head,tail;
	
	CircularLinkedList() {
		this.head = null;
		this.tail = null;
	}
	public boolean isEmpty() {
		return head == null;
	}
	public void insertAtFirst(int data) {
		Node newNode = new Node(data);
		//check if the linked list is empty
		if(head == null) {
			head = newNode; //both head and tail will point to same node
			tail = newNode;
			newNode.next = head;
		} else {
			Node temp = head;//store data in temporary node
			newNode.next = temp; //new node will point to temp as a next node
			head = newNode; //new node will be the head node
			//since it is circular linked list,tail will point to head
			tail.next = head;
		}
	}
	public void insertAtLast(int data) {
		Node newNode = new Node(data);
		//check if the linked list is empty
		if(head == null) {
			head = newNode; //both head and tail will point to same node
			tail = newNode;
			newNode.next = head;
		} else {
		   // tail will point to new node 
			tail.next = newNode;
			//New node will become new tail
			tail = newNode;
			//since it is circular linked list,tail will point to head
			tail.next = head;
		    
		}
	}
	public void insertAtParticular(int data,int position) {
		Node temp,newNode;
		int i,count;
		newNode = new Node();
		temp = head;
		count = size();
		//check if the list is empty
		if(temp == null ||size() < position) {
			System.out.println("Index is greater than size of the list");
		} else {
			newNode.data = data;
			for(i=1;i<position-1;i++) {
				temp = temp.next;
			}
			newNode.next=temp.next;
			temp.next = newNode;
		}
	}
	public int size() {
		int size = 0;
		if(head!= null) {
			Node temp = head;
			while(temp.next != head) {
				temp = temp.next;
				size++;
			}
		}
		return size;
	}
	public void display( ) {
		 Node temp = head;
		 if(head!= null) {
			 do {
				 System.out.printf("%d",temp.data);
				 temp=temp.next;
			 }while(temp!= head);
		 }
		 System.out.println("\n");
	}
	
	

	public static void main(String[] args) {
		CircularLinkedList list = new CircularLinkedList();
		list.insertAtFirst(1);
		list.display();
		System.out.println("Size - " +list.size());
		list.insertAtFirst(2);
		list.display();
		System.out.println("Size - " +list.size());
		list.insertAtLast(3);
		list.display();
		System.out.println("Size - " +list.size());
		list.insertAtLast(4);
		list.display();
		System.out.println("Size - " +list.size());
		list.insertAtParticular(5,3);
		list.display();
		System.out.println("Size - " +list.size());
		
		list.deleteNode(2);
		System.out.println("Node with value 2 has been deleted");
		list.display();
		System.out.println("Size -"+list.size());

	}
	public void deleteNode(int data) {
		if(head == null) {
			System.out.println("List is empty");
		}
		Node currentNode = head;
		Node previousNode = new Node();
		while(currentNode.data != data) {
			if(currentNode.next == head) {
				System.out.println("given node with data "+data+"is not found in circular linked list");
				break;
			}
			previousNode = currentNode;
			currentNode = currentNode.next;
			
		}
		if(currentNode == head && currentNode.next == head) {
			{
			head=null;
		}
		if(currentNode == head) {
			previousNode = head;
			while(previousNode.next != head) {
				previousNode = previousNode.next;
			}
			head=currentNode.next;
			previousNode.next = head;
		}
		else if(currentNode.next == head) {
			previousNode.next = head;
		}else {
			previousNode.next = currentNode.next;
		}
	}

}
}
