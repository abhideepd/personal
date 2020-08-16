package Prepbytes;
import java.io.*;
public class DVDALL1 {
    public static void main(String[] args)throws IOException {
        BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
        int T=Integer.parseInt(x.readLine());
        for(int i1=0; i1<T; i1++)
        {
            long size=Long.parseLong(x.readLine());
            String input[]=(x.readLine()).split(" ");
            long gcd=Long.parseLong(input[0]);
            for(int i=1; i<size; i++)
            {
                long temp=Long.parseLong(input[i]);
                gcd=gcd(gcd, temp);
            }
            int ans=0;
            for(int i=1; i<=gcd; i++)
            {
                if(gcd%i==0)
                ++ans;
            }
            System.out.println(ans);
        }
    }
    static long gcd(long a, long b)
    {
        if(a==0)
        return b;
        return gcd(b%a, a);
    }
}