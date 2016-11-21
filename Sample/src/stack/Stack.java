package stack;

class Node<T extends Comparable>{
	T item;
	Node next;
	Node(T item){
		this.item=item;
		
	}
	
}
public class Stack<T> {
	Node top;
	public int size;
	Stack(){
		size=0;
	}
	public void push(T item){
		Node temp=new Node((Comparable) item);
		temp.next=top;
		top=temp;	
		size++;
	}
	
	public Node pop(){
		if(top!=null){
			Node return_item=new Node(top.item);
			top=top.next;
			size--;
			return return_item;
		}
		else
			return null;
		
	}
}
