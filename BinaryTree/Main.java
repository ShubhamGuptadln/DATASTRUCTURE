package BinaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        binaryTreeLL bt=new binaryTreeLL();
        binaryNode N1=new binaryNode();
        N1.value="N1";
        binaryNode N2=new binaryNode();
        N2.value="N2";
        binaryNode N3=new binaryNode();
        N3.value="N3";
        binaryNode N4=new binaryNode();
        N4.value="N4";
        binaryNode N5=new binaryNode();
        N5.value="N5";
        binaryNode N6=new binaryNode();
        N6.value="N6";
        binaryNode N7=new binaryNode();
        N7.value="N7";
        binaryNode N8=new binaryNode();
        N8.value="N8";
        binaryNode N9=new binaryNode();
        N9.value="N9";
        N1.left=N2;
        N1.right=N3;
        N2.left=N4;
        N2.right=N5;
        N3.left=N6;
        N3.right=N7;
        N4.left=N8;
        N4.right=N9;
        bt.root=N1;
//       bt.preOrder(bt.root);
//        bt.inOrder(bt.root);
     //   bt.postOrderTraversal(bt.root);
       // bt.levelOrder();

       // System.out.println( bt.search("N0"));
       // bt.insert("N10");
     //   bt.levelOrder();
      //  System.out.println(bt.getDeepestNode().value);
       // bt.deleteDeepestNode();
        bt.levelOrder();
        bt.delete("N31");
        System.out.println();
        bt.levelOrder();



    }

}

