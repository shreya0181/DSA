package IDS.Stacks;
import java.util.*; 
public class StackUsingQueues {
    //  push operation Costly
      static  Queue<Integer> queueone = new LinkedList<Integer> ();
      static  Queue<Integer> queuetwo = new LinkedList<Integer> ();

      static int size;
      StackUsingQueues()
      {
        size=0;

      }
      public void push(int element) 
    {

          size++;
          queueone.add(element);
          while(!queueone.isEmpty())
          {
              queuetwo.add(queueone.poll());
          }

          //  swap the queues as idealy queuetwo must be empty
          Queue<Integer> q = queueone; 
          queueone =  queuetwo; 
          queuetwo = q; 
        
    }

    public int pop() throws NullPointerException
    {
      if( queueone.isEmpty()== true) throw new NullPointerException();
      size--;
      return queueone.poll();
    }

    public int size()
    {
      return size;
    }




    
}
