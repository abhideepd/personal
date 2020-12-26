package Project_Euler;
import java.io.*;
import java.util.*;
public class Problem47 
{
    static ArrayList<Integer> primes=new ArrayList<Integer>();
    static ArrayList<Integer>  distinct_factors=new ArrayList<Integer>();
    static int limit=1000000;
    static int prime_sieve_limit=10000;
    static int distinct_limit=4;
    public static void main(String []args)throws IOException
    {
        generate();
    }
    static void generate()
    {
        generate_prime();
        //System.out.print(primes);
        generate_prime_factors();
        //System.out.println(distinct_factors.get(644));
        //System.out.println(distinct_factors.get(645));
        //System.out.println(distinct_factors.get(646));
        main_function();
    }
    static void main_function()
    {
        int flag=0;
        ArrayList<Integer> ans=new ArrayList<Integer>();
        int k=0;
        for(int i=0; i<=limit; i++)
        {
            if(distinct_factors.get(i)==distinct_limit)
            {
                ++flag;
                ans.add(i);
                continue;
            }
            if(flag==distinct_limit)
            break;
            flag=0;
            ans=new ArrayList<Integer>();
        }
        System.out.println(ans);
    }
    static void generate_prime_factors()
    {
        distinct_factors.add(0);
        distinct_factors.add(0);
        for(int i=2; i<=limit; i++)
        {
            if(primes.indexOf(i)!=-1)
            {
                distinct_factors.add(0);
                continue;
            }
            int temp=(i/2)+1;
            int temp_k=0;
            int temp_no_of_factors=0;
            while((temp_k<primes.size())&&((primes.get(temp_k)*2)<temp))
            {
                if(i%primes.get(temp_k)==0)
                ++temp_no_of_factors;
                ++temp_k;
            }
            distinct_factors.add(temp_no_of_factors);
        }
    }
    static void generate_prime()
    {
        for(int i=2; i<=prime_sieve_limit; i++)
        primes.add(i);

        for(int i=2; i<=prime_sieve_limit; i++)
        {
            int j=2;
            if(primes.indexOf(i)!=-1)
            {
                while(j*i<=prime_sieve_limit)
                {
                    if(primes.indexOf(i*j)!=-1)
                    primes.remove(primes.indexOf(i*j));
                    ++j;
                }
            }
        }
    }
}
