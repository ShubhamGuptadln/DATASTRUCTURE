package Stack;

public class StackUsingArray {
int [] arr;
int topOfStack;

    public StackUsingArray(int size) {
        this.arr = new int[size];
        this.topOfStack = -1;
    }
    public boolean isEmpty()
    {
        return topOfStack == -1;
    }
    public boolean isFull()
    {
        return topOfStack == arr.length - 1;
    }
    public void push(int value)
    {
        if(isFull())
        {
            System.out.println("The stack is full can not insert");
        }
        else {
            arr[topOfStack + 1] = value;
            topOfStack++;
            System.out.println("The element is successfully inserted");
        }
    }
    public int pop()
    {
        if(isEmpty())
        {
            System.out.println("The stack is empty");
            return -1;
        }
        else {
            int top = arr[topOfStack];
            topOfStack--;
            return top;
        }

    }
    public int peek()
    {
        return arr[topOfStack];
    }
    public void delete()
    {
        arr=null;
        System.out.println("The stack is deleted successfully");
    }

    public static void main(String[] args) {
        StackUsingArray stack=new StackUsingArray(4);
        System.out.println(stack.isEmpty());
        System.out.println(stack.isFull());
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);


        System.out.println(stack.pop());
        stack.push(3);
        System.out.println(stack.peek());
        stack.push(3);
        stack.delete();



    }
}
