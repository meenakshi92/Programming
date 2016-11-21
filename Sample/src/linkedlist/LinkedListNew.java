package linkedlist;

class NodeNew<T>{
	T value;
	NodeNew<T> next;
	
	NodeNew(){}
	NodeNew(T value){
		this.value=value;
	}
}

//asssuming an infinite list
public class LinkedListNew<T> {
	NodeNew<T> head;
	
	LinkedListNew(){
		head=null;
	}
	
	public void insert(T value){
		if(head==null)
			head=new NodeNew<T>(value);
		else{
			NodeNew<T> temp=head;
			while(temp!=null){
				temp=temp.next;	
			}
			temp=new NodeNew<T>(value);	
		}
		
	}
	
	public boolean delete(T value){
		NodeNew<T> prev=null;
		NodeNew<T> curr=head;
		while(curr!=null){
			if(curr.value==value){
				if(prev==null)
					head=curr.next;
				else
					prev.next=curr.next;
				return true;
				
			}	
			prev=curr;
			curr=curr.next;
			
		}
		return false;
	}
	
}
