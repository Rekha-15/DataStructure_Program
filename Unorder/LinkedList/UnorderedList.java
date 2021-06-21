/**
 * @purpose Implement the linked list problem
 * @author rekha
 * @version 1.0
 * @since 15-06-2021
 */

package Unorder.LinkedList;

/**
 * UnorderedList is a class of public type
 * 
 * @author rekha
 * @param <T> implementing generic
 */

public class UnorderedList<T> {
	public Node<T> head;

	// makes the head node equal to null
	public UnorderedList() {
		this.head = null;
	}

	// the head node is empty if it is null
	boolean isEmpty() {
		return head == null;
	}

	
	/**
	 * insert is a method of public type insert method created to insert the
	 * createing a temp that adds the new node to the head of the list elements
	 * 
	 * @param data
	 */

	public void insert(T data) {
		Node<T> temp = new Node<T>(data);
		Node<T> newnode = new Node<T>(data);
		newnode.data = data;
		if (head == null) {
			head = newnode;
		} else {
			Node<T> n = head;
			while (n.next != null) {
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

	/**
	 * insertAtEnd an method of void here i am inserting a node at the end
	 */

	public void insertAtEnd(int index, T data) {
		Node<T> new_node = new Node<T>(data);
		new_node.data = data;
		new_node.next = null;

		if (index == 0) {
			insertAtStart(data);
		} else {
			Node<T> n = head;
			for (int i = 0; i < index - 1; i++) {
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
			if (node.data == value) {
				return true;
			}
			return false;
		}
		return false;
	}

	/**
	 * deletAtStart method of voide type here deliting the element at first deleting
	 * node at start
	 * 
	 * @author rekha deleting the value by providing head
	 *
	 */

	public void deleteAtStart() {
		Node<T> n = head;
		head = head.next;
		System.out.println("Node deleted is: " + n.data);
		n = null;
	}

	/**
	 * deleteAtEnd is a method
	 * 
	 * @author rekha it will delet the last node in a sequence
	 */

	// deleting node at the end
	public void deleteAtEnd(int index) {
		if (index == 0) {
			head = head.next;
		} else {
			Node<T> n = head;
			Node<T> n1 = null;
			for (int i = 0; i < index - 1; i++) {
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
		while (n.next != null) {
			System.out.println(n.data);
			n = n.next;
		}
		System.out.println(n.data);
	}

	/**
	 * main method UnorderedList is a class creating an abject called list in it
	 * inserting elements
	 * 
	 * @param args calling all functions
	 */

	public static void main(String[] args) {
		UnorderedList<Integer> list = new UnorderedList<Integer>();
		list.insert(12);
		list.insert(15);
		list.insert(7);
		list.insertAtStart(8);
		list.insertAtEnd(2, 55);
		list.show();
		if (list.search(7)) {
			System.out.println("found");
		} else {
			System.out.println("not found");
		}
		list.deleteAtEnd(2);
		list.deleteAtStart();
		list.show();
	}
}