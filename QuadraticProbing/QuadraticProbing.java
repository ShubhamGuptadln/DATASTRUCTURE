package QuadraticProbing;
import java.util.ArrayList;
public class QuadraticProbing {
    String[] hashtable;
    int usedCellNumber;
    public QuadraticProbing(int size)
    {
        hashtable=new String[size];
        usedCellNumber=0;
    }
    public int MODASCIIFunction(String words,int M)
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
        double load=(double) usedCellNumber*1/hashtable.length;
        return load;
    }
    public void rehashKeys(String words)
    {
        usedCellNumber=0;
        ArrayList<String>data=new ArrayList<>();
        for(String s:hashtable)
        {
            if(s!=null)
            {
                data.add(s);
            }


        }
        data.add(words);
        hashtable=new String[hashtable.length*2];
        for(String s:data)
        {
            insert(s);

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
            int index=MODASCIIFunction(words,hashtable.length);
            int counter=0;
            for(int i=index;i<index+hashtable.length;i++)
            {
                int newIndex= (index+(counter*counter))%hashtable.length;
                if(hashtable[newIndex]==null)
                {
                    hashtable[newIndex]=words;
                    System.out.println("The word "+words +" is inserted successfully at index "+newIndex);
                    break;
                }
                else {
                    System.out.println(newIndex+" is already occupied trying new Index");
                }
                counter++;
            }
        }
        usedCellNumber++;




    }
    public boolean search(String words)
    {
        int index=MODASCIIFunction(words,hashtable.length);
        int counter=0;
        for(int i=index;i<index+hashtable.length;i++)
        {
            int newIndex=(index+(counter*counter))%hashtable.length;
            if(hashtable[newIndex]!=null &&hashtable[newIndex].equals(words))
            {
                System.out.println("The given word "+words+" is present at index "+newIndex);
                return true;
            }
            else {
                counter++;
            }
        }
        return false;
    }
    public void display()
    {
        if(hashtable==null)
        {
            System.out.println("The hashTable is empty");
        }
        else {
            System.out.println("----- Hash Table -----");
            for(int i=0;i<hashtable.length;i++)
            {
                System.out.println("Index "+i+" Key is "+hashtable[i]);
            }
        }
    }
    public void delete(String words)
    {
        int counter=0;
        int index=MODASCIIFunction(words,hashtable.length);
        for(int i=index;i<index+hashtable.length;i++)
        {
            int newIndex=(index+(counter*counter))%hashtable.length;
            if(hashtable[newIndex]!=null && hashtable[newIndex].equals(words))
            {
                hashtable[newIndex]=null;
                System.out.println("The given word "+words+" is deleted successfully");
                break;
            }
            else {
                counter++;
            }
        }
        System.out.println("The given word not exist");
    }
}
