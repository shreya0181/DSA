package IDS.Stacks;

public class StacksUsingArray {
    // LIFO
    int array[] ;
    int size;
    int start=0;
    int end;
    StacksUsingArray(int size)
    {
        this.size= size;
        array = new int[size];
    }

    public boolean isEmpty()
    {
        return size==0;
    }

    public int poll() throws NullPointerException
    {
    
       if(isEmpty()) throw new NullPointerException();
       int poll=-1;
       if(!isEmpty())
       {
        poll= array[start];
        start--;
       }
       return poll;
    }

    public void push(int element)
    {
        for(int i=start;i<end;i++)
        {
            array [i+1] = array[i];
        }
        array[start]= element;
        end++;
        size++;

    }

}
