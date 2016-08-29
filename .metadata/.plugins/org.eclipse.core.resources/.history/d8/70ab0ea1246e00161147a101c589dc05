package queue;

class Node<T>{
	T item;
	Node next;
	Node(T item){
		this.item=item;
		
	}
}
public class Queue<T> {
	Node front,rear;
	public int size;
	Queue(){
		size=0;
	}
	public void enqueue(T item){
		if(front==null){
			front=new Node(item);
			rear=front;
		}
		else{
			Node temp=new Node(item);
			front.next=temp;
			front=temp;
		}
		size++;	
	}
	
	public Node dequeue(){
		if(front==null)
			return null;
		else{
			Node return_item=new Node(rear.item);
			rear=rear.next;
			size--;
			return return_item;
		
		}
		
	}
	
}
