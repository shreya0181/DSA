package IDS.Graphs;
import java.util.ArrayList;
import java.util.*;
public class GraphHashMap<T> {
    public int v;
    public HashMap<T, ArrayList<T>> m = new  HashMap<>();
    

    public void addVertex(T v)
    {
       m.put(v, new ArrayList<T>());
    }

    public void addEdge(T source, T destination )
    {
        if(!m.containsKey(source))
        {
            addVertex(source);
        }
        if(!m.containsKey(source))
        {
            addVertex(source);
        }

        m.get(source).add(destination);
        m.get(destination).add(source);

    }

    public void vertexcount()
        {

            System.out.println("The Graph Has "+ m.keySet().size()+" vertices.");
        }

    public void printGraph()
        {
            for(T v:m.keySet())
            {
                for(T edge: m.get(v))
                {
                    System.out.println(v+" : "+edge.toString());
                }
                System.out.println();
            }

        }
        
    
}
