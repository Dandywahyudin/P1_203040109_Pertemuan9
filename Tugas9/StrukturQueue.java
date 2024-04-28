package Tugas9;

public class StrukturQueue {
	   private Node FRONT;
	    private Node REAR;

	    public StrukturQueue() {
	        this.FRONT = null;
	        this.REAR = null;
	    }
	public void enqueue(int data) {
		Node newNode = new Node(data);
			if (isEmpty()) {
				FRONT = newNode;
				REAR = newNode;
			}
			else {
				REAR.setNext(newNode);
				REAR = newNode;
			}
	}
	
	public void dequeue(){
        if (isEmpty()){
            System.out.println("Data Masih Kosong");
        } else {
            Node tempFRONT = FRONT;
            FRONT = FRONT.getNext();
            REAR = null;
            tempFRONT = null;
        }
    }
	
	public int size() {
		int size = 0;
		Node curNode = FRONT;
		while(curNode != null) {
			size++;
			curNode = curNode.getNext();
		}
		return size;
	}
	public int front() {
		return FRONT != null ? FRONT.getData() : -1;
	}
	
	public void displayElement() {
        Node curNode = FRONT;
        System.out.print("Elemen Queue: ");
        while (curNode != null) {
            System.out.print(curNode.getData() + " ");
            curNode = curNode.getNext();
        }
        System.out.println();
    }

    boolean isEmpty() {
        return FRONT == null;
    }
	
	
}
