package BST;


import java.util.LinkedList;
import java.util.Queue;

public class BinarySearchTree {
    BinaryNode root;
    public BinarySearchTree()
    {
        root=null;
    }
    private BinaryNode insert(BinaryNode currentNode,int val)
    {

        if(currentNode==null)
        {

            BinaryNode newNode=new BinaryNode();
            newNode.value=val;
           // System.out.println("Inserted successfully");
            return newNode;
        } else if (val<=currentNode.value) {
           currentNode.left= insert(currentNode.left,val);
            return currentNode;

        }
        else
        {
            currentNode.right=insert(currentNode.right,val);
            return currentNode;
        }


    }
    void insert(int val)
    {
      root=  insert(root,val);
    }
    public void preOrder(BinaryNode node)
    {
        if(node==null)
        {
            return;
        }

            System.out.print(node.value+" ");
            preOrder(node.left);
            preOrder(node.right);

    }
    public void inOrder(BinaryNode node)
    {
        if(node==null)
        {
            return;
        }


        inOrder(node.left);
        System.out.print(node.value+" ");
        inOrder(node.right);

    }
    public void postOrder(BinaryNode node)
    {
        if(node==null)
        {
            return;
        }


        postOrder(node.left);

        postOrder(node.right);
        System.out.print(node.value+" ");

    }
    public void levelOrder()
    {
        Queue<BinaryNode>q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty())
        {
            BinaryNode pres=q.remove();
            System.out.print(pres.value+" ");
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
//    public boolean search(int val)
//    {
//        Queue<BinaryNode>q=new LinkedList<>();
//        q.add(root);
//        while(!q.isEmpty())
//        {
//            BinaryNode pres=q.remove();
//            if(pres.value==val)                                 // This will take O(n) time complexity
//            {
//                return true;
//            }
//            else {
//                if (pres.left != null) {
//                    q.add(pres.left);
//                }
//                if (pres.right != null) {
//                    q.add(pres.right);
//                }
//            }
//        }
//        return false;
//    }

    public BinaryNode search(BinaryNode node,int val)
    {
        if(node==null)
        {
            System.out.println("Not found");
            return null;
        } else if (node.value==val) {
            System.out.println("found");
            return null;


        } else if (val<node.value) {

            return search(node.left,val);

        }
        else {
            return search(node.right,val);
        }
    }
    public BinaryNode getMinimum(BinaryNode node)
    {
       if(node.left==null)
       {
           return node;
       }
       else {
           return getMinimum(node.left);
        }
    }
    public BinaryNode deletenode(BinaryNode node,int val)
    {
        if(node==null)
        {
            System.out.println("Value not found");
            return null;
        }
        else if(val< node.value)
        {
            node.left=deletenode(node.left,val);
        }
        else if(val> node.value)
        {
            node.right=deletenode(node.right,val);
        }
        else {
            if(node.right!=null&&node.left!=null)
            {
                BinaryNode temp=node;
                node.value=getMinimum(node.right).value;
                deletenode(node.right,temp.value);
            }
            else if(node.right!=null)
            {
                node=node.right;
            }
            else if(node.left!=null)
            {
                node=node.left;
            }
            else {
                node=null;
            }

        }
        return node;
    }
    public int getHeight(BinaryNode node)
    {
        if (node==null)
        {
            return 0;
        }
        else {
            return node.height;
        }
    }


}
