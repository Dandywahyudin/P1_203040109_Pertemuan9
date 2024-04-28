package Tugas9;

public class QueueMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			StrukturQueue queue = new StrukturQueue();
	        System.out.println("### Sebelum Enqueue ###");
	        System.out.println("Size: " + queue.size());
	        System.out.println("isEmpty: " + queue.isEmpty());

		        for (int i = 0; i < 3; i++){
		            queue.enqueue(3);
		        }

	        System.out.println("\n### Enqueue 3x ###");
	        System.out.println("Size: " + queue.size());
	        System.out.println("isEmpty: " + queue.isEmpty());
	        System.out.println("Front: " + queue.front());

	        StrukturQueue queue1 = new StrukturQueue();

	        System.out.println("\n### Sebelum Enqueue 4x ###");
	        System.out.println("Size: " + queue1.size());
	        System.out.println("isEmpty: " + queue1.isEmpty());
	        queue1.displayElement();

	        queue1.enqueue(2);
	        queue1.enqueue(7);
	        queue1.enqueue(6);
	        queue1.enqueue(1);

	        System.out.println("\n### Enqueue 4x ###");
	        System.out.println("Size: " + queue1.size());
	        System.out.println("isEmpty: " + queue1.isEmpty());
	        queue1.displayElement();
	        System.out.println("Front: " + queue1.front());

	        queue1.dequeue();
	        queue1.dequeue();
	        System.out.println("\n### Dequeue 2x ###");
	        queue1.displayElement();
	}
}
