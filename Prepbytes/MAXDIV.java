package Prepbytes;
import java.io.*;
import java.util.*;
public class MAXDIV {
    public static void main(String[] args)throws IOException {
        BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
        String input1[]=(x.readLine()).split(" ");
        long a=Long.parseLong(input1[0]);
        long b=Long.parseLong(input1[1]);
        if(a>b)
        {
            long temp=a;
            a=b;
            b=temp;
        }
        
        long gcd=gcd(a,b);
        ArrayList<Long> arr=new ArrayList<Long>();
        for(long i=1; i<=gcd/2; i++)
        {
            if(gcd%i==0)
            arr.add(i);
        }
        arr.add(gcd);
        //System.out.prlongln(arr);
        long q=Long.parseLong(x.readLine());
        for(long i=0; i<q; i++)
        {
            String input2[]=(x.readLine()).split(" ");
            long low=Long.parseLong(input2[0]);
            long high=Long.parseLong(input2[1]);

            //OUTPUT
            int l=0;
            int r=arr.size();
            //upper bound
            while(l<r)
            {
                int m=(l+r)/2;
                if(high>=arr.get(m))
                l=m+1;
                else
                r=m;
            }
            --r;
            if((r<0)||(arr.get(r)<low))
            System.out.println(-1);
            else
            System.out.println(arr.get(r));
        }
    }
    static boolean check(long no, long low, long high)
    {
        if((no>=low)&&(no<=high))
        return true;
        return false;
    }
    static long gcd(long a, long b)
    {
        if(a==0)
        return b;
        return gcd(b%a, a);
    }
}