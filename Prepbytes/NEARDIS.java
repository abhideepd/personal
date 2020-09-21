package Prepbytes;
import java.io.*;
import java.util.*;
public class NEARDIS {
    static int N=0, M=0;
    static HashMap<Integer, ArrayList<Integer>> graph=new HashMap<Integer, ArrayList<Integer>>();
    static boolean visited[];
    static int matrix[][];
    static int ans[];
    public static void main(String []args)throws IOException
    {
        BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
        int T=Integer.parseInt(x.readLine());

        for(int i1=0; i1<T; i1++)
        {
            String input1[]=(x.readLine()).split(" ");
            N=Integer.parseInt(input1[0]);
            M=Integer.parseInt(input1[1]);

            creategraph();
            ans=new int[(N*M)+1];
            for(int i=0; i<N*M+1; i++)
            {
                ans[i]=Integer.MAX_VALUE;
            }

            //System.out.println(graph);
            
            String input2[]=(x.readLine()).split(" ");          
            visited=new boolean[N*M+1];
            Queue<Integer> q=new LinkedList<Integer>();
            for(int i=0; i<input2.length; i++)
            {
                int temp=Integer.parseInt(input2[i]);
                if(temp==1)
                {
                    q.add(i+1);
                    ans[i+1]=0;
                    visited[i+1]=true;
                }
            }
            bfs(q);
            print_ans();
        }
    }
    static void bfs(Queue <Integer> q)
    {
        while(q.size()!=0)
        {
            int x=q.poll();
            ArrayList<Integer> arr=graph.get(x);
            while(arr.size()!=0)
            {
                int temp=arr.remove(0);
                if(visited[temp]==false)
                {
                    visited[temp]=true;
                    ans[temp]=Math.min(ans[temp], ans[x]+1);
                    q.add(temp);
                }
            }
        }
    }
    static void creategraph()
    {
        initialize_graph_hashmap();
        //i --> row
        //j --> column
        int k=1;
        for(int i=1; i<=N; i++)
        {
            for(int j=1; j<=M; j++)
            {
                if(i==N)
                {
                    if(j!=M)
                    {
                        ArrayList<Integer> temp1=graph.get(k);
                        temp1.add(k+1);
                        ArrayList<Integer> temp2=graph.get(k+1);
                        temp2.add(k);
                        graph.put(k, temp1);
                        graph.put(k+1, temp2);
                    }
                }
                else if(j==M)
                {
                    ArrayList<Integer> temp1=graph.get(k);
                    temp1.add(k+M);
                    ArrayList<Integer> temp2=graph.get(k+M);
                    temp2.add(k);
                    graph.put(k, temp1);
                    graph.put(k+M, temp2);
                }
                else
                {
                    ArrayList<Integer> temp1=graph.get(k);
                    temp1.add(k+1);
                    temp1.add(k+M);
                    graph.put(k, temp1);

                    ArrayList<Integer> temp2=graph.get(k+1);
                    temp2.add(k);
                    graph.put(k+1, temp2);

                    ArrayList<Integer> temp3=graph.get(k+M);
                    temp3.add(k);
                    graph.put(k+M, temp3);
                }
                ++k;
            }
        }
    }
    static void initialize_graph_hashmap()
    {
        for(int i=1; i<=N*M; i++)
        {
            graph.put(i, new ArrayList<Integer>());
        }
    }
    static void print()
    {
        for(int i=0; i<N; i++)
        {
            for(int j=0; j<M; j++)
            {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
    static void print_ans()
    {
        for(int i=1; i<=N*M; i++)
        System.out.print(ans[i]+" ");
        System.out.println();
    }
}