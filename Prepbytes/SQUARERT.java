package Prepbytes;
import java.io.*;
public class SQUARERT {
    public static void main(String[] args)throws IOException {
        BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(x.readLine());
        for(int i1=0; i1<t; i1++)
        {
            long n=Long.parseLong(x.readLine());
            System.out.println(func(n));
        }
    }
    static long func(long n)
    {
        long last=n;
        long first=1;
        long mid=(first+last)/2;

        while(first<=last)
        {
            //System.out.println(first+" "+last+" "+mid);
            long temp=mid*mid;
            if(temp==n)
            {
                return mid;
            }
            else if(temp<n)
            first=mid+1;
            else
            last=mid-1;
            mid=(first+last)/2;
        }
        return mid;
    }
}