package Testing;

//package Codeforces;
import java.io.*;
public class GFG 
{
    static int arr[];
    static int diff_arr[];
    static int n;
    static int k;
    public static void main(String []args)throws IOException
    {
        BufferedReader x=new BufferedReader(new InputStreamReader(System.in));

        String n_k[]=(x.readLine()).split(" ");
        n=Integer.parseInt(n_k[0]);
        k=Integer.parseInt(n_k[1]);
        String inp_arr[]=(x.readLine()).split(" ");
        arr=new int[n];
        diff_arr=new int[n];

        //--    Input
        for(int i=0; i<n; i++)
        {
            arr[i]=Integer.parseInt(inp_arr[i]);
        }
        
        //--    Stores difference
        int min_diff=Integer.MAX_VALUE;
        for(int i=1; i<n; i++)
        {
            diff_arr[i] = arr[i] - arr[i-1];
            min_diff=Math.min(min_diff, diff_arr[i]);
        }

        long l=min_diff, r=2000000000;

        while(l<=r)
        {
            long m=(l+r)/2;
            if(f(m)==1)
            l=m+1;
            else
            r=m-1;
        }

        int xx=99;
        System.out.println(xx+" "+f(xx));

        System.out.println(l-1);
    }    
    static int f(long min_diff)
    {
        int prev=arr[0];
        int cows=1;
        int flag=0;
        for(int i=1; i<n; i++)
        {
            /*if(arr[i]<min_diff)
            {
                break;
            }*/
            if((prev+min_diff)<=arr[i])
            {
                ++cows;
                if((prev+min_diff)==arr[i])
                {prev=arr[i];flag=1;}
                else
                prev=arr[i-1];
            }
        }

        /*testing*/System.out.println(cows+" "+min_diff+" "+prev);

        //if(flag!=1)
       // cows=-1;

        if(cows>=k)
        return 1;
        else
        return 0;

        ///*testing*/return 1;
    }
}
