package LinearProbingHashing;

public class Main {
    public static void main(String[] args) {
        LinearProbing lp=new LinearProbing(13);
        lp.insert("The");
        lp.insert("quick");
        lp.insert("brown");
        lp.insert("fox");
        lp.insert("over");
        lp.insert("The");
        lp.display();
        lp.search("The");
        lp.delete("quick");
        lp.search("quick");
        lp.display();
    }
}
