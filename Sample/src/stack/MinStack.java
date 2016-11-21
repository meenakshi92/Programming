//Stack that retrieves min element in constant time
package stack;

public class MinStack<T extends Comparable>{
	Node top;
	Stack<T> min;
	int size;
	MinStack(){
		min=new Stack<T>();
		size=0;
		
	}
	public void push(T item){
		Node temp=new Node(item);
		temp.next=top;
		top=temp;
		size++;
		
		if(min.top!=null){
			if(item.compareTo(min.top.item)<0)
				min.push(item);
		}
		else
			min.push(item);
				
		
	}
	public Node pop(){
		if(top==null)
			return null;
		else{
			if(top.item==min.top.item)
				min.pop();
			Node return_item=new Node(top.item);
			top=top.next;
			size--;
			return return_item;
		}
	}
	
	public Node getMin(){
		return new Node(min.top.item);
	}
}
