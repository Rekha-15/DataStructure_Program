/**
 * @purpose Implementing Ordered.LinkedList program
 * @author rekha
 * @version 1.0
 *  @since 15-062021
 */

package Ordered.LinkedList;

public class OrderedLinkedList<T> {
	public Node<T> head;
	//makes the head node equal to null
	public OrderedLinkedList() {
		this.head = null;
	}
	
	// the head node is empty if it is null
	boolean isEmpty() {
		return head == null;
	}
	
	// creates a temp that adds the new node to the head of the list
	public void insert(T data) {
		Node<T> temp = new Node<T>(data);
		Node<T> newnode = new Node<T>(data);
			newnode.data = data;
		if(head == null) {
			head = newnode;
		} else {
			Node<T> n = head;
			while(n.next != null) {
				n = n.next;
			}
			n.next = newnode;
		}
	}
	
	// inserting a node at the start
	public void insertAtStart(T data) {
		Node<T> new_node = new Node<T>(data);
		new_node.data = data;
		new_node.next = null;
		new_node.next = head;
		head = new_node;
	}
	
	// inserting a node at the end
	public void insertAtEnd(int index, T data) {
		Node<T> new_node = new Node<T>(data);
		new_node.data = data;
		new_node.next = null;
		
		if(index == 0) {
			insertAtStart(data);
		} else {
			Node<T> n = head;
			for(int i = 0; i < index-1; i++) {
				n = n.next;
			}
			new_node.next = n.next;
			n.next = new_node;
		}
	}
	
	// checks whether the value present or not
	public boolean search(T value) {
		Node<T> node = head;
		while (node != null) {
			if(node.data == value) {
				return true;
			}
			return false;
		}
		return false;
	}
	// deleting node at start
	public void deleteAtStart() {
		Node<T> n = head;
		head = head.next;
		System.out.println("Node deleted is: " + n.data);
		n = null;
	}
	
	// deleting node at the end
	public void deleteAtEnd(int index) {
		if(index == 0) {
			head = head.next;
		} else {
			Node<T> n = head;
			Node<T> n1 = null;
			for(int i = 0; i<index-1; i++) {
				n = n.next;
			}
			n1 = n.next;
			n.next = n1.next;
			System.out.println("Node deleted is: " + n1.data);
			n1 = null;
		}
	}
	
	// displaying all the elements of the list
	public void show() {
		Node<T> n = head;
		while(n.next != null) {
			System.out.println(n.data);
			n = n.next;
		}
		System.out.println(n.data);
	} 
	
	public static void main(String[] args) {
		OrderedLinkedList<Integer> list = new OrderedLinkedList<Integer>();
		list.insert(1);
		list.insert(2);
		list.insert(3);
		list.insertAtStart(0);
		list.insertAtEnd(2, 2);
		list.show();
		if(list.search(4)) {
			System.out.println("found");
		} else { 
			System.out.println("not found");
		}
		list.deleteAtEnd(2);
		list.deleteAtStart();
		list.show();
	} 

}