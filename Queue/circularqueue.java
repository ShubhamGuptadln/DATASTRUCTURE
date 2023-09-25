package Queue;

public class circularqueue {
    int [] arr;
    int size;
    int topofQueue;
    int begiiningOfQueue;
    public circularqueue(int size)
    {
        this.size=size;
        this.arr=new int[size];
        this.topofQueue=-1;
        this.begiiningOfQueue=-1;
    }
    public boolean isEmpty()
    {
        if(begiiningOfQueue==-1)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public boolean isFull()
    {
        if(topofQueue+1==begiiningOfQueue)
        {
            return true;
        }
        else if(begiiningOfQueue==0 && topofQueue+1==size)
        {
            return true;
        }
        else return false;
    }
public void enqueue(int value)
{
    if(isFull())
    {
        System.out.println("The stack is full can not insert");
    }
   else if(isEmpty())
    {
        begiiningOfQueue=0;
        topofQueue++;
        arr[topofQueue]=value;
    } else if (topofQueue+1==size) {
       topofQueue=0;

    }
   else {
       topofQueue++;
    }
   arr[topofQueue]=value;
    System.out.println("Successfully inserted");
}
public int dequeue()
{
    if(isEmpty())
    {
        return -1;
    }
    else{
        int a=arr[begiiningOfQueue];
        arr[begiiningOfQueue]=Integer.MIN_VALUE;
        if(begiiningOfQueue==topofQueue)
        {
            begiiningOfQueue=topofQueue=-1;
        }
      else  if(begiiningOfQueue+1==size)
        {
            begiiningOfQueue=0;
        }
      else
        begiiningOfQueue++;
        return a;
    }


}
public int peek()
{
    if(isEmpty())
    {
        return -1;
    }
    else {
        return arr[begiiningOfQueue];
    }
}
public void delete()
{
    arr=null;
    System.out.println("Deleted succcessfully");
}
    public static void main(String[] args) {
        circularqueue cq=new circularqueue(5);
        System.out.println(cq.isEmpty());
        System.out.println(cq.isFull());
        cq.enqueue(5);
        cq.enqueue(6);
//        System.out.println(cq.dequeue());
//        System.out.println(cq.dequeue());
//        System.out.println(cq.dequeue());
        System.out.println(cq.peek());
       // cq.delete();
       // cq.enqueue(7);
        System.out.println(cq.dequeue());
        System.out.println(cq.dequeue());
        System.out.println(cq.dequeue());
        System.out.println(cq.peek());

    }
}
