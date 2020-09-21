package Prepbytes;
import java.io.*;
import java.util.*;
public class WARZN {
    static HashMap<Integer, ArrayList<Integer>> graph=new HashMap<Integer, ArrayList<Integer>>();
    static HashMap<Integer, Integer> LandMine=new HashMap<Integer, Integer>();
    static int vertex, L;
    static int ans=0;
    static boolean visited[];
    public static void main(String []args)throws IOException
    {
        BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
        String input[]=(x.readLine()).split(" ");
        vertex=Integer.parseInt(input[0]);
        L=Integer.parseInt(input[1]);
        String input2[]=(x.readLine()).split(" ");
        //Enter the landMines
        for(int i=0; i<vertex; i++)
        {
            int temp=Integer.parseInt(input2[i]);

            if(temp==1)
            LandMine.put(i, 1);
        }
        //INPUT 
        for(int i=0; i<vertex-1; i++)
        {
            String temp_input[]=(x.readLine()).split(" ");
            int u=Integer.parseInt(temp_input[0]);
            int v=Integer.parseInt(temp_input[1]);
            create_graph(u, v);
        }
        //System.out.println(graph);
        if(vertex==1)
        System.out.println(0);

        else
        {
            visited=new boolean[vertex];       
            dfs(0, L);
            System.out.println(ans);
        }
    }
    static void dfs(int n, int bomb)
    {
        visited[n]=true;

        if(LandMine.containsKey(n))
        --bomb;
        else
        bomb=L;

        if(bomb<0)
        return;
        
        ArrayList<Integer> arr=graph.get(n);

        if((arr.size()==1)&&(n!=0))
        ++ans;

        while(arr.size()!=0)
        {
            int temp=arr.remove(0);
            if(visited[temp]==false)
            dfs(temp, bomb);
        }
    }
    static void create_graph(int u, int v)
    {
        ArrayList<Integer> temp_arr=new ArrayList<Integer>();

            if(!graph.containsKey(u))
            {
                temp_arr.add(v);
                graph.put(u, temp_arr);
            }
            else{
                temp_arr=graph.get(u);
                temp_arr.add(v);
                graph.put(u, temp_arr);
            }

            temp_arr=new ArrayList<Integer>();

            if(!graph.containsKey(v))
            {
                temp_arr.add(u);
                graph.put(v, temp_arr);
            }
            else{
                temp_arr=graph.get(v);
                temp_arr.add(u);
                graph.put(v, temp_arr);
            }
    }
}
