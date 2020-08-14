package Prepbytes;
import java.io.*;
public class TWOTEN {
    public static void main(String[] args)throws IOException {
        BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
        int T=Integer.parseInt(x.readLine());
         while(T-->0)
         {
            int n=Integer.parseInt(x.readLine());
            if(n%10==5)
            System.out.println(1);
            else if(n%10==0)
            System.out.println(0);
            else
            System.out.println(-1);
         }
    }
}