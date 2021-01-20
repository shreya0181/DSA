package IDS.Graphs;

import java.util.*;
public class Graph {

    // implementing graph using adjacency Matrix
    // space complexity (v^2)

    int graph[][];
    int v;
    Graph(int v){     
        this.v= v; 
        graph=   new int[v][v];
    }
     
    // bidirectional graph
    public  void add(int v, int u)
    {
     graph[v][u]= 1;
     graph[u][v]= 1;
    }

   
    public  void print(Graph g)
    {
       
        for(int i=0;i<g.v;i++)
       {
           for(int j=0;j<g.v;j++)
           {
               if(g.graph[i][j] == 1)
               {
                System.out.print(g.graph[i][j]+" "); 

               }
           }
       }
      

    }

    public static void main()
    {
       Scanner in= new Scanner (System.in);
       int v = in.nextInt();
       Graph graph= new Graph(v);
       graph.add(4,  3);
       graph.add(1,  2);
       graph.add(2,  3);
       graph.add(5,  3);
       graph.print(graph);
    }

}
