package Searching;

public class BinarySearch {
    public static boolean binarySearch(int []a,int b,int l,int k)
    {

        if(b<=l)
        {
            int mid=b+(l-b)/2;
            if(a[mid]==k)
            {
                return true;
            }
            else if(a[mid]>k)
            {
               return binarySearch(a,b,mid,k);
            }
            else {
                return binarySearch(a,mid+1,l,k);

            }
        }
        return false;
    }
    public static void main(String[] args) {
        int []a={1,2,3,4,5,6};
        int k=6;
        System.out.println(binarySearch(a,0,a.length-1,k));
    }
}
