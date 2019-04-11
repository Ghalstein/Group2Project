
public class DoublyLinkedList {
	  	private Node head;
	    private Node tail;
	    private int size = 0;

	    private static class Node {
	    private Student stud;
	    private Node next;
	    private Node prev;

	        public Node(Student s, Node nxt, Node prv) {
	            stud = s;
	            next = nxt;
	            prev = prv;
	        }

	        public Node(Student s) {
	            stud = s;
	            next = null;
	            prev = null;
	        }
	}
	    
	    public void addTail(Student stud) {
	        Node newNode = new Node(stud, null, null);
	        if (size == 0) {
	            head = tail = newNode;
	        } else {
	            newNode.prev = tail;
	            tail.next = newNode;
	            tail = newNode;
	        }
	        size++;
	    }
	    
	    public void print() {
	        Node temp = head;
	        while (temp != null) {
	            System.out.print(temp.stud + " ");
	            temp = temp.next;
	        }
	}

}
