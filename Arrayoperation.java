package Array;
import java.util.Scanner;
import java.util.Arrays;

public class Arrayoperation {
	static int [] arr=new int[10];
	
	public static void main (String args[])
	{
		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter the array size");
//		int size=sc.nextInt();
		
		boolean s=true;
		String c= """
                press T for Traversal
                press I for insertion
                press D for deletion
                press S for search
                press U for update
                press M for menu
                press Q for quit
                
                """;
		while(s)
		{
			System.out.print(c);
			String ch=sc.next().toUpperCase();
//			if ( ch=="T")
//			{
//				System.out.print(Arrays.toString(arr));
//					
//				
//			}
			 switch(ch)
	            {
	                case("T"): traversal(arr);
	                break;
	                case("I"):
	                	System.out.println("Enter the position");
	                	int pos=sc.nextInt();
	                	System.out.println("Enter the element");
	                	int ele=sc.nextInt();
	                	insertion(arr,ele,pos);
	                	break;
	                case("U"):
	                	System.out.println("Enter the position");
	                	int posu=sc.nextInt();
	                	System.out.println("Enter the element");
	                	int elem=sc.nextInt();
	                	update(arr,posu,elem);
	                	break;
	                case("S"):
	                	System.out.println("Enter the eleemnt to search");
	                	int se=sc.nextInt();
	                	search(arr,se);
	                case("D"):
	                	System.out.println("Enter the element to be deleted");
                		int eled=sc.nextInt();
                		deletion(arr,eled);
                		break;
	                case("M"):
	                	System.out.println(c);
	                	break;
	                case("Q"):
	                	s=false;
	                	break;
                	
	                	
	                	
	            }
		}
		
	}
	static void insertion(int []arr,int ele,int pos)
	{
		int [] a=new int[arr.length+1];
		int j=0;
		for(int i=0;i<a.length;i++)
		{
			if(i==pos)
			{
				a[i]=ele;
				
			}
			else
			{
				a[i]=arr[j];
				j++;
			}
		}
		System.out.println("Inserted Successfully");
		System.out.println("After Insertion the Array is");
		traversal(a);
		
	}
	static void deletion(int [] arr,int ele)
	{
		int flag=0,loc=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==ele)
			{
				flag=1;
				loc=i;
			}
		}
		if(flag==1)
		{
			for(int i=loc+1;i<arr.length;i++)
			{
				arr[i-1]=arr[i];
			}
			
		}
		else
		{
			System.out.println("Element not exist");
		}
		
		
	}
	static void traversal(int [] arr)
	{
		System.out.println(Arrays.toString(arr));
	}
	static void update(int []arr,int pos,int ele)
	{
		arr[pos]=ele;
		System.out.println("Element updated successfully");
	}
	static void search(int []arr,int ele)
	{
		int flag=0,pos=-1;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==ele)
			{
				flag=1;
				pos=i;
				break;
			}
		}
		if(flag==1)
		{
			System.out.println("Element found and it is at index "+pos);
		}
	}
	
	

}
