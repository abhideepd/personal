package Project_Euler;
import java.io.*;
import java.util.*;
public class Problem58 
{
    //static int l=100;
    //static int limit=l*l;
    static int max_int=1000000000;
    static long max_int1=40000*40000;
    static int prime_limit=100000;
    static ArrayList<Integer> diognal_elements;//=new ArrayList<Integer>();
    static ArrayList<Integer> prime=new ArrayList<Integer>();
    public static void main(String []args)throws IOException
    {
        //generate_prime_sieve();
        //generate_diognal_elements();
        System.out.println(max_int1);
        main_function();

        //System.out.println(diognal_elements);
        //System.out.println(prime);
    }
    static void main_function()
    {
        /*for(int i=25000; i<26000; i+=2)
        {
            //diognal_elements=new ArrayList<Integer>();
            //System.out.print(i+" ");
            generate_diognal_elements(i*i);
        }*/
        int l=1, r=40000;
        while(l<=r)
        {
            int mid=(l+r)/2;
            if(generate_diognal_elements((long)mid*mid))
            r=mid-1;
            else
            l=mid+1;
        }
        System.out.println(l+" "+r);
    }
    static boolean generate_diognal_elements(long limit)
    {
        int k=0, flag=0, primee=0, size=0;
        for(long i=1; i<=limit; i+=k)
        {
            //diognal_elements.add(i);
            ++size;
            if(check_prime(i))
            {
                //System.out.println("svgdv");
                ++primee;
            }

            if(flag==0)
            {
                flag=-4;
                k=k+2;
            }
            ++flag;
        }
        double temp=(double)primee/(size);
        if(temp<=0.1)
        {
            System.out.println("Answer: "+limit+"   "+Math.sqrt(limit)+"   "+temp+"   "+primee+"/"+(size));
            return true;
        }
        return false;
        /*int prime=0;
        int i=2;
        diognal_elements.add(1);
        flag=-3;
        while((prime/diognal_elements.size())>0.62)
        {
            diognal_elements.add(i);
            if(flag==0)
            {
                flag=-4;
                k=k+2;
            }
            ++flag;
            ++i;
        }*/
    }
    static boolean check_prime(long x)
    {
        /*if(prime.indexOf(i)!=-1)
        {
            return true;
        }
        return false;*/
        if(x==1)
        return false;
        if(x<3)
        return true;
        for(int i=2; i<=(int)Math.sqrt(x)+1; i++)
        {
            if(x%i==0)
            return false;
        }
        return true;
    }
    static void generate_prime_sieve()
    {
        for(int i=2; i<=prime_limit; i++)
        {
            prime.add(i);
        }

        for(int i=2; i<=prime_limit; i++)
        {
            int j=2;
            if(prime.indexOf(i)!=-1)
            {
                while(i*j<=prime_limit)
                {
                    if(prime.indexOf(i*j)!=-1)
                    prime.remove(prime.indexOf(i*j));
                    ++j;
                }
            }
        }
    }
}
