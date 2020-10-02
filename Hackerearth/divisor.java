package Hackerearth;
import java.io.*;
import java.util.*;
public class divisor {
    public static void main(String []args)throws IOException
    {
        BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(x.readLine());
        for(int i1=0; i1<t; i1++)
        {
            String input[]=(x.readLine()).split(" ");
            Long n=Long.parseLong(input[0]);
            Long k=Long.parseLong(input[1]);
            System.out.println(answer(n, k));
        }
    }
    static long answer(long n, long k)
    {
        if(n==0)
        return 0;
        long temp=n/k;
        return answer(n/k, k)+(n*(n+1)/2)-(temp*(temp+1)/2)*k;
    }
}
