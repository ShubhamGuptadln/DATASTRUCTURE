package Trie;

public class Trie {
    private TrieNode root;
    public Trie()
    {
        root=new TrieNode();
        System.out.println("The trie has been created");
    }
    public void insert(String words)
    {
        TrieNode current=root;
        for(int i=0;i<words.length();i++)
        {
            char ch=words.charAt(i);
            TrieNode node=current.children.get(ch);
            if(node==null)
            {
                node=new TrieNode();
                current.children.put(ch,node);
            }
            current=node;
        }
        current.endOfString=true;
        System.out.println("Successfully the "+words + " has been inserted");
    }
    // The time complexity is O(m) where m is the length of the string words
    // The space complexity is also O(m)
    public boolean search(String words)
    {
        TrieNode current=root;
        for(int i=0;i<words.length();i++)
        {
            char ch=words.charAt(i);
            TrieNode node=current.children.get(ch);
            if(node==null)
            {
                System.out.println("The given word "+words+" does not exist in the trie");
                return false;
            }
            current=node;

        }
        if (current.endOfString)
        {
            System.out.println("The given word "+words+" exist in the trie");
            return true;
        }
        else {
            System.out.println("The given word "+words+" does not exist in the trie but it is a prefix of another String");
        }
        return false;

    }
    //Deleting String
    private boolean delete(TrieNode parentNode,String words,int index)
    {

        char ch=words.charAt(index);
        TrieNode current=parentNode.children.get(ch);
        boolean canThisbedeleted;
        if(current.children.size()>1)  // API,APPLE
        {
            delete(current,words,index+1);
            return false;
        }
        if(index==words.length()-1)  //API,APIS to delete API
        {
            if(current.children.size()>=1)
            {
                current.endOfString=false;
                return false;
            }
            else {
                parentNode.children.remove(ch);
                return true;

            }
        }
        if(current.endOfString) //API,KS to delete KS
        {
            delete(current,words,index+1);
            return false;
        }
        canThisbedeleted= delete(current,words,index+1);
        if(canThisbedeleted)
        {
            parentNode.children.remove(ch);
            return true;
        }
        else
            return false;

    }
    public void delete(String words)
    {
        if(search(words))
        {
            delete(root,words,0);
        }
        else {
            System.out.println("Words does not exist");
        }
    }

}
