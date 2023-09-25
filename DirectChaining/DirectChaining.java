package DirectChaining;
import java.util.LinkedList;

public class DirectChaining {
    LinkedList<String>[]hashTable;
    int maxChainSize=5;
    public DirectChaining(int size)
    {
        this.hashTable=new LinkedList[size];
    }
    public int MODASCIIHashFunction(String words,int M)
    {
        char ch[]=words.toCharArray();
        int sum=0;
        for(int i=0;i<words.length();i++)
        {
            sum=sum+ch[i];
        }
        return sum%M;
    }
    public void insertHashValue(String words)
    {
        int newIndex=MODASCIIHashFunction(words,words.length());
        if(hashTable[newIndex]==null)
        {
            hashTable[newIndex]=new LinkedList<String>();
            hashTable[newIndex].add(words);
        }
        else {
            hashTable[newIndex].add(words);
        }
    }
    public void DisplayHashTable()
    {
        if(hashTable==null)
        {
            System.out.println("No value exist");
        }

        else {
            System.out.println("------ Hash TAble ------");
            for(int i=0;i<hashTable.length;i++)
            {
                System.out.println("Index "+i+" key is "+hashTable[i]);
            }
        }

    }
    public boolean search(String words)
    {
        int newIndex=MODASCIIHashFunction(words,words.length());
        if(hashTable[newIndex]!=null && hashTable[newIndex].contains(words))
        {
            System.out.println("Given word "+words+" is present in the hashTable at index "+newIndex);
            return true;
        }
        else
        {
            System.out.println("Given word "+ words+ "is not present in the hashTable ");
            return false;
        }
    }
    public void delete(String words)
    {
        int newIndex=MODASCIIHashFunction(words,words.length());
        boolean present=search(words);
        if(present)
        {
            hashTable[newIndex].remove(words);
            System.out.println("The word "+words+" has been deleted successfully");
        }
        else {
            System.out.println("The word not exist");
        }
    }
}
