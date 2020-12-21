package Project_Euler;
import java.io.*;
import java.util.*;
public class Problem31_1 
{
    public static void main(String []args)throws IOException
    {
        int n=200;
        long count[]=new long[n+1];
        int coins[]={1, 2, 5, 10, 20, 50, 100, 200};
        count[0] = 1;
        for (int x = 1; x <= n; x++) 
        {
            for (int c : coins) 
            {
                if (x-c >= 0) 
                {
                    count[x] += count[x-c];
                }
            }
        }
        print(count);
        //System.out.println(count[n-1]+" ");
    }
    static void print(long x[])
    {
        System.out.println();
        for(int i=0; i<x.length; i++)
        System.out.print(x[i]+" ");
    }
    static int solve(int x)
    {
        if(x==0)
        return 1;
        if(x<0)
        return 0;
        return solve(x-1)+solve(x-2);
    }
}
