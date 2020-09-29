package Prepbytes;
import java.io.*;
import java.util.*;
public class LNGTREE {
    static int vertices=0, edge=0;
    static HashMap<Integer, ArrayList<Integer>> graph=new HashMap<Integer, ArrayList<Integer>>();
    static int ans=-1;
    static boolean visited[];
    public static void main(String []args)throws IOException
    {
        BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
        int T=Integer.parseInt(x.readLine());

        for(int i1=0; i1<T; i1++)
        {
            String input1[]=(x.readLine()).split(" ");
            vertices=Integer.parseInt(input1[0]);
            edge=Integer.parseInt(input1[1]);
            graph=new HashMap<Integer, ArrayList<Integer>>();
            ans=-1;

            for(int i=0; i<edge; i++)
            {
                String input2[]=(x.readLine()).split(" ");
                int a=Integer.parseInt(input2[0]);
                int b=Integer.parseInt(input2[1]);

                if(graph.containsKey(a))
                {
                    ArrayList<Integer> temp=graph.get(a);
                    temp.add(b);
                    graph.put(a, temp);
                }
                else
                {
                    ArrayList<Integer> temp=new ArrayList<Integer>();
                    temp.add(b);
                    graph.put(a, temp);
                }

                if(graph.containsKey(b))
                {
                    ArrayList<Integer> temp=graph.get(b);
                    temp.add(a);
                    graph.put(b, temp);
                }
                else
                {
                    ArrayList<Integer> temp=new ArrayList<Integer>();
                    temp.add(a);
                    graph.put(b, temp);
                }
            }
            //System.out.println(graph);
            for(int i=0; i<vertices; i++)
            {
                //System.out.println("a");
                visited=new boolean[vertices];
                dfs(i, 0);
            }
            //System.out.println(graph);
            System.out.println(ans);
        }
    }
    static void dfs(int n, int dist)
    {
        if(dist>ans)
        ans=dist;        

        visited[n]=true;

        ArrayList<Integer> arr=new ArrayList<Integer>(graph.get(n));

        //System.out.println(dist+" "+n+" "+arr);
        
        while(arr.size()!=0)
        {
            int temp=arr.remove(0);

            if(visited[temp]!=true)
            dfs(temp, dist+1);            
        }
    }
}
