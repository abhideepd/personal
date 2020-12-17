package Project_Euler;
import java.io.*;
import java.util.*;
import java.util.Map.Entry;

public class Problem12 extends common {
    public static void main(String []args)throws IOException
    {
        //common obj=new common();
        for(int i=1; i<20; i++)
        {
            long n=sum(i);
            int ans=prime_fact(n);
            //if(ans>=500)
            //{
                System.out.println(i+" "+n+" ---> "+ans);
                //time();
            //}
        }
    }
    static long sum(long n)
    {
        return n*(n+1)/2;
    }
}
