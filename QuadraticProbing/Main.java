package QuadraticProbing;

public class Main {
    public static void main(String[] args) {
        QuadraticProbing qb=new QuadraticProbing(13);
        qb.insert("The");
        qb.insert("quick");
        qb.insert("brown");
        qb.insert("fox");
        qb.insert("over");
        qb.insert("The");
        qb.insert("The");
        qb.display();
        System.out.println(qb.search("quick"));
        qb.delete("quick");
        qb.search("quick");
    }
}
