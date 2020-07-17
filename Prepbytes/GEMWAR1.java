package Prepbytes;
import java.io.*;
public class GEMWAR1 {
    public static void main(String[] args)throws IOException {
        BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
        String input[]=(x.readLine()).split(" ");
        long N=Long.parseLong(input[0]);
        long M=Long.parseLong(input[1]);
        long X=Long.parseLong(input[2]);
        long Y=Long.parseLong(input[3]);
        if((M/X)>=N)
        System.out.println(N);
        else
        System.out.println(func(N, M, X, Y));
    }
    static long func(long N, long M, long X, long Y)
    {
        long l=0;
        long r=N;
        long mid=(l+r)/2;

        while(l<=r)
        {
            long temp=(M+mid*Y)/X;
            if(temp==(N-mid))
            return mid;
            else if(temp>(N-mid))
            r=mid-1;
            else
            l=mid+1;
            mid=(l+r)/2;
        }
        return mid;
    }
}