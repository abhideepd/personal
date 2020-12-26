package Testing;
import java.util.*;
import java.io.*;
public class euler1 {
    public static void main(String []args)throws IOException
    {
        //System.out.println(f(10));
        long lim=10000000000L;
        lim=Integer.MAX_VALUE;
       for(long i=0; i<=lim; i++)
       {

       }
       System.out.println("edcd");
    }
    static long f(long n)
    {
        long ans=(n*(n+1)*(2*n+1))/6;
        return ans;
    }
}
