package Prepbytes;
import java.io.*;
public class SEQUENCE {
    public static void main(String[] args)throws IOException {
        BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
        int T=Integer.parseInt(x.readLine());
        long m=(long)Math.pow(10, 9)+7;
        for(int i=0; i<T; i++)
        {
            int N=Integer.parseInt(x.readLine());
            System.out.println(answer(N)%m);
        }
    }
    static long answer(int N)
    {
        if(N==1)
        return 1;
        else if(N%2==0)
        return N+answer(N/2);
        else
        return N+answer(3*N+1);
    }
}