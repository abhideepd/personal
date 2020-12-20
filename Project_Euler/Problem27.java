package Project_Euler;
import java.io.*;
import java.util.*;
public class Problem27 
{
    static HashMap<Integer, Integer> hm=new HashMap<Integer, Integer>();
    static int limit=50000;
    public static void main(String []args)throws IOException
    {
        generate_prime_sieve();
        //System.out.println(hm);
        find_coefficients();
    }
    static void find_coefficients()
    {
        int max=0;
        //int a_ans=0, b_ans=0;
        int ans=0;
        for(int a=-1000; a<1000; a+=1)
        {
            for(int b=-1000; b<1000; b+=1)
            {
                int n=0;
                while(is_prime(a, b, n++));
                if(n>max)
                {
                    ans=a*b;
                    max=n;
                }
            }
        }
        System.out.println(ans);
    }
    static void generate_prime_sieve()
    {
        initial_input();

        for(int i=2; i<limit; i++)
        {
            int j=2;
            while(j*i<=limit)
            {
                hm.remove(j*i);
                ++j;
            }
        }
    }
    static void initial_input()
    {
        for(int i=2; i<limit; i++)
        {
            hm.put(i, 0);
        }
    }
    static boolean is_prime(int a, int b, int n)
    {
        int ans=(n*n)+(a*n)+b;
        if(hm.containsKey(ans))
        return true;
        return false;
    }
}
