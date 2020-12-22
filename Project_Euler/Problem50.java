package Project_Euler;
import java.util.*;
import java.io.*;
public class Problem50 
{
    static HashMap<Integer, Integer> prime_sieve=new HashMap<Integer, Integer>();
    static int limit=1000000;
    public static void main(String []args)throws IOException
    {
        generate_sieve();
    }
    static void generate_sieve()
    {
        input();

        for(int i=2; i<=limit; i++)
        {
            int j=2;
            while(i*j<=limit)
            {
                prime_sieve.remove(i*j);
                ++j;
            }
        }

        print_sieve();
    }
    static void print_sieve()
    {
        System.out.println(prime_sieve);
    }
    static void input()
    {
        for(int i=2; i<=limit; i++)
        prime_sieve.put(i, 0);
    }
}
