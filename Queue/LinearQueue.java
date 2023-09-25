package Queue;

public class LinearQueue {
    int []arr;
    int topOfQueue;
    int beginningOfQueue;
    public LinearQueue(int size)
    {
        this.arr=new int [size];
        this.topOfQueue=-1;
        this.beginningOfQueue=-1;

    }
    public boolean isFull()
    {
        if(topOfQueue== arr.length-1)
        {
            return true;
        }
        else {
            return false;
        }
    }
    public boolean isEmpty()
    {
        if(beginningOfQueue==-1||beginningOfQueue== arr.length)
        {
            return true;
        }
        else {
            return false;
        }
    }
    public void enquque(int data)
    {
        if(isFull())
        {
            System.out.println("Queue is full cannot insert");
        }
        else if(isEmpty())
        {
            beginningOfQueue=0;
            topOfQueue++;
            arr[topOfQueue]=data;
            System.out.println("Value inserted successfully");
        }
        else {
            topOfQueue++;
            arr[topOfQueue]=data;
            System.out.println("Value inserted successfully");
        }
    }
    public int dequeue()
    {
        int a=0;
        if(isEmpty())
        {
            System.out.println("Queue is empty");
            return -1;
        }
        else {

             a= arr[beginningOfQueue];
            beginningOfQueue++;
            if(beginningOfQueue>topOfQueue)
            {
                beginningOfQueue=topOfQueue=-1;
            }
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
            return arr[beginningOfQueue];
        }
    }
    public void delete()
    {
        arr=null;
        System.out.println("The queue is deleted entirely");
    }

    public static void main(String[] args) {
        LinearQueue q=new LinearQueue(5);
        System.out.println(q.isEmpty());
        System.out.println(q.isFull());
        q.enquque(5);
        q.enquque(4);
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println(q.isEmpty());
        q.delete();

        System.out.println(q.peek());

    }
}
