package Prepbytes;
import java.io.*;
import java.util.*;
public class DTCYC {
    static HashMap<Integer, ArrayList<Integer>> graph=new HashMap<Integer, ArrayList<Integer>>();
    static boolean visited[];
    static boolean ans=false;
    public static void main(String []args)throws IOException
    {
        BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
        String input[]=(x.readLine()).split(" ");
        int vertex=Integer.parseInt(input[0]);
        int edge=Integer.parseInt(input[1]);
        visited=new boolean[vertex];

        for(int i=0; i<edge; i++)
        {
            String inp[]=(x.readLine()).split(" ");
            int xx=Integer.parseInt(inp[0]);
            int yy=Integer.parseInt(inp[1]);

            if(!graph.containsKey(xx))
            {
                ArrayList<Integer> temp=new ArrayList<Integer>();
                temp.add(yy);
                graph.put(xx, temp);
            }
            else{
                ArrayList<Integer> temp=graph.get(xx);
                temp.add(yy);
                graph.put(xx, temp);
            }
            
            if(!graph.containsKey(yy))
            {
                ArrayList<Integer> temp=new ArrayList<Integer>();
                temp.add(xx);
                graph.put(yy, temp);
            }
            else{
                ArrayList<Integer> temp=graph.get(yy);
                temp.add(xx);
                graph.put(yy, temp);
            }
        }
        System.out.println(graph);

        for(int i=0; i<vertex; i++)
        {
           if(visited[i]!=true)
           {
               if(graph.containsKey(i))
               {
                   check(i, i);
               }
           }
           if(ans==true)
           break;
        }
        //System.out.println(ans==true?"Yes":"No");
    }

    static void check(int i,int root)
    {
       visited[i]=true;
       ArrayList<Integer> arr=graph.get(i);

       while(arr.size()!=0)
       {
            int temp=arr.remove(0);

            if(temp==root)
            continue;

            if(visited[temp]==true)
            {
                ans=true;
                return;
            }

            check(temp, i);
       }
    }

    static void print()
    {
        for(int i=0; i<visited.length; i++)
        {
            System.out.println(i+" --> "+visited[i]);
        }
    }
}
