package ISA.InsertionSorts;

public class InsertionSort {
    
    public void insertionSort(Integer A[])
    {

        for(int i=1;i<A.length;i++)
        {
            int key = A[i];
            int j= i-1;
       while(j>0&&key<A[j])
       {
           A[j+1] = A[j];
           j--;

       }
       A[j+1]= key;

        }
       

        
    }
}
