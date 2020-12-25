package Project_Euler;
import java.util.*;
import java.io.*;
public class Problem50 
{
    static HashMap<Integer, Integer> prime_sieve=new HashMap<Integer, Integer>();
    static int limit=10000;
    static int sum_limit=10000;
    static int ans_limit=2000000;
    public static void main(String []args)throws IOException
    {
        generate_prime();
        generate_sum();
    }
    static void generate_sum()
    {
        int sum=0;
        int k=0;
        int ans=0;
        ArrayList<Integer> previous_primes=new ArrayList<Integer>();
        for(Map.Entry<Integer, Integer> m:prime_sieve.entrySet())
        {
            int temp=(int)m.getKey();
            sum=sum+temp;
            if(sum<=ans_limit)
            {
                previous_primes.add(temp);
                ans=sum;
            }
            //System.out.println(++k+" "+sum);
        }
        System.out.print(ans+" "+previous_primes.size());
        System.out.print(" "+previous_primes);
        find_longest_chain_1(previous_primes, ans);
        find_longest_chain_2(previous_primes, ans);
    }
    static void find_longest_chain_1(ArrayList<Integer> a, int s)
    {
        /*while(!prime_sieve.containsKey(s))
        {
            s=s-a.remove(0);
        }*/
        while(!check(s))
        {
            s=s-a.remove(0);
        }
        System.out.println("\nAnswer: "+s+" "+a.size());
    }
    static void find_longest_chain_2(ArrayList<Integer> a, int s)
    {
        /*while(!prime_sieve.containsKey(s))
        {
            s=s-a.remove(0);
        }*/
        while(!check(s))
        {
            s=s-a.remove(a.size()-1);
        }
        System.out.println("\nAnswer: "+s+" "+a.size());
    }
    static boolean check(int x)
    {
        for(int i=(int)Math.sqrt(x)+1; i>=2; i--)
        {
            if(x%i==0)
            return false;
        }
        return true;
    }
    static void generate_prime()
    {
        input();
        for(int i=2; i<=limit; i++)
        {
            if(prime_sieve.containsKey(i))
            {
                int j=2;
                while(i*j<=limit)
                {
                    prime_sieve.remove(i*j);
                    ++j;
                }
            }
        }
    }
    static void input()
    {
        for(int i=2; i<=limit; i++)
        {
            prime_sieve.put(i, 0);
        }
    }
}
