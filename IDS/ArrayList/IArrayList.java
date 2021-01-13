package IDS.ArrayList;

public class IArrayList<T> implements IList<T>{
   
    private  int capacity=10;
    private  T[] array;
    private int size=0;
    private static int FACTOR = 2;

   public IArrayList()
   {
    array = (T[]) new Object[capacity];
   }

   public boolean isEmpty()
   {
       return size==0;
       
   }

   public int size()
   {
       return size;
   }

   public void grow()
   {
       capacity= capacity*FACTOR;

       T temp[]=(T[]) new Object[capacity];
       for(int i=0;i<size;i++)
            {
                temp[i]= array[i];
            }
        array = temp;
   }
   public void add(T element)  
   {
       if(size==capacity) grow();
       array[size]= element;
       size++;
   }

   public void add(int index, T element)
   {
       if(index>=capacity) grow();
       for(int i=size;i<=index;i++)
       {
           array[i+1]=array[i];

       }
       size++;
       array[index]= element;
   }

   public T get(int index)
   {
    return array[index];
   }

   public T remove(int index)
   {
       if(isEmpty())
       {
                return null;
       }
       T remove = array[index];
       for(int i=index;i<size;i++ )
       {
           array[i]= array[i+1];

       }
       size--;
       return remove;

   }

   public void put(int index, T element)
   {
       if(index>size) return ;
       array[index]= element;

   }

   


    
}