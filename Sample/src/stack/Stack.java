package stack;

class Node<T>{
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
		if(top==null)
			top=new Node(item);
		else{
			Node temp=new Node(item);
			temp.next=top;
			top=temp;
		}		
		size++;
	}
	
	T pop(){
		T return_item;
		if(top!=null){
			return_item=(T) top.item;
			top=top.next;
			size--;
		}
		else
			return_item=null;
		
		return return_item;
	}
}