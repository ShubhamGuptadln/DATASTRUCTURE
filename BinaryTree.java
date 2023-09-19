package BinaryTreeUsingLinkedList;
import java.util.LinkedList;
import java.util.Queue;


public class BinaryTree {
	BinaryNode root;
	public BinaryTree()
	{
		this.root=null;
	}
	public void preOrder(BinaryNode root)
	{
		if(root==null)
		{
			return;
		}
		else
		{
			System.out.println(root.value);
			preOrder(root.left);
			preOrder(root.right);
			
		}
		
	}
	public void postOrder(BinaryNode root)
	{
		if(root==null)
		{
			return;
		}
		else
		{
			
			postOrder(root.left);
			postOrder(root.right);
			System.out.println(root.value);
			
		}
		
	}
	public void inOrder(BinaryNode root)
	{
		if(root==null)
		{
			return;
		}
		else
		{
			
			inOrder(root.left);
			System.out.println(root.value);
			inOrder(root.right);
			
			
		}
		
	}
	public void levelOrder()
	{
		Queue<BinaryNode>q=new LinkedList<>();
		if(root==null)
		{
			System.out.println("Empty Tree");
			return;
		}
		q.add(root);
		while(!q.isEmpty())
		{
			BinaryNode pres=q.remove();
			System.out.println(pres.value+" ");
			if(pres.left!=null)
			{
				q.add(pres.left);
			}
			if(pres.right!=null)
			{
				q.add(pres.right);
			}
		}
		
	}
	public boolean Search(String value)
	{
		Queue<BinaryNode>s=new LinkedList<>();
		s.add(root);
		while(!s.isEmpty())
		{
			BinaryNode pres=s.remove();
			if(pres.value==value)
			{
				return true;
				
			}
			else
			{
				if(pres.left!=null)
				{
					s.add(pres.left);
				}
				if(pres.right!=null)
				{
					s.add(pres.right);
				}
			}
		}
		return false;
	}
	public void insert(String val)
	{
		BinaryNode newNode=new BinaryNode();
		newNode.value=val;
		if(root==null)
		{
			root=newNode;
			return;
		}
		Queue<BinaryNode>q=new LinkedList<>();
		q.add(root);
		while(!q.isEmpty())
		{
			BinaryNode pres=q.remove();
			if(pres.left==null)
			{
				pres.left=newNode;
				return;
			}
			else if(pres.right==null)
			{
				pres.right=newNode;
				return;
			}
			else
			{
				q.add(pres.left);
				q.add(pres.right);
			}
		}
		
	}
	public BinaryNode getDeepestNode()
	{
		Queue<BinaryNode>q=new LinkedList<>();
		q.add(root);
		BinaryNode pres=null;
		while(!q.isEmpty())
		{
			 pres=q.remove();
			if(pres.left!=null)
			{
				q.add(pres.left);
			}
			if(pres.right!=null)
			{
				q.add(pres.right);
			}
		}
		return pres;
	}
	public void deleteDeepestNode()
	{
		Queue<BinaryNode>q=new LinkedList<>();
		q.add(root);
		BinaryNode prev, pres=null;
		while(!q.isEmpty())
		{
			prev=pres;
			 pres=q.remove();
			if(pres.left==null)
			{
				prev.right=null;    //if present left is null means prev right was the last node
			}
			else if(pres.right==null)
			{
				prev.left=null;
			}
			else
			{
				q.add(pres.left);
				q.add(pres.right);
			}
		}
	}
	public void delete(String val)
	{
		Queue<BinaryNode>q=new LinkedList<>();
		q.add(root);
		BinaryNode pres=null;
		while(!q.isEmpty())
		{
			 pres=q.remove();
			 if(pres.value==val)
			 {
				 pres.value=getDeepestNode().value;
				 deleteDeepestNode();
				 System.out.println("Deleted Successfully");
				 return;
				 
				 
			 }
			 else
			 {
			if(pres.left!=null)
			{
				q.add(pres.left);
			}
			if(pres.right!=null)
			{
				q.add(pres.right);
			}
		}
			 
		}
		System.out.println("Value not found");
	}
	public void deleteEntire()
	{
		root=null;
		System.out.println("Deleted Entirely");
	}
	
	

}
