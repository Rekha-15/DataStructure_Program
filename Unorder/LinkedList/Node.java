/**
 * @purpose Implement the linked list problem
 * @author rekha
 * @version 1.0
 * @since 15-06-2021
 */

package Unorder.LinkedList;

/**
 * Node is an class of public type
 *here we defining data, and next.
 *then initialized data is set as the head
 *the next node is set to  null, as if there is no node
 * @param <T> used to implement generic 
 */

public class Node<T> {
	
	T data;
	Node<T> next;
	
	public Node(T data2) {
		this.data = (T) data2; // the initialized data is set as the head
		this.next = null; // the next node is set to  null, as if there is no node
	}
	
	// method that return data of a given node
	public T getdata() {
		return data;
	}
	
	/**
	 * method that gets the next node
	 * @return next node
	 */
	Node<T> getNext() {
		return next;
	}
	
	/**
	 * method that sets data in node
	 * @param newData
	 */

	public void setData(T newData) {
		this.data = newData;
	}
	/**
	 * method that setNext for newNext
	 * @param newNext
	 */
	
	public void setNext(Node<T> newNext) {
		this.next = newNext;
	}
}
