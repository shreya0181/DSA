package ISA.ExchangeSorts;

public class BubbleSort {
    
    // bubble sort 
    public static Integer[] bubbleSort(Integer A[])
    {
        int temp;
        for(int i=0;i<A.length-1;i++)
        {
            for(int j=0;j<A.length-i-1;j++)
            {
                if(A[j]<A[j+1])
                {
                    temp = A[j+1];
                    A[j+1]=A[j];
                    A[j]=temp;
                }

            }
        }
        return A;

    }

    // recursive bubble sort
    public static Integer[] recursiveBubbleSort(Integer A[], int n)
    {
        int temp;
        if(A.length==1) {
            System.out.println("Recursive Bubble Sort");
            return A;
        }
        for(int i=0;i<n-1;i++)
        {
            if(A[i]>A[i+1])
            {
                temp = A[i];
                A[i]=A[i+1];
                A[i+1]=temp;
            }
        }

        return recursiveBubbleSort(A, n-1);


    }
    
    // public static void main(String[] args) {
    //     InputArray one= new InputArray();
    //     OutputArray print= new OutputArray(); 

    //     Integer A[]= one.ScannerInput();
    //     A= bubbleSort(A);
    //     print.printArray(A);
    //     A= recursiveBubbleSort(A, A.length);
    //     print.printArray(A);
        
    // }
}
