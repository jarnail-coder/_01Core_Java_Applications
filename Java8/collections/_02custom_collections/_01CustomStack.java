package _02custom_collections;

public class _01CustomStack {
	public static void main(String[] args) {
		LinkedList linkedList = new LinkedList(); // creation of Linked List

		linkedList.insertFirst(11);
		linkedList.insertFirst(21);
		linkedList.insertFirst(59);
		linkedList.insertFirst(14);
		linkedList.insertFirst(39);

		linkedList.displayLinkedList(); // display LinkedList

		System.out.print("Deleted Nodes: ");
		Node deletedNode = linkedList.deleteFirst(); // delete Node
		deletedNode.displayNode(); // display deleted Node.
		deletedNode = linkedList.deleteFirst(); // delete Node.
		deletedNode.displayNode(); // display deleted Node.

		System.out.println();// sysout used to format output
		linkedList.displayLinkedList(); // Again display LinkedList

	}

}

class Node {
	public int data;
	public Node next;

	public Node(int data) {
		this.data = data;
	}

	public void displayNode() {
		System.out.print(data + " ");
	}
}

class LinkedList {
	private Node first;

	public LinkedList() {
		first = null;
	}

	public void insertFirst(int data) {
		Node newNode = new Node(data); // Creation of New Node.
		newNode.next = first; // newLink ---> old first
		first = newNode; // first ---> newNode
	}

	/**
	 * Deletes first Node of Singly LinkedList
	 */
	public Node deleteFirst() {
		if (first == null) { // means LinkedList in empty, throw
								// exception.
			throw new LinkedListEmptyException("LinkedList doesn't contain any Nodes.");
		}
		Node tempNode = first; // save reference to first Node in
								// tempNode-
								// so that we could return saved
								// reference.
		first = first.next; // delete first Node (make first point to
							// second
							// node)
		return tempNode; // return tempNode (i.e. deleted Node)
	}

	/**
	 * Display Singly LinkedList
	 */
	public void displayLinkedList() {
		System.out.print("Displaying LinkedList [first--->last]: ");
		Node tempDisplay = first; // start at the beginning of
									// linkedList
		while (tempDisplay != null) { // Executes until we don't find
										// end of
										// list.
			tempDisplay.displayNode();
			tempDisplay = tempDisplay.next; // move to next Node
		}
		System.out.println();

	}

	class LinkedListFullException extends RuntimeException {

		public LinkedListFullException() {
			super();
		}

		public LinkedListFullException(String message) {
			super(message);
		}

	}

	class LinkedListEmptyException extends RuntimeException {

		public LinkedListEmptyException() {
			super();
		}

		public LinkedListEmptyException(String message) {
			super(message);
		}

	}
}