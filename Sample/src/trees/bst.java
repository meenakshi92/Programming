package trees;

class Node{
	int val;
	Node left;
	Node right;
	Node parent;
	Node(int val){
		this.val=val;
		this.left=null;
		this.right=null;
		this.parent=null;
	}
}
public class bst {
	Node root;
	bst(){
		root=null;
	}
	
	public void insert(int val){
		if(root==null)
			root=new Node(val);
		else{
			Node temp=root;
			while(temp!=null){
				if(temp.val<=val){
					if(temp.right==null){
						temp.right=new Node(val);
						temp.right.parent=temp;
						break;
					}
					temp=temp.right;
				}
				else{
					if(temp.left==null){
						temp.left=new Node(val);
						temp.left.parent=temp;
						break;
					}
					temp=temp.left;
				}
				
			}
		}
	}
	
	private void swap(Node a, Node b){
		a.val+=b.val;
		b.val=a.val - b.val;
		a.val-=b.val;
	}
	
	public void delete(int val){
		Node temp=root;
		while(temp!=null){
			if(temp.val==val)
				break;
			else if(temp.val<val)
				temp=temp.right;
			else
				temp=temp.left;
		}
		if(temp!=null){
			//element found,switch it with an end element
			Node runner=temp;
			Node prev=null;
			while(runner!=null){
				prev=runner;
				if(runner.left!=null)
					runner=runner.left;
				else
					runner=runner.right;
			}
			//swap the integers
			swap(prev,temp);
			
			//delete prev
			Node parent=prev.parent;
			if(parent.left!=null && parent.left.val==prev.val)
				parent.left=null;
			else
				parent.right=null;
			
			//put temp in right place
			while(temp!=null){
				if(temp.left!=null && temp.left.val>temp.val){
					swap(temp, temp.left);
					temp=temp.left;
				}
				else if(temp.right!=null && temp.right.val<temp.val){
					swap(temp, temp.right);
					temp=temp.right;
				}
				else 
					break;
			}
			
		}
	}
	
	public void inorder(Node curr){
		if(curr==null)
			return;
		inorder(curr.left);
		System.out.println(curr.val);
		inorder(curr.right);
	}
	
	public void preorder(Node curr){
		if(curr==null)
			return;
		System.out.println(curr.val);
		preorder(curr.left);
		preorder(curr.right);
	}
	
	public void postorder(Node curr){
		if(curr==null)
			return;
		postorder(curr.left);
		postorder(curr.right);
		System.out.println(curr.val);
	}
}
