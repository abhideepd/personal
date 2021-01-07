package Project_Euler;
import java.io.*;
import java.util.*;
public class Problem60 
{
    static ArrayList<Integer> prime_sieve=new ArrayList<Integer>();
    static HashMap<Long, Integer> is_primes=new HashMap<Long, Integer>();
    static HashMap<Long, Integer> non_primes=new HashMap<Long, Integer>();
    static int sieve_limit=30000;
    public static void main(String []args)throws IOException
    {
        generate_sieve();
        remove_two_and_five();
        answer_function();
        //testing1();
    }
    static void testing1()
    {
        int prime_i=0, prime_j=0, prime_k=0, prime_l=0, prime_m=0;
        for(int i=0; i<prime_sieve.size(); i++)
        {
            prime_i=prime_sieve.get(i);
            for(int j=i+1; j<prime_sieve.size(); j++)
            {   
                prime_j=prime_sieve.get(j);             
                if(!check(prime_i, prime_j))
                continue;

                //System.out.println(prime_i+" "+prime_j+" "+j);

                for(int k=j+1; k<prime_sieve.size(); k++)
                {
                    prime_k=prime_sieve.get(k);
                    if(!check(prime_i, prime_k))
                    continue;

                    if(!check(prime_j, prime_k))
                    continue;

                    for(int l=k+1; l<prime_sieve.size(); l++)
                    {
                        prime_l=prime_sieve.get(l);
                        if(!check(prime_i, prime_l))
                        continue;

                        //System.out.println(prime_i+" "+prime_j+" "+prime_k+" "+prime_l);

                        if(!check(prime_j, prime_l))
                        continue;

                        //System.out.println(prime_i+" "+prime_j+" "+prime_k+" "+prime_l);

                        if(!check(prime_k, prime_l))
                        continue;
                            
                        System.out.println("Answer: "+prime_i+" "+prime_j+" "+prime_k+" "+prime_l);
                        //break;
                    }
                }
            }
        }        
    }
    static void remove_two_and_five()
    {
        prime_sieve.remove(prime_sieve.indexOf(2));
        prime_sieve.remove(prime_sieve.indexOf(5));
    }
    static void answer_function()
    {
        int prime_i=0, prime_j=0, prime_k=0, prime_l=0, prime_m=0;
        for(int i=0; i<prime_sieve.size(); i++)
        {
            prime_i=prime_sieve.get(i);
            for(int j=i+1; j<prime_sieve.size(); j++)
            {
                prime_j=prime_sieve.get(j);    

                if(!check(prime_i, prime_j))
                continue;

                //System.out.println(prime_i+" "+prime_j);

                for(int k=j+1; k<prime_sieve.size(); k++)
                {
                    prime_k=prime_sieve.get(k);

                    if(!check(prime_i, prime_k))
                    continue;

                    if(!check(prime_j, prime_k))
                    continue;

                    for(int l=k+1; l<prime_sieve.size(); l++)
                    {
                        prime_l=prime_sieve.get(l);
                        if(!check(prime_i, prime_l))
                        continue;

                        if(!check(prime_j, prime_l))
                        continue;

                        if(!check(prime_k, prime_l))
                        continue;

                        for(int m=l+1; m<prime_sieve.size(); m++)
                        {
                            prime_m=prime_sieve.get(m);
                            if(!check(prime_i, prime_m))
                            continue;

                            if(!check(prime_j, prime_m))
                            continue;

                            if(!check(prime_k, prime_m))
                            continue;

                            if(!check(prime_l, prime_m))
                            continue;

                            System.out.println(prime_i+" "+prime_j+" "+prime_k+" "+prime_l+" "+prime_m+" --sum--> "+(prime_i+prime_j+prime_k+prime_l+prime_m));
                            //break;
                        }
                    }
                }
            }
        }
    }
    static boolean check(int a, int b)
    {
        if(b==-1)
        return false;

        long no1=Long.parseLong(a+""+b);
        long no2=Long.parseLong(b+""+a);

        if(is_prime(no1))
        {
            if(is_prime(no2))
            {
                is_primes.put(no1, 0);
                is_primes.put(no2, 0);
                return true;
            }
            else
            {
                non_primes.put(no2, 0);
                return false;
            }
        }
        else
        {
            non_primes.put(no1, 0);
            return false;
        }
    }
    static boolean is_prime(long n)
    {
        if(is_primes.containsKey(n))
        return true;

        if(non_primes.containsKey(n))
        return false;

        for(long i=(long)Math.sqrt(n)+1L; i>=2; i--)
        {
            if(n%i==0)
            return false;
        }
        return true;
    }
    static void generate_sieve()
    {
        for(int i=2; i<sieve_limit; i++)
        prime_sieve.add(i);

        for(int i=2; i<sieve_limit; i++)
        {
            int j=2;
            if(prime_sieve.indexOf(i)!=-1)
            {
                while(i*j<=sieve_limit)
                {
                    if(prime_sieve.indexOf(i*j)!=-1)
                    prime_sieve.remove(prime_sieve.indexOf(i*j));
                    ++j;
                }
            }
        }
    }
}