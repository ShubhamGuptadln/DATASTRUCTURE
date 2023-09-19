package BinaryTree;
//import java.util.ArrayList;
import java.util.Queue;
import java.util.LinkedList;

public class binaryTreeLL {
    binaryNode root;

    public binaryTreeLL() {
        this.root = null;
    }
    public void preOrder(binaryNode node)
    {
        if(node==null)
        {
            return;
        }
        else {
            System.out.println(node.value+" ");
            preOrder(node.left);
            preOrder(node.right);
        }
    }
    public void inOrder(binaryNode node)
    {
        if(node==null)
        {
            return;
        }
        else {

            inOrder(node.left);
            System.out.print(node.value+" ");
            inOrder(node.right);
        }
    }
    public void postOrderTraversal(binaryNode root)
    {
        if(root==null)
        {
            return ;
        }
        else {
            postOrderTraversal(root.left);
            postOrderTraversal(root.right);
            System.out.print(root.value+" ");
        }
    }
    public void levelOrder()
    {
        Queue<binaryNode>q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty())
        {
            binaryNode pres=q.remove();
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
    public boolean search(String data)
    {
        Queue<binaryNode>q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty())
        {
            binaryNode pres =q.remove();
            if(pres.value.equals(data))
            {
                return true;

            }
            if(pres.left!=null)
            {
                q.add(pres.left);
            }
            if(pres.right!=null)
            {
                q.add(pres.right);
            }

        }
        return false;
    }
    void insert(String val)
    {
        binaryNode newNode=new binaryNode();
        newNode.value=val;
        if(root==null)
        {
            root=newNode;
            System.out.println("Inserted successfully");
        }
        Queue<binaryNode>q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty())
        {
            binaryNode pres=q.remove();
            if(pres.left==null)
            {
                pres.left=newNode;
                System.out.println("Inserted successfully");
                break;
            } else if (pres.right==null) {
                pres.right=newNode;
                System.out.println("Inserted Successfully");
                break;

            }
            else {
                q.add(pres.left);
                q.add(pres.right);
            }
        }

    }
    public binaryNode getDeepestNode()
    {
        Queue<binaryNode>q=new LinkedList<>();
        q.add(root);
        binaryNode pres=null;
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
        Queue<binaryNode>q=new LinkedList<>();
        binaryNode prev,pres=null;
        q.add(root);
        while(!q.isEmpty())
        {
            prev=pres;
            pres=q.remove();
            if(pres.left==null)
            {
                prev.right=null;
                return;
            }
            else if(pres.right==null)
            {
                prev.left=null;
                return;
            }
            else {
                q.add(pres.left);
                q.add(pres.right);
            }


        }
    }
    public void delete(String val)
    {
        Queue<binaryNode>q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()) {
            binaryNode pres = q.remove();
            if (pres.value.equals(val)) {
                pres.value = getDeepestNode().value;
                deleteDeepestNode();
                return;

            } else {
                if (pres.left != null) {
                    q.add(pres.left);
                }
                if (pres.right != null) {
                    q.add(pres.right);
                }

            }
        }
        System.out.println("The node value does not exist");

    }

}
