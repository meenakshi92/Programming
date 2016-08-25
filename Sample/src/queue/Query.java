package queue;

public class Query {
	public static void query(){
		Queue queue=new Queue();
		queue.enqueue(5);
		System.out.println(queue.size);
		queue.enqueue(7);
		System.out.println(queue.size);
		queue.dequeue();
		System.out.println(queue.size);
	}
}
