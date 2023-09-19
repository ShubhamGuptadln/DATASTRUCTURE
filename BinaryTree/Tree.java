package BinaryTree;
import java.util.ArrayList;

public class Tree {
    ArrayList<Tree> tree;
    String data;
    public Tree(String data) {
        this.tree = new ArrayList<>();
        this.data=data;
    }
    public void addChild(Tree node)
    {
        this.tree.add(node);
    }
    public String print(int level)
    {
        String st="  ".repeat(level)+data+"\n";
        for(Tree node:tree){
            st+=node.print(level+1);

        }
        return st;

    }

    public static void main(String[] args) {
        Tree drinks=new Tree("drinks");
        Tree hot=new Tree("hot");
        Tree cold=new Tree("cold");
        Tree tea=new Tree("tea");
        Tree coffee=new Tree("coffee");
        Tree alc=new Tree("alcoholic");
        Tree nalc=new Tree("non alcoholic");
        drinks.addChild(cold);
        drinks.addChild(hot);
        hot.addChild(tea);
        hot.addChild(coffee);
        cold.addChild(alc);
        cold.addChild(nalc);
        System.out.println(drinks.print(0));


    }
}
