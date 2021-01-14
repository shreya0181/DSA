package ISA.SelectionSorts;

public class SelectionSort {



    public int findmin(Integer A[], int pointer)
    {

        
        int min_index=pointer;
        for(int i=pointer+1; i<A.length; i++)
        {
            if(A[min_index]>A[i])
            { 
                min_index=i;

            }
        }
        return min_index;
    }
    public void selectionSort(Integer A[])
    {

        for(int i=0;i<A.length; i++)
        {
            int min_index = findmin(A, i);
            if(i!= min_index)
            {
                int temp = A[i];
                A[i]=A[min_index];
                A[min_index]= temp;
            }
        }
        
    }
    
    
}
