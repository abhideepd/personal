package Project_Euler;
import java.io.*;
import java.util.*;


public class common 
{
    static HashMap<Integer, Integer> arr=new HashMap<Integer, Integer>();
    static int prime_sieve[];
    static int limit=1000;
    static int sum_limit=21;
    public static void main(String []args)throws IOException
    {
        generate_prime();
        //System.out.println(arr);
        prime_sieve=new int[arr.size()];
        store_in_array();
        find_sum();
    }
    static void find_sum()
    {
        int prev=0;
        int i=0;
        ArrayList<Integer> xx=new ArrayList<Integer>();
        int sum=0;
        for(; i<sum_limit; i++)
        {
            sum=sum+prime_sieve[i];
            xx.add(prime_sieve[i]);
        }
        System.out.println(sum+" "+xx);
        for(; i<500; i++)
        {
            xx.remove(0);
            xx.add(prime_sieve[i]);
            sum=sum+prime_sieve[i]-prime_sieve[prev++];
            System.out.println(sum+" "+xx);
        }
    }
    static void store_in_array()
    {
        int k=0;
        for(Map.Entry<Integer, Integer> m:arr.entrySet())
        {
            prime_sieve[k++]=(int)m.getKey();
        }
    }
    static void generate_prime()
    {
        input();
        for(int i=2; i<=limit; i++)
        {
            int j=2;
            while(j*i<=limit)
            {
                arr.remove(j*i);
                ++j;
            }
        }
    }
    static void input()
    {
        for(int i=2; i<limit; i++)
        arr.put(i, 0);
    }
}
