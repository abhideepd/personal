package Prepbytes;
import java.io.*;
public class ARRMW1 {
public static void main(String[] args)throws IOException {
    BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
    int T=Integer.parseInt(x.readLine());
    for(int i1=0; i1<T; i1++)
    {
        String input[]=(x.readLine()).split(" ");
        int M=Integer.parseInt(input[0]);
        int W=Integer.parseInt(input[1]);
        int X=Integer.parseInt(input[2]);
        int Y=Integer.parseInt(input[3]);

        long ans=(fact(M)/(fact(X)*fact(M-X)))*(fact(W)/(fact(Y)*fact(W-Y)))*fact(X+Y);
        System.out.println(ans);
    }
}
static long fact(int a)
{
    long prod=1;
    for(int i=1; i<=a; i++)
    prod=prod*i;
    return prod;
}
}