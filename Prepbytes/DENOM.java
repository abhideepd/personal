package Prepbytes;
import java.io.*;
public class DENOM {
    public static void main(String[] args)throws IOException {
        BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
        int T=Integer.parseInt(x.readLine());
        for(int i=0; i<T; i++)
        {
            int n=Integer.parseInt(x.readLine());
            int res=0;
            res=res+n/1000;
            n=n%1000;
            res=res+ n/500;
            n=n%500;
            res=res+n/50;
            n=n%50;
            res=res+n/20;
            n=n%20;
            res=res+n/10;
            n=n%10;
            res=res+n/5;
            n=n%5;
            res=res+n/2;
            n=n%2;
            res=res+n/1;
            System.out.println(res);
        }
    }
}