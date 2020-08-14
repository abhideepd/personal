package Prepbytes;
import java.io.*;
public class JUGGLER {
    public static void main(String[] args)throws IOException {
         BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
        int T=Integer.parseInt(x.readLine());
        for(int i1=0; i1<T; i1++)
        {
            long n=Long.parseLong(x.readLine());
            //long n1=n;
            while(n!=1)
            {
                //long temp=0;
                System.out.print(n+" ");
                if(n%2!=0)
                n=(long)(Math.sqrt(n)*Math.sqrt(n)*Math.sqrt(n));
                else
                n=(long)Math.sqrt(n);  
                //n=temp;        
            }
            System.out.println(n);
            //Sorcerer(n);
        }
    }
    static void Sorcerer(long n)
    {
        long a = n;
       System.out.print((long)a+" ");
       while (a != 1)
       {
          long b = 0;
          if (a%2 == 0)
                b  = (long)(Math.sqrt(a));
          else
                b =(long) (Math.sqrt(a) * Math.sqrt(a) * Math.sqrt(a));
          System.out.print( b+" ");
          a = b;
        }
    }
}