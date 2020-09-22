package Prepbytes;
import java.io.*;
import java.util.*;
public class CHMOV {
    static HashMap<Integer, ArrayList<Integer>> graph=new HashMap<Integer, ArrayList<Integer>>();
    public static void main(String []args)throws IOException
    {
        BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
        
    }
    static void create_graph()
    {
        initialize_hashmap();
        int k=1;
        for(int i=1; i<=1000; i++)
        {
            for(int j=1; j<=i; j++)
            {

                ++k;
            }
        }
    }
    static void initialize_hashmap()
    {
        for(int i=1; i<=(1000*1000); i++)
        {
            graph.put(i, new ArrayList<Integer>());
        }
    }
}
