package Project_Euler;
import java.util.*;
import java.io.*;
public class Problem50 
{
    static HashMap<Integer, Integer> prime_sieve=new HashMap<Integer, Integer>();
    static int limit=2000;
    static int sieve_limit=10000;
    //static int ans_limit=1000000;
    public static void main(String []args)throws IOException
    {
        //limit=1000;
        generate_sieve();
        //print_sieve();
        main_function();
    }
    static void main_function()
    {
        int sum=0;
        int ans=0;
        ArrayList<Integer> arr=new ArrayList<Integer>();
        for(Map.Entry<Integer, Integer> m:prime_sieve.entrySet())
        {
            int temp=(int)m.getKey();

            if(sum+temp<=limit)
            {
                sum=sum+temp;
                arr.add(temp);
            }
            else
            break;

            if(prime_sieve.containsKey(sum))
            {
                //System.out.println(sum+" "+arr);
                ans=sum;
            }
        }
        System.out.println("Answer: "+ans);
        System.out.println(arr);
    }
    static void generate_sieve()
    {
        input();

        for(int i=2; i<=sieve_limit; i++)
        {
            int j=2;
            while(i*j<=sieve_limit)
            {
                prime_sieve.remove(i*j);
                ++j;
            }
        }

        //
    }
    static void print_sieve()
    {
        System.out.println(prime_sieve);
    }
    static void input()
    {
        for(int i=2; i<=sieve_limit; i++)
        prime_sieve.put(i, 0);
    }
}
