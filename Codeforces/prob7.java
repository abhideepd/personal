package Codeforces;
import java.util.*;
import java.io.*;
public class prob7 {
    public static void main(String []args)throws IOException
    {
        BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
        String inp[]=(x.readLine()).split(" ");
        long w=Integer.parseInt(inp[0]);
        long h=Integer.parseInt(inp[1]);
        long n=Integer.parseInt(inp[2]);

        long l=1, r=Long.MAX_VALUE-1;

        while(l<r)
        {
            long mid=(l+r)/2;

            //System.out.println(l+" "+r+" "+mid);

            if(f(mid, w, h, n))
            r=mid;
            else
            l=mid+1;
        }
        //System.out.print("Answer: "+r);
        System.out.println(l-1);
    }
    static boolean f(long x, long a, long b, long n)
    {
        if((Math.floor((double)x/(double)a)*Math.floor((double)x/(double)b))>=n)
        return true;
        return false;
    }
}
