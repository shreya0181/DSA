package ISA.MergeSorts;
// import IO.InputArray;
// import IO.OutputArray;
import java.util.*;
class MergeSort
{
    public void  mergeSort(int A[], int start, int end)
    {
        if(start == end) return ; 
        int mid = (end+ start)/2;
        mergeSort(A, start, mid);
        mergeSort(A, mid+1, end);

        merge(A, start, mid, end);
    }

    public void merge(int A[], int start, int mid, int end)
    {
        int leftEnd= mid;
        int rightStart= mid+1;
        int k=0;
        // end --> n-1 during funcall
        int temp[]= new int[end-start+1];

        while(start<=leftEnd && rightStart<end)
        {
            if(A[start]>=A[rightStart])
            {
                temp [k] = A[rightStart];
                k++;
                rightStart++;
               
            }
            else{
                temp [k] = A[start];
                k++;
                start++;             
            }
        }
        while(start<=leftEnd)
        {
            temp [k] = A[rightStart];
                k++;
                rightStart++;
               
        }
        while(rightStart<=end)
        {
            temp [k] = A[start];
            k++;
            start++;   
        }
    }

    
      
        

}