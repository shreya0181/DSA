package ISA.ExchangeSorts;
import java.util.*;
public class QuickSort{ 

    // partion the array on the basis of theb pivot 
    // recursivly apply quick sort on the right and left partitioned array

         public static void quickSort(Integer A[], int start, int end )
         {
            
            if(start>=end) return ;
            // patition the array using partition index
            int partition = partition(A,start, end);
            // quickSort left partitioned array
            quickSort(A, start, partition-1);
            // quickSort right partioned array
            quickSort(A, start, partition+1);

         }

         public static int partition(Integer A[], int start, int pivot)
         {
             
             int pointer = start;
             for(int i=start;i<pivot;i++)
             {
                 if(A[i]<=A[pivot])
                 {
                     int temp = A[i];
                     A[i]= A[pointer];
                     A[pointer]= temp;
                 }
                pointer ++;
             }
           
                int temp = A[pivot];
                A[pivot]= A[pointer];
                A[pointer]= temp;           

                return pointer+1;

         }
         
            public void method(String[] args) {
                //   InputArray one = new InputArray();
                Scanner sc = null;
            
                try{
                  sc  = new Scanner (System.in);
                  int n = sc.nextInt();
                  Integer A[]= new  Integer[n];
                  for (int i=0;i<n;i++)
                  {
                      A[i]=sc.nextInt();
                  }
            
               
                quickSort(A, 0, A.length-1);
                 for(int i=0;i<n;i++)
                 {
                     System.out.print(A[i]+" ");
                 }
            
                }
                finally {
                    if(sc!=null)
                        sc.close();
                }
                  
                    
                }
        
        }

    



