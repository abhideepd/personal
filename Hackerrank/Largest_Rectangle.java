package Hackerrank;
import java.io.*;
import java.util.*;
public class Largest_Rectangle 
{
    public static void main(String []args)throws IOException
    {
        BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
        //int t=Integer.parseInt(x.readLine());
        int t=1;
        while(t-->0)
        {
            int n=Integer.parseInt(x.readLine());
            String input[]=(x.readLine()).split(" ");
            int arr[]=new int[n];
            for(int i=0; i<n; i++)
            arr[i]=Integer.parseInt(input[i]);
            System.out.println((long)largestRectangle(arr));
        }
    }    
    static long largestRectangle(int[] h) 
    {
        long ans1=ans(h);
        int arr[]=new int[h.length];
        for(int i=0; i<h.length; i++)
        arr[h.length-i-1]=h[i];
        long ans2=ans(arr);
        System.out.println("Answer: "+ans1+" "+ans2);
        return Math.max(ans1, ans2);
    }
    static long ans(int []h)
    {
        long ans=0;
        Stack<Integer> s=new Stack<Integer>();
        Stack<Integer> area=new Stack<Integer>();
        area.push(h[0]);
        s.push(h[0]);
        for(int i=1; i<h.length; i++)
        {
            if(s.peek()<=h[i])
            {
                s.push(s.peek());
            }
            else
            {
                
            }
        }
        return ans;
    }
}
