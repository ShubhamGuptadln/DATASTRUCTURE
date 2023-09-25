package Stack;

public class stackUsingLinkedList {
    public Node head;
     class Node{
        Node next;
        int data;

        public Node(int data) {
            this.data = data;
            this.next=null;
        }
    }

     public void push(int data)
     {
         Node node=new Node(data);
         if(head==null)
         {
             head=node;
         }
         else {
             node.next=head;
             head=node;

         }
     }
     public int pop()
     {
         if(isEmpty())
         {
             System.out.println("List is empty");
             return -1;
         }
         int val=head.data;
         head=head.next;
         return val;
     }
     public int peek()
     {
         if(isEmpty())
         {
             System.out.println("List is empty");
             return -1;
         }
         return head.data;
     }
     public boolean isEmpty()
     {
         return head == null;
     }
     public void delete()
     {
         head=null;
         System.out.println("The stack is deleted successfully");

     }
     public void traverse()
     {
         Node current = head;
         while(current!=null)
         {
             System.out.println(current.data);
             current=current.next;
         }
     }

    public static void main(String[] args) {
        stackUsingLinkedList stack=new stackUsingLinkedList();
        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println( stack.peek());
        System.out.println( stack.pop());
        System.out.println( stack.pop());
        System.out.println( stack.pop());
        System.out.println( stack.pop());


        //stack.traverse();


    }
}
