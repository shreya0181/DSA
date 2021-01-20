package IDS.Graphs;
import java.util.*;


class GraphAdjacencyList
{


     ArrayList<ArrayList<Integer>> graph ;
     int v;
     GraphAdjacencyList(int  v)
     {
       this.v= v;
       graph = new ArrayList<ArrayList<Integer>>();
       for (int i=0;i<v;i++)
       {
          graph.add(new  ArrayList<Integer>());
       }
     }

     public void addEdge(int source, int destination)
     {
       graph.get(source).add(destination);
       graph.get(destination).add(source);
     }

     public void print()
     {
       for (int i=0;i<v;i++)
       {
         for(int edge : graph.get(i))
         {
           System.out.print(i+" : "+edge);

         }
         System.out.println();

       }

     }
  
   
    

}