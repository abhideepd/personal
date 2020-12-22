package Project_Euler;
import java.io.*;
import java.util.*;
public class Problem41 {
    static HashMap<Long, Integer> hm=new HashMap<Long, Integer>();
    static int limit=11; //12
    static int sieve_limit=987654321;
    public static void main(String []args)throws IOException
    {
        create_sieve();
        System.out.println(hm);
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
