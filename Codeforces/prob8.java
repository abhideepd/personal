package Codeforces;
import java.io.*;
import java.util.*;
public class prob8 {
    public static void main(String []args)throws IOException
    {
        BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
        String inp[]=(x.readLine()).split(" ");
        int n=Integer.parseInt(inp[0]);
        int k=Integer.parseInt(inp[1]);

        Double arr[]=new Double[n];

        for(int i=0; i<n; i++)
        arr[i]=Double.parseDouble(x.readLine());

        double l=0.0d, r=Integer.MAX_VALUE, mid=0.0d;
        
        for(int i=0; i<60; i++)
        {           
            //System.out.println(l+" "+r+" "+mid); 
            mid=(l+r)/2.0d;
            if(f(mid, arr, k))
            l=mid;
            else
            r=mid;
        }
        System.out.println(l);
    }
    static boolean f(double x, Double []arr, int k)
    {
        double sum=0.0d;
        for(double i:arr)
        {
            sum=sum+Math.floor(i/x);
            //System.out.println(sum);
        }
        if(Math.floor(sum)<k)
        return false;
        return true;
    }
}
