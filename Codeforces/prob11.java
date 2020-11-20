package Codeforces;
import java.io.*;
public class prob11 {

    static int x=0, y=0;
    public static void main(String []args)throws IOException
    {
        BufferedReader xx=new BufferedReader(new InputStreamReader(System.in));
        String input[]=(xx.readLine()).split(" ");

        int n=Integer.parseInt(input[0]);
        x=Integer.parseInt(input[1]);
        y=Integer.parseInt(input[2]);

        n=n-1;
        int l=1, r=Integer.MAX_VALUE;

        while(l<r)
        {
            int m = l + (r-l)/2 ;
            long temp=func(m);

            //System.out.println("l:"+l+" r:"+r+" m:"+m+" temp:"+temp+" n:"+n);

            if(temp>=n)
            r=m;

            else if(temp<n)
            l=m+1;
        }

        if(n==0)
        System.out.println(Math.min(x, y));
        else
        System.out.println(l+Math.min(x, y));
    }
    static long func(int a)
    {
        return (long)(a/x)+(long)(a/y);
    }
}
