package DirectChaining;

public class Main {
    public static void main(String[] args) {
        DirectChaining dc=new DirectChaining(10);
        dc.insertHashValue("ABCD");
        dc.insertHashValue("EFGH");
        dc.insertHashValue("IJKL");
        dc.insertHashValue("ABCD");
        dc.insertHashValue("EFGH");
        dc.insertHashValue("IJKL");
        dc.insertHashValue("Miller");
        dc.DisplayHashTable();
        dc.search("ABCD");
        dc.search("ab");
        dc.delete("ABCD");
        dc.DisplayHashTable();

    }
}
