package Prepbytes;
import java.io.*;
import java.util.*;
public class KABADDI {
    static int K=0;
    static int arr[];
    static int ans=0;
    public static void main(String []args)throws IOException
    {
        BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(x.readLine());
        for(int i=0; i<t; i++)
        {
            String input1[]=(x.readLine()).split(" ");
            K=Integer.parseInt(input1[1]);
            String input=input1[0];
            arr=new int[input.length()];
            ans=0;
            input_in_array(input);
            answer();
            System.out.println(ans);
        }
    }
    static void answer()
    {
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i]==1)
            {
                int l=lowerbound(i);
                int r=upperbound(i);
                find(l, r);
            }
        }
    }
    static void find(int l, int r)
    {
        for(int i=l; i<=r; i++)
        {
            if(arr[i]==0)
            {
                ++ans;
                arr[i]=-1;
                break;
            }
        }
    }
    static int lowerbound(int n)
    {
        n=n-K;
        if(n<0)
        n=0;
        return n;
    }
    static int upperbound(int n)
    {
        n=n+K;
        if(n>=arr.length)
        n=arr.length;
        return n;
    }
    static void print()
    {
        for(int i=0; i<arr.length; i++)
        System.out.print(arr[i]+" ");
    }
    static void input_in_array(String a)
    {
        for(int i=0; i<arr.length; i++)
        {
            arr[i]=Integer.parseInt(a.charAt(i)+"");
        }
    }
}
