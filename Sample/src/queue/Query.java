package queue;

public class Query {
	public static void query(){
		Queue<Integer> queue=new Queue<Integer>();
		queue.enqueue(5);
		System.out.println(queue.size);
		queue.enqueue(7);
		System.out.println(queue.size);
		Node a=queue.dequeue();
		System.out.println(a.item);
		System.out.println(queue.size);
	}
}
