package BST;

public class Main {
    public static void main(String[] args) {
        BinarySearchTree bst=new BinarySearchTree();

        bst.insert(70);
        bst.insert(50);
        bst.insert(90);
        bst.insert(30);
        bst.insert(60);
        bst.insert(80);
        bst.insert(100);
        bst.insert(20);
        bst.insert(40);

       // bst.preOrder(bst.root);
       // bst.inOrder(bst.root);
       // bst.postOrder(bst.root);
       // bst.levelOrder();
   //  bst.search(bst.root,701);
       // System.out.println(bst.getMinimum(bst.root.right).value);
        bst.deletenode(bst.root, 70);
        bst.levelOrder();
        System.out.println();
        System.out.println(bst.getHeight(bst.root));

    }
}
