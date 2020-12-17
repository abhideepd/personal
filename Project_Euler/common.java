package Project_Euler;
import java.io.*;
import java.util.*;
import java.util.Map.Entry;

public class common {
    common()
    {
        sieve();
    }
        static HashMap<Integer, Integer> arr = new HashMap<Integer, Integer>();
        static int limit = 50000;
    public static void main(String []args)throws IOException
    {
        /*testing*/
        common obj=new common();
        System.out.println(prime_fact(180200));
        /*testing*/
    }

    static int prime_fact(long n)
    {
        int ans=1;
        for(Entry<Integer, Integer> m: arr.entrySet())
        {
            int divisor=m.getKey();
            int temp_ans=0;
            while(n%divisor==0)
            {
                ++temp_ans;
                n=n/divisor;
            }
            ans=ans*(temp_ans+1);
            if(n==1)
            break;
        }
        return ans;
    }
    static void sieve()
    {
        prime();
    }
    static void prime()
    {
        for(int i=2; i<=limit; i++)
        arr.put(i, 0);

        for(int i=2; i<=limit; i++)
        {
            int j=2;
            while(j*i<=limit)
            {
                if(arr.containsKey(j*i))
                arr.remove(j*i);
                ++j;
            }
        }
    }
    static void time()
    {
        
        for(long i=0; i<Long.MAX_VALUE/10000000000L; i++)
        {
            /*for(long j=0; j<Long.MAX_VALUE; j++)
            {
               /* for(int k=0; k<0; k++)
                {
                    
                }
            }*/
        }
    }
}
