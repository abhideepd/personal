package Prepbytes;
import java.io.*;
public class RVSREUM {
    public static void main(String[] args)throws IOException {
        BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(x.readLine());
        int s=0;
        while(N!=0)
        {
            s=s*10+N%10;
            N=N/10;
        }
        System.out.println(s);
    }
}