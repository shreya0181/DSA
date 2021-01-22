package IDS.Stacks;
import java.util.*;

import jdk.nashorn.api.tree.WhileLoopTree;
public class StackUsingLinkedList {
    
    class Node 
    {
        int data;
        Node next;
        Node(int data)
        {
            this.data= data;
            next= null;

        }
    }
    private Node Stack ;

    // is Empty
    public boolean isEmpty()
    {
        return (Stack==null) ;

    }

    //  public void push 
    public void push(int element)
    {
        Node newNode = new Node(element);
        if(isEmpty())
        {
            Stack= newNode;
        }
        else{
          newNode.next= Stack;
          Stack= newNode;

        }

    }

    //  pop
    public int pop() throws NullPointerException
    {
        if(isEmpty()) throw new NullPointerException();
        int poll= Stack.data;
        Stack = Stack.next;
        return poll;

    }

    //  print elements of Stack 
    public void print() throws NullPointerException
    {
        if (Stack == null) throw new NullPointerException();
        Node temp = Stack ;
        while(temp!= null)

        {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }
  
}
