package Prepbytes;
import java.io.*;
import java.util.*;
public class CHTREE {
    static int vertices=0, edges=0;
    static HashMap<Integer, ArrayList<Integer>> graph=new HashMap<Integer, ArrayList<Integer>>();
    static boolean visited[];
    static boolean ans=true;
    public static void main(String []args)throws IOException
    {
        BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
        int T=Integer.parseInt(x.readLine());

        for(int i1=0; i1<T; i1++)
        {
            String input1[]=(x.readLine()).split(" ");
            vertices=Integer.parseInt(input1[0]);
            edges=Integer.parseInt(input1[1]);

            //global variable initialization starts
            graph=new HashMap<Integer, ArrayList<Integer>>();
            //vertices=0;
            //edges=0;
            ans=true;
            visited=new boolean[vertices];
            //global variable initialization ends
            
            //Input graph in hashmap starts
            for(int i=0; i<edges; i++)
            {
                String edge[]=(x.readLine()).split(" ");
                int a=Integer.parseInt(edge[0]);
                int b=Integer.parseInt(edge[1]);
                
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
                    graph.put(a,temp);
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
            //Input graph in hashmap ends
            //print();
            dfs(0, -1);
            check();
            System.out.println(ans==true?"YES":"NO");
        }
    }
    static void print()
    {
        System.out.println(visited.length);
    }
    static void dfs(int n, int parent)
    {
        if(visited[n]==true)
        {
            ans=false;
            return;
        }
        visited[n]=true;
        ArrayList<Integer> arr=graph.get(n);
        while(arr.size()!=0)
        {
            int temp=arr.remove(0);
            if(temp==parent)
            continue;
            else
            dfs(temp, n);
        }
    }
    static void check()
    {
        for(int i=0; i<visited.length; i++)
        {
            if(visited[i]==false)
            {
                ans=false;
                break;
            }
        }
    }
}
