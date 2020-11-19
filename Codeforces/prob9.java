package Codeforces;
import java.util.*;
import java.io.*;
public class prob9 {
    public static void main(String []args)throws IOException
    {
        BufferedReader xx=new BufferedReader(new InputStreamReader(System.in));
        String inp[]=(xx.readLine()).split(" ");
        int n=Integer.parseInt(inp[0]);//no of copies
        int x=Integer.parseInt(inp[1]);
        int y=Integer.parseInt(inp[2]);

        long l=1, r=Long.MAX_VALUE-1;

        while(l<r)
        {
            long mid=(l+r)/2;

            //System.out.println(l+" "+r+" "+mid);

            if(f(mid, x, y, n))
            r=mid;
            else
            l=mid+1;
        }
        //System.out.print("Answer: "+r);

        float rate=(1.0f/(float) x)+(1.0f/(float) y);
        System.out.println((int)(n/(rate))+1);
    }
    static boolean f(long t, long x, long y, long n)
    {
        if(((t/x)+(t/y))>=n)
        return true;
        return false;
    }
}
