package Queue;

public class LinkedListQueue {
    class Node{
        Node next;
        int data;
        public Node(int data)
        {
            this.data=data;
            this.next=null;
        }
    }
    Node front=null,rear=null;
    public boolean isEmpty()
    {
        if(front==null)
        {
            return true;
        }
        else {
            return false;
        }
    }
    public void enqueue(int data)
    {
        Node node=new Node(data);
        if(isEmpty())
        {
            front=rear=node;
            rear.next=null;
            System.out.println("Element inserted successfully");

        }
        else {
            rear.next=node;
            node.next=null;
            rear=node;
            System.out.println("Element inserted successfully");
        }

    }
    public void traverse()
    {
        Node current=front;
        while(current!=null)
        {
            System.out.println(current.data);
            current=current.next;
        }
    }
    public int dequeue()
    {
        if(isEmpty())
        {
            return -1;
        }
        else {
            int a=front.data;
            front=front.next;
            if(front==null)
            {
                rear=null;
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
            return front.data;
        }
    }
    public void delete()
    {
        front=null;
        rear=null;
        System.out.println("Queue is deleted successfully");
    }

    public static void main(String[] args) {
        LinkedListQueue lq=new LinkedListQueue();
        System.out.println(lq.isEmpty());
        lq.enqueue(1);
        lq.enqueue(2);
        lq.enqueue(3);
       // lq.traverse();
        System.out.println(lq.isEmpty());
//        System.out.println(lq.dequeue());
//        System.out.println(lq.dequeue());
//        System.out.println(lq.dequeue());
//        System.out.println(lq.dequeue());
        System.out.println(lq.peek());
        lq.delete();
        System.out.println(lq.peek());


    }
}
