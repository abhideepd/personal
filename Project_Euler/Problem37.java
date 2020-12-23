package Project_Euler;
import java.io.*;
import java.util.*;
public class Problem37 
{
    static HashMap<Long, Integer> hm=new HashMap<Long, Integer>();
    static int limit=11; //12
    static long sieve_limit=1000000;

    //  Sum=748317
    public static void main(String []args)throws IOException
    {
        create_sieve();
        //testing1();
        generate_primes();
    }
    static void testing2()
    {
        int arr[]={23, 37, 53, 73, 313, 317, 373, 797, 3137, 3797, 739397};
        int n=739397;
    }
    static void testing1()
    {
        int n=739397;
        for(int i=1; i<=9; i++)
        {
            //System.out.println(i*1000000+n);
            Hydra(i*1000000+n);
        }
    }
    static void Hydra(int n)
    {
        System.out.println(right_half(n)&left_half(n));
    }
    static void sum(ArrayList<Long> arr)
    {
        long sum=0;
        for(long i : arr)
        sum=sum+i;
        System.out.println("Sum: "+sum);
    }
    static boolean left_half(long x)
    {
        while(x!=0)
        {
            if(!hm.containsKey(x))
            return false;
            x=x/10;
        }
        return true;
    }
    static boolean right_half(long x)
    {
        long s=0;
        int p=1;
        while(x!=0)
        {
            s=s+(x%10)*p;
            p=p*10;
            x=x/10;
            //System.out.println(s);
            if(!hm.containsKey(s))
            return false;
        }
        return true;
    }
    static void generate_primes()
    {
        long k=10;
        ArrayList<Long> arr=new ArrayList<Long>();
        while(arr.size()<limit)
        {
            //System.out.println(k);
            if(hm.containsKey(k))
            {
                if((left_half(k))&&(right_half(k)))
                arr.add(k);
            }
            ++k;
            //System.out.println(k);
        }
        System.out.println(arr+" k:"+k);
        sum(arr);
    }
    static void create_sieve()
    {
        input();

        for(long i=2; i<=sieve_limit; i++)
        {
            long j=2;
            while(j*i<=sieve_limit)
            {
                hm.remove(j*i);
                ++j;
            }
        }
        //print_sieve();
    }

    static void print_sieve()
    {
        System.out.println(hm);
    }

    static void input()
    {
        for(long i=2; i<=sieve_limit; i++)
        hm.put(i, 0);
    }

}