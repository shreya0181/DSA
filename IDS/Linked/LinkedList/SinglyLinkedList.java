package IDS.Linked.LinkedList;
import java.util.*;
class Node<T> 
{
    T data;
    Node<T> next;

    Node(T data)
    {
        this.data= data;
        this.next= null;
    }
}
class SinglyLinkedList<T>
{

    Node<T> head = null;

    //  inserting an element at last
    public SinglyLinkedList<T> insertLast(T data, SinglyLinkedList<T> list) 
    {
        Node<T> newNode= new Node<>(data);
        if(list.head== null)
        {
            list.head= newNode; 
        }
        else
        {
            Node<T> temp= list.head;
            while(temp.next!= null)
            {
                temp = temp.next;
            }
            temp.next= newNode;

        }  
        
        return list;

    }

    //  inserts an element  in front
    public SinglyLinkedList<T> insertFront(T data, SinglyLinkedList<T> list)
    {
        Node<T> newNode = new Node<>(data);
        if(list.head == null)
        {
            list.head= newNode;
        }

        else{
            newNode.next= list.head;
            list.head= newNode;

        }
        return list;
        
    }

    // deletes element by key
    public SinglyLinkedList<T> delete(int key, SinglyLinkedList<T> list) throws IndexOutOfBoundsException
    {
        Node<T> temp = list.head;
        while(  temp.next!= null && key>0 )
        {
            temp = temp.next;
            key--;
        }

        if(temp.next!=null)
        {
            temp= temp.next.next;
        }
        else
        {
            throw new IndexOutOfBoundsException();
        }
        return list;

    }

    //  returns the length of SinglyLinkedList 
    public int length(SinglyLinkedList<T> list) throws NullPointerException
    {
        int length=0;
        if(list.head== null) throw new NullPointerException();

        Node<T> temp = list.head;
        while(temp!=null)
        {
            temp = temp.next;
            length++;
        }
        return length;
    }

    //  returns a reversed SinglyLinkedList
    // public SinglyLinkedList<T> reverse(SinglyLinkedList<T> list)
    // {
    //     Node <T> next = null;
    //     Node <T> curr = list.head;
    //     Node <T> prev= null;

    //     while(curr!=null)
    //     {
    //           prev= curr;
    //           next =   
    //     }
    // }

    // retuns  element at given index(Key)
    public T get(int index, SinglyLinkedList<T> list) throws Exception
    {
        if(list.head == null) throw new NullPointerException();
        Node<T> temp = list.head;

        while(temp.next!=null && index>0)
        {
            temp= temp.next;
            index--;
        }
        if(temp.next == null) throw new IndexOutOfBoundsException();

        return temp.next.data;

    }

    // returns the middle element of the list
    public T getMiddleElement(SinglyLinkedList<T> list)
    {
           Node<T> slow = list.head;
           Node<T> fast = list.head;
           while(fast!= null &&  fast.next!=null && slow!=null)
           {
               slow = slow.next;
               fast = fast.next.next;
           }
           return slow.data;
    }

    // returns the frequency of the given element
    public int frequency(T element, SinglyLinkedList<T> list) throws Exception
    {
        if(list.head==null) throw new NullPointerException();
        Node<T> temp = list.head;
        int count =0;
        while(temp!=null)
        {
            if(element==temp.data) count++;
            temp= temp.next;
        }

        return count;

    }



    // returns nth element from last
    public T getLast(int index, SinglyLinkedList<T> list ) throws  NullPointerException
    {
        if(list.head==null) throw new NullPointerException();
        Node <T> slow = list.head;
        Node <T> fast= list.head;
        while(fast!= null && index>0)
        {
            index--;
            fast = fast.next;
        }
        while(fast!=null && slow!=null )
        {
            fast= fast.next;
            slow= slow.next;
        }

        return slow.data;


    }

    // removing duplicates
    public SinglyLinkedList<T> removeDuplicates(SinglyLinkedList<T> list) throws Exception
    {
        if(list.head == null) throw new NullPointerException() ;
        Node<T> temp = list.head;
        HashSet<T> m= new HashSet<>();
        while(temp!=null && temp.next!=null)
        {
            if(m.contains(temp.data)) 
            {
                temp = temp.next.next;

            }
            else{

                temp= temp.next;
            }
           
            m.add(temp.data);
            
        }

        return list;

    }

    // returns true if list is palindrome
    public boolean palindrome(SinglyLinkedList<T> list) throws Exception
    {
        if(list.head == null) throw new NullPointerException();
        Node<T> slow= list.head;
        Node<T> fast = list.head;
        boolean isPalindrome= true;

        Stack<T> s = new Stack<>();
        while(fast!=null)
        {
            s.push(slow.data);
            slow= slow.next;
            fast= fast.next;
        }

        while(slow!=null && !s.isEmpty())
        {
            if(!(slow.data == s.pop()))
            {
                isPalindrome = false;
                break;
            }
        }

         return isPalindrome;


    }

    // Sorting a linkedList using QuickSort
    // public SinglyLinkedList<T> sort(SinglyLinkedList<T> list) 
    // {
    //     if(list.head== null) return null;

       
    // }

    // returns pairwise swaped elements of linkedlist
    public SinglyLinkedList<T> pairwiseSwap(SinglyLinkedList<T> list) throws NullPointerException
    {
        if(list.head==null) throw new NullPointerException();
        Node<T> temp = list.head;
        while(temp!=null && temp.next!=null)
        {

            T data = temp.data;
            temp.data = temp.next.data;
            temp.next.data= data;

            temp= temp.next.next;
        }

        return list;

    }

    // Rotate the list (moves last element to front)
       
    // Rotate list by a blockwise
    // Returns list by Merging K Sorted Linked List
    



}