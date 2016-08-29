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
	}
}
