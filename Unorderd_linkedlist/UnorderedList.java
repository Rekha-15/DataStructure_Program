/**
 * @purpose Implementing Ordered.LinkedList program
 * @author rekha
 * @version 1.0
 *  @since 15-062021
 */

package Unorderd_linkedlist;

/**
 *  UnorderedList is a calss of publiuc type
 * @author rekha
 *
 * @param <T> implementing generic
 */

public class UnorderedList<T> {

	/**
	 * First making head node to null
	 * the head node is empty if it is null
	 */
	public Node<T> head;
	
	public UnorderedList() {
		this.head = null;
	}
	
	boolean isEmpty() {
		return head == null;
	}
	
	/**
	 * insert is a method of public type
	 * insert method using to insert elements
	 * it add nodes still end reaches to null
	 * creates a temp that adds the new node to the head of the list
	 * @param data
	 */
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
	

	/**
	 *  Search method with a void type
	 *  Check weather element is present or not
	 *  if element is present it will print it index number 
	 *  if elemengt is present it @return true else false
	 *  @return true or false
	 */
	
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
	
	/**
	 * deleteAtStart is a method of public void type
	 * deleteAtEnd method used to delete node at start
	 * @author rekha
	 *
	 * @param <T>
	 */
	
	public void deleteAtStart() {
		Node<T> n = head;
		head = head.next;
		System.out.println("Node deleted is: " + n.data);
		n = null;
	}
	
	/**
	 * deleteAt End is a method of public void type
	 * deleteAtEnd method used to delete node at the end
	 * @author rekha
	 *
	 * @param <T>
	 */
	 
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
	
	/**
	 * void show method
	 * displaying all the elements of the list
	 */
	
	public void show() {
		Node<T> n = head;
		while(n.next != null) {
			System.out.println(n.data);
			n = n.next;
		}
		System.out.println(n.data);
	} 
	
	/**
	 * main method
	 * inserting all elements 
	 * all functions will be called by main method
	 * @param args
	 */
	
	public static void main(String[] args) {
		UnorderedList<Integer> list = new UnorderedList<Integer>();
		list.insert(12);
		list.insert(15);
		list.insert(7);
		list.insertAtStart(8);
		list.insertAtEnd(2, 55);
		list.show();
		if(list.search(7)) {
			System.out.println("found");
		} else { 
			System.out.println("not found");
		}
		list.deleteAtEnd(2);
		list.deleteAtStart();
		list.show();
	} 
}