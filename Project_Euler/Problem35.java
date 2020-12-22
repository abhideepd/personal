package Project_Euler;

import java.io.*;
import java.util.*;
public class Problem35 
{
    static HashMap<Integer, Integer> hm=new HashMap<Integer, Integer>();
    static int limit=1000000;
    static int sieve_limit=1000000;
    static ArrayList<Integer> arr;
    public static void main(String []args)
    {
        //testing2();
        create_sieve();
        //testing1();
        generate_circular_prime();
    } 
    static void testing2()
    {
        int n=2;
        n=rotate(n);
        p(n);
        n=rotate(n);
        p(n);
        n=rotate(n);
        p(n);
        System.exit(0);
    }
    static void p(int x)
    {
        System.out.println(x);
    }
    static void generate_circular_prime()
    {
        int ans=0;
        for(int i=0; i<=limit; i++)
        {
            if(hm.containsKey(i))
            {
                if(check_prime(i))
                ++ans;
            }
        }
        System.out.println(ans);
    }
    static boolean check_prime(int x)
    {
        int n=rotate(x);
        while(n!=x)
        {            
            if(!hm.containsKey(n))
            return false;
            n=rotate(n);
        }
        return true;

    }
    static int rotate(int x)
    {
        int temp1=x%10;
        x=x/10;
        int temp=temp1*(int)Math.pow(10, length(x))+x;
        //p(temp1);
        //p(x);
        //p(temp);
        return temp;
    }
    static void testing1()
    {
        limit=100;
    }
    static int length(int x)
    {
        int ans=0;
        while(x!=0)
        {
            ++ans;
            x=x/10;
        }
        return ans;
    }
    static void create_sieve()
    {
        input();

        for(int i=2; i<=sieve_limit; i++)
        {
            int j=2;
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
        for(int i=2; i<=sieve_limit; i++)
        hm.put(i, 0);
    }

}
