package IDS.ArrayList;

public interface IList<T> {
    // if array is empty
    public boolean isEmpty();

    //  returns the size of the array 
    public int size();

    // add element at the last of the array
    public void add(T element);

    //  adds a new element to the array 
    public void add(int index, T element);

    //  get an element at a particular index
    public T get(int index);

    // remove an element at the given index
    public T remove(int index);

    //  update an element at a particular
    public void put(int index, T element);

   

    
}
