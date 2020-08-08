package Prepbytes;
import java.io.*;
public class MISNGNU {
    public static void main(String[] args)throws IOException {
        BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
        int T=Integer.parseInt(x.readLine());
        for(int i1=0; i1<T; i1++)
        {
            long N=Long.parseLong(x.readLine());
            String input[]=(x.readLine()).split(" ");
            long sum=(N*(N+1))/2;
            System.out.println(sum);
            for(int i=0; i<input.length; i++)
            {
                long temp=Long.parseLong(input[i]);
                sum=sum-temp;
            }
            System.out.println(sum);
        }
    }
}