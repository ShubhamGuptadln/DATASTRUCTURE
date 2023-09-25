package LinearProbingHashing;
import java.util.LinkedList;
import java.util.ArrayList;

public class LinearProbing {
    String [] hashTable;
    int usedCellNumber;
    public LinearProbing(int size)
    {
        this.hashTable=new String[size];
        usedCellNumber=0;
    }
    public int MODASCIIHashFunction(String words,int M)
    {
        char ch[]=words.toCharArray();
        int sum=0;
        for(int i=0;i<words.length();i++)
        {
            sum+=ch[i];
        }
        return sum%M;
    }
    public double loadFactor()
    {
        double load= (double)usedCellNumber /hashTable.length;
        return load;

    }
    //Rehashing
    public void rehashKeys(String words)
    {
        usedCellNumber=0;
        ArrayList<String>data=new ArrayList<>();
        for(String s:hashTable)
        {
            if(s!=null)
            {
                data.add(s);
            }
            else {
                data.add(words);
            }

        }
        hashTable=new String[hashTable.length*2];
        for(String s:data)
        {
            //insert
            insert(words);
        }
    }
    public void insert(String words)
    {
        double load=loadFactor();
        if(load>=0.75)
        {
            rehashKeys(words);
        }
        else {
            int index=MODASCIIHashFunction(words,hashTable.length);
            for(int i=index;i<index+hashTable.length;i++)
            {
                int newIndex=i%hashTable.length;
                if(hashTable[newIndex]==null)
                {
                    hashTable[newIndex]=words;
                    System.out.println("The "+words+" successfully inserted at index "+newIndex);
                    break;
                }
                else {
                    System.out.println("Trying next empty cell");
                }

            }

        }
        usedCellNumber++;
    }
    public void display()
        {
            if(hashTable==null)
            {
                System.out.println("The hashTable is empty");
            }
            else {
                System.out.println("----- Hash Table -----");
                for(int i=0;i<hashTable.length;i++)
                {
                    System.out.println("Index "+i+" Key is "+hashTable[i]);
                }
            }
        }
    public boolean search(String words)
    {
        int index=MODASCIIHashFunction(words,hashTable.length);
        for(int i=index;i<index+hashTable.length;i++)
        {
            int newIndex=i%hashTable.length;
            if(hashTable[newIndex]!=null&&hashTable[newIndex].equals(words))
            {
                System.out.println("The given word "+words+" is present at index "+newIndex);
                return true;
            }
        }
        System.out.println("The word "+ words +" is not found in the table");
        return false;
    }
    public void delete(String words)
    {
        int index=MODASCIIHashFunction(words,hashTable.length);
        for(int i=index;i<index+hashTable.length;i++)
        {
            int newIndex = i % hashTable.length;
            if (hashTable[newIndex] != null && hashTable[newIndex].equals(words)) {
                hashTable[newIndex] = null;
                System.out.println("The given word " + words + " is deleted successfully ");
                return;

            }
        }
        System.out.println("Given word not found");


    }

}
