package Prepbytes;
import java.io.*;
import java.util.*;
public class MAXED {
    static HashMap<Integer, ArrayList<Integer>> graph=new HashMap<Integer, ArrayList<Integer>>();
    static boolean visited[];
    static int xyz=0;
    static int parent=-1;
    public static void main(String []args)throws IOException
    {
        BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
        int T=Integer.parseInt(x.readLine());
        for(int i1=0; i1<T; i1++)
        {
            String input1[]=(x.readLine()).split(" ");
            int vertex=Integer.parseInt(input1[0]);
            int edge=Integer.parseInt(input1[1]);
            visited=new boolean[vertex];
            for(int i=0; i<edge; i++)
            {
                String input2[]=(x.readLine()).split(" ");
                int u=Integer.parseInt(input2[0]);
                int v=Integer.parseInt(input2[1]);
                if(graph.containsKey(u))
                {
                    ArrayList<Integer> temp=graph.get(u);
                    temp.add(v);
                    graph.put(u, temp);
                }
                else
                {
                    ArrayList<Integer> temp=new ArrayList<Integer>();
                    temp.add(v);
                    graph.put(u, temp);
                }
                if(graph.containsKey(v))
                {
                    ArrayList<Integer> temp=graph.get(v);
                    temp.add(u);
                    graph.put(v, temp);
                }
                else
                {
                    ArrayList<Integer> temp=new ArrayList<Integer>();
                    temp.add(u);
                    graph.put(v, temp);
                }
            }
            //System.out.println(graph);
            answer(vertex);
        }
    }
    static void answer(int vertex)
    {
        int ans=0;
        for(int i=0; i<vertex; i++)
        {
            if(visited[i]==false)
            {
                parent=-1;
                xyz=0;
                dfs(i);
            }
            if(ans<xyz)
            ans=xyz;
        }
        System.out.println(ans/2);
    }
    static void dfs(int n)
    {
        if(!graph.containsKey(n))
        return;

        visited[n]=true;
        ArrayList<Integer> arr=graph.get(n);
        //System.out.println(arr+" "+n);

        while(arr.size()!=0)
        {
            int temp=arr.remove(0);
            if(parent!=temp)
            {
                parent=temp;
                ++xyz;
                dfs(temp);
            }           
        }
    }
}
