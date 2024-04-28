package Tugas9;

public class Node {
	private StrukturQueue REAR;
	private Node FRONT;
	Node next;
	private int data;

	public Node(int data) {
		this.data = data;
	}
	
	public Node getFRONT() {
		return FRONT;
	}
	public void setFRONT(Node fRONT) {
		FRONT = fRONT;
	}

	public StrukturQueue getREAR() {
		return REAR;
	}

	public void setREAR(StrukturQueue rEAR) {
		REAR = rEAR;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}
}
	
