package linkedlist;
import java.util.HashSet;

class Node{
	int number;
	Node next;
	Node(int num){
		this.number=num;
	}
}

public class LinkedList {
	
	Node head;
	
	public void insert(int num){
		//first element
		if(head==null){
			head=new Node(num);
		}
		else{
			//traverse till the end of the linked list
			Node tail=head;
			while(tail.next!=null){
				tail=tail.next;
			}
			tail.next=new Node(num);
			
		}
	}
	
	public void display(){
		Node tail=head;
		System.out.print("List:");
		while(tail!=null){
			System.out.print(tail.number+",");
			tail=tail.next;
		}
		System.out.println();
	}
	
	public boolean search(int num){
		Node tail=head;
		if(tail==null)
			return false;
		while(tail!=null){
			if(tail.number==num)
				return true;
			tail=tail.next;
		}
		return false;
	}
	public void delete(int num){
		Node prev=null;
		Node curr=head;
		while(curr!=null){
			if(curr.number==num){
				if(prev!=null)
					prev.next=curr.next;
				else
					head=curr.next;
			}
			prev=curr;
			curr=curr.next;
		}
	}
	
	void reverse(Node curr){
		if(curr.next!=null)
			reverse(curr.next);
		while(curr.next!=null){
			int temp=curr.number;
			curr.number=curr.next.number;
			curr.next.number=temp;
			curr=curr.next;
		}
	}
	
	public void reverseLinkedList(){
		Node curr=head;
		if(curr!=null)//if list is not empty
			reverse(curr);
	}
	
	public void reverseLinearTime(){
		Node curr=null;
		Node prev=null;
		while(head!=null){
			curr=head;
			head=head.next;
			curr.next=prev;
			prev=curr;
		}
		head=curr;
		
	}
	
	//space complexity - linear
	public void removeDuplicates(){
		HashSet<Integer> duplicate=new HashSet<Integer>();
		Node curr=head;
		Node prev=null;
		while(curr!=null){
			if(curr!=head){
				if(duplicate.contains(curr.number)){
						prev.next=curr.next;
				}
				
				else{
					duplicate.add(curr.number);
					prev=prev.next;	
				}
			}
			else{
				duplicate.add(curr.number);
				prev=curr;
			}
			curr=curr.next;
			
		}
	}
	
	public void removeDuplicatesNoBuffer(){
		Node curr=head, runner, previous;
		while(curr!=null){
			runner=curr.next;
			previous=curr;
			while(runner!=null){
				if(runner.number==curr.number)
					previous.next=runner.next;
				else
					previous=previous.next;
				runner=runner.next;
				
			}
			curr=curr.next;
			
		}
	}
	
	public boolean isPalidrome(){
		Node curr=head;
		if(curr==null)
			return false;
		Node end=null,runner;
		int flag=0;
		do{
			runner=curr;
			while(runner.next!=end){
				runner=runner.next;
			}
			if(runner.number!=curr.number){
				flag=1;
				break;
			}
			end=runner;
			if(curr==end)
				break;
			curr=curr.next;
		}while(curr!=end);
		if(flag==0)
			return true;
		return false;
	}
	
	private int findLength(){
		Node curr=head;
		int length=0;
		while(curr!=null){
			length++;
			curr=curr.next;
		}
		return length;
	}
	
	public boolean isPalindromeLinear(){
		if(head==null)
			return false;
		//single element case
		if(head.next==null)
			return true;
		
		//find the length of the list
		int length=findLength();
		
		//reverse the first half of the list
		Node curr=head;
		Node prev=null;
		for(int i=0;i<length/2;i++){
			head=head.next;
			curr.next=prev;
			prev=curr;
			curr=head;
		}
		
		//compare each element in the two split lists
		if(length%2!=0)
			curr=curr.next;
		Node curr_reverse=prev;
		int flag=0;
		while(curr!=null){
			if(curr.number!=curr_reverse.number){
				flag=1;
				break;
			}
			curr=curr.next;
			curr_reverse=curr_reverse.next;
		}
		
		//reverse the first half of the list to obtain the original list
		curr=prev;
		prev=head;
		head=curr;
		while(head!=null){
			head=head.next;
			curr.next=prev;
			prev=curr;
			curr=head;
		}
		head=prev;
		if(flag==0)
			return true;
		
		return false;
	}
	
	public void clear(){
		head=null;
	}
	

}

