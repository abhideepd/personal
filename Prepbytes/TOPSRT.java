package Prepbytes;
import java.io.*;
import java.util.*;
/*
public class TOPSRT {
    static boolean visited[];
    static Stack<Integer> answer=new Stack<Integer>();
    static HashMap<Integer, ArrayList<Integer>> graph=new HashMap<Integer, ArrayList<Integer>>();
    public static void main(String []args)throws IOException
    {
        BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
        String input1[]=(x.readLine()).split(" ");
        int N=Integer.parseInt(input1[0]);//vertices
        int E=Integer.parseInt(input1[1]);//edges
        //HashMap<Integer, ArrayList<Integer>> graph=new HashMap<Integer, ArrayList<Integer>>();
        for(int i=0; i<N; i++)
        {
            ArrayList<Integer> temp=new ArrayList<Integer>();
            graph.put(i, temp);
        }
        for(int i=0; i<E; i++)
        {
            String input[]=(x.readLine()).split(" ");
            int a=Integer.parseInt(input[0]);
            int b=Integer.parseInt(input[1]);
            ArrayList<Integer> temp=graph.get(a);
            temp.add(b);
            graph.put(a, temp);
        }
        //System.out.println(graph);
        if(check(N, E))
        {
            visited=new boolean[N];
            for(int i=0; i<N; i++)
            {
                if(visited[i]==false)
                {
                    //dfs(i, -1);
                    answer.push(i);
                }
            }
        }
        else
        {
            System.out.println("Not Possible");
        }
    }
    static boolean check(int N, int E)
    {
        visited=new boolean[N];
        int edge_count=0;
        Stack<Integer> s=new Stack<Integer>();

        for(int i=0; i<N; i++)
        {
            if(visited[i]==false)
            {
                ArrayList<Integer> arr=graph.get(i);
                while(arr.size()!=0)
                {
                    int temp=arr.remove(0);

                    if(visited[temp]==false)
                    ++edge_count;

                    visited[temp]=true;
                }
            }
        }
    }
    static void dfs(int n)
    {

    }
}
*/