package Prepbytes;
import java.io.*;
public class PRFCTNO {
    public static void main(String[] args)throws IOException {
        BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
        int T=Integer.parseInt(x.readLine());
       for(int i1=0; i1<T; i1++)
       {
           int n=Integer.parseInt(x.readLine());
           int sum=0;
           for(int i=1; i<=n/2; i++)
           {
               if(n%i==0)
                sum=sum+i;
           }
          
           System.out.println(sum== n);

       }
    }
}