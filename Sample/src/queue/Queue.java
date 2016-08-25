package queue;

class Node<T>{
	T item;
	Node next,previous;
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
			temp.next=front;
			front.previous=temp;
			front=temp;
		}
		size++;	
	}
	
	public T dequeue(){
		T return_item;
		if(front==null)
			return null;
		else{
			return_item=(T) rear.item;
			rear=rear.previous;
			rear.next=null;
			size--;
			return return_item;
		
		}
		
	}
	
}
