package Hackerearth;
import java.io.*;
import java.util.*;
public class next_greatest_next_smallest {
    public static void main(String []args)throws IOException
    {
        BufferedReader x=new BufferedReader (new InputStreamReader(System.in));
        int size=Integer.parseInt(x.readLine());
        int arr[]=new int[size+1];
        arr[0]=-1;

        for(int i=0; i<size; i++)
        {
            arr[i+1]=Integer.parseInt(x.readLine().trim());
        }

        int next_greatest[]=next_greatest(arr);
        int next_smallest[]=next_smallest(arr);

        for(int i=1; i<size+1; i++)
        System.out.print(arr[next_smallest[next_greatest[i]]]+" ");

        System.out.println();
    }
    static int[] next_greatest(int []arr)
    {
        Stack<Integer> s=new Stack<Integer>();
        int ans[]=new int[arr.length];
        ans[0]=0;
        for(int i=arr.length-1; i>=1; i--)
        {
            while((!s.isEmpty())&&(arr[s.peek()]<=arr[i]))
            s.pop();

            if(s.isEmpty())
            ans[i]=0;
            else
            ans[i]=s.peek();

            s.push(i);
        }
        return ans;
    }
    static int[] next_smallest(int []arr)
    {
        //Stack<ArrayList<String>> s=new Stack<ArrayList<String>>();
        Stack<Integer> s=new Stack<Integer>();
        int ans[]=new int[arr.length];
        ans[0]=0;
        for(int i=arr.length-1; i>=1; i--)
        {
            while((!s.isEmpty())&&(arr[s.peek()]>=arr[i]))
            s.pop();

            if(s.isEmpty())
            ans[i]=0;
            else
            ans[i]=s.peek();

            s.push(i);
        }
        return ans;
    }
}
