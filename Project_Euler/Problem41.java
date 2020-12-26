package Project_Euler;
import java.io.*;
import java.util.*;
public class Problem41 
{
    static ArrayList<Long> prime=new ArrayList<Long>();
    static ArrayList<Long> prime_sum=new ArrayList<Long>();
    static int prime_limit=1000000;
    public static void main(String []args)throws IOException
    {
        generate();
    }
    static void generate()
    {
        generate_prime();
        //System.out.println(prime+" "+prime.size());
        generate_prime_sum();
        //System.out.println(prime_sum+" "+prime_sum.size());
        main_function();
    }
    static void main_function()
    {
        long max=prime_sum.get(prime_sum.size()-1);
        int size1=0;
        long ans1=0;
        int size2=0;
        long ans2=0;
        //System.out.println(max);
        for(int i=0; i<prime_sum.size(); i++)
        {
            long temp=max-prime_sum.get(i);
            if(check_prime(temp))
            {
                size1=prime_sum.size()-i-1;
                ans1=temp;
                break;
            }
        }
        for(int i=prime_sum.size()-1; i>=0; i--)
        {
            if(check_prime(prime_sum.get(i)))
            {
                size2=i+1;
                ans2=prime_sum.get(i);
                break;
            }
        }
        System.out.println(size1+" "+ans1+"\n"+ans2+" "+size2);
    }
    static boolean check_prime(long z)
    {
        for(long i=2; i<=(long)Math.sqrt(z)+1; i++)
        {
            if(z%i==0)
            return false;
        }
        return true;
    }
    static void generate_prime()
    {
        int limit_prime=prime_limit/10;
        for(long i=2; i<=limit_prime; i++)
        prime.add(i);

        for(long i=2; i<=limit_prime; i++)
        {
            long j=2;
            if(prime.indexOf(i)!=-1)
            {
                while(i*j<=limit_prime)
                {
                    if(prime.indexOf(i*j)!=-1)
                    prime.remove(prime.indexOf(i*j));
                    ++j;
                }
            }
        }
    }
    static void generate_prime_sum()
    {
        long sum=2;
        int k=1;
        while(sum<=prime_limit)
        {
            prime_sum.add(sum);
            sum=sum+prime.get(k);
            ++k;
        }
    }
}
