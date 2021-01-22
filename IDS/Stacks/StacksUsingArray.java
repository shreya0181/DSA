package IDS.Stacks;

public class StacksUsingArray {
    // LIFO
    int array[] ;
    int size;
    int top=-1;
   
    StacksUsingArray()
    {
       
        array = new int[10];
    }

    public boolean isEmpty()
    {
        return size==0;
    }

    public int poll() throws NullPointerException
    {
    
       if(isEmpty()) throw new NullPointerException();
       return array[top--];
    }

    public void push(int element)
    {
       if(top>9) System.out.print("Stack Over Flow");
       array[++top]= element;
    }

}
