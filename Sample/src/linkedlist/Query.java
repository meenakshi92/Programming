package linkedlist;

public class Query {

	public void query(){
		//creating a linked list 
				LinkedList linkedList=new LinkedList();
				
				//insert first element
				linkedList.insert(10);
				
				linkedList.display();
				
				//insert a few more elements
				for( int i=1;i<5;i++)
					linkedList.insert(10+i);
				
				linkedList.display();
				
				//search for an element
				if(linkedList.search(22))
					System.out.println("22 is present in the list");
				else
					System.out.println("22 is not present in the list");
				
				//delete an element
				linkedList.delete(12);
				linkedList.display();
				
				//reversing the linked list through recursion
				linkedList.reverseLinkedList();
				linkedList.display();
				
				//linear time reversal
				linkedList.reverseLinearTime();
				System.out.print("Running");
				linkedList.display();
				
				//remove duplicates from the list
				linkedList.insert(13);
				linkedList.insert(11);
				linkedList.insert(18);
				linkedList.insert(13);
				linkedList.insert(18);
				linkedList.display();
				
				linkedList.removeDuplicatesNoBuffer();
				linkedList.display();
				
				linkedList.insert(14);
				linkedList.insert(13);
				linkedList.insert(11);
				linkedList.insert(10);
				linkedList.display();
				if(linkedList.isPalindromeLinear())
					System.out.println("Palindrome");
				else
					System.out.println("Not a palindrome");
				
				linkedList.clear();
				linkedList.insert(1);
				linkedList.insert(2);
				linkedList.insert(2);
				linkedList.insert(1);
				
				if(linkedList.isPalindromeLinear())
					System.out.println("Palindrome");
				else
					System.out.println("Not a palindrome");
	}

}
