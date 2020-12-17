package Project_Euler;
import java.io.*;
import java.util.*;
public class Problem30 
{
    static int pow=5;
    static int limit=100000000;
    public static void main(String []args)throws IOException
    {
        long ans=0;
        for(long i=2; i<=limit; i++)
        {
            long n=i;
            long sum=0;
            while(n!=0)
            {
                sum=sum+(long)Math.pow((n%10), pow);
                n=n/10;
                if(sum>i)
                break;
            }
            if(sum==i)
            {
                ans=ans+i;
                System.out.print(i+" ");
            }
        }
        System.out.println("\n"+ans+"\n");
    }    
}
