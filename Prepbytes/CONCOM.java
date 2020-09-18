package Prepbytes;
import java.io.*;
import java.util.*;
public class CONCOM {
    static boolean visited[];
    static HashMap<Integer, ArrayList<Integer> > graph;
    public static void main(String []args)throws IOException
    {
        BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
        int T=Integer.parseInt(x.readLine());

        for(int i1=0; i1<T; i1++)
        {
            String input[]=(x.readLine()).split(" ");
            int N=Integer.parseInt(input[0]);
            int E=Integer.parseInt(input[1]);
            visited=new boolean[N];
            graph=new HashMap<Integer, ArrayList<Integer> >();

            for(int i=0; i<E; i++)
            {
                String inp[]=(x.readLine()).split(" ");
                int xx=Integer.parseInt(inp[0]);
                int yy=Integer.parseInt(inp[1]);

                //INSERT OPERATION STARTS

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

                //INSERT OPERATION ENDS
            }
            //System.out.println(graph);

            int ans=0;
            for(int i=0; i<N; i++)
            {
                if(visited[i]==false)
                {
                    visited[i]=true;
                    ++ans;
                    traversal(i);
                }
            }
            System.out.println(ans);
        }
    }
    static void traversal(int i)
    {
        if(graph.containsKey(i))
        {
            visited[i]=true;
            ArrayList<Integer> temp=graph.get(i);
            while(temp.size()!=0)
            {
                traversal(temp.remove(0));
            }
        }
    }
}
