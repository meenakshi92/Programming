package stack;

public class Query {
	
	public static void query(){
		Stack<String> stack=new Stack<String>();
		stack.push("abc");
		stack.push("def");
		System.out.println(stack.size);
		Node n=stack.pop();
		System.out.println(n.item);
		System.out.println(stack.size);
		
		MinStack<Integer> minStack=new MinStack<Integer>();
		minStack.push(3);
		minStack.push(3);
		minStack.push(4);
		minStack.push(2);
		minStack.push(2);
		minStack.push(1);
		
		n=minStack.getMin();
		System.out.println(n.item);
		
		n=minStack.pop();
		System.out.println(n.item);
		
		n=minStack.getMin();
		System.out.println(n.item);
		
		n=minStack.pop();
		System.out.println(n.item);
		
		n=minStack.pop();
		System.out.println(n.item);
		
		n=minStack.getMin();
		System.out.println(n.item);
		
		
		
		
		
	}
}
