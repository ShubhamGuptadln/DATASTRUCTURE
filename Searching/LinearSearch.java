package Searching;

public class LinearSearch {
    public static boolean linearSearch(int []a,int k)
    {
        for(int i=0;i<a.length;i++)
        {
            if(a[i]==k)
            {
                return true;
            }

        }
        return false;
    }

    public static void main(String[] args) {
        int []a={1,2,3,4,5,6};
        int k=9;
        System.out.println(linearSearch(a,k));
    }
}
