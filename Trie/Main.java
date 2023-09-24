package Trie;

public class Main {
    public static void main(String[] args) {
        Trie t=new Trie();
        t.insert("API");
        t.insert("APIS");
//        t.search("API");
//        t.search("AP");
//        t.search("ljf");
        t.delete("API");
        t.search("API");
        //t.delete("ck");


    }
}
