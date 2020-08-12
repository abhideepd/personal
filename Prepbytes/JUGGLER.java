package Prepbytes;
import java.io.*;
public class JUGGLER {
    public static void main(String[] args)throws IOException {
         BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
        int T=Integer.parseInt(x.readLine());
        for(int i1=0; i1<T; i1++)
        {
            int n=Integer.parseInt(x.readLine());
            while(n!=1)
            {
                System.out.print(n+" ");
                if(n%2!=0)
                n=(int)(Math.sqrt(n)*Math.sqrt(n)*Math.sqrt(n));
                else
                n=(int)Math.sqrt(n);

                
            }
            System.out.println(n);
        }
    }
}