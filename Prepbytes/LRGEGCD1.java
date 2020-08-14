package Prepbytes;
import java.io.*;
public class LRGEGCD1 {
    public static void main(String[] args)throws IOException {
        BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
        int T= Integer.parseInt(x.readLine());
        for(int i1=0; i1<T; i1++)
        {
            String input[]=(x.readLine()).split(" ");
            long N=Long.parseLong(input[0]);
            String M=input[1];
            long ans=Long.parseUnsignedLong("0");
            for(int i=0; i<M.length(); i++)
            {
                String b=M.charAt(i)+"";
                long temp=Long.parseUnsignedLong(b);
                String temp1=ans+"0";
                System.out.println("Start: "+ans+" "+temp1);
                ans=Long.parseUnsignedLong(temp1);
                System.out.println("before: "+ans);
                ans=ans+temp;
                System.out.println("after: "+ans);
                ans=ans%N;
            }
            System.out.println(ans);
            System.out.println(gcd(N, ans));
        }
    }
    static long gcd(long a, long b)
    {
        if(a==0)
        return b;
        return gcd(b%a, a);
    }
}