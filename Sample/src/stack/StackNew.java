package stack;

class StackNode{
	int val;
	StackNode next;
	StackNode(int val){
		this.val=val;
		this.next=null;
	}
}
public class StackNew {
	StackNode top;
	int size;
	
	StackNew(){
		top=null;
		size=0;
	}
	public StackNode pop(){
		if(top==null)
			return null;
		else{
			StackNode temp=top;
			top=top.next;
			size--;
			return temp;
		}
	}
	
	public void push(int value){
		
			StackNode temp=new StackNode(value);
			temp.next=top;
			top=temp;
		
			size++;
	}
}
