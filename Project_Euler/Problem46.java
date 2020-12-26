package Project_Euler;
import java.io.*;
import java.util.*;
public class Problem46 
{
    static ArrayList<Long> square=new ArrayList<Long>();
    static ArrayList<Long> prime=new ArrayList<Long>();
    static ArrayList<Long>composite=new ArrayList<Long>();
    static int limit=10000;
    public static void main(String []args)throws IOException
    {
        generate();
        main_function();
        //testing1();
    }
    static void testing1()
    {
        System.out.println(check(21));
    }
    static void main_function()
    {
        for(long i:composite)
        {
            if(check(i)==false)
            {
                System.out.println("Answer: "+i);
                break;
            }
        }
    }
    static boolean check(long x)
    {
        boolean j=true;
        int k=0;
        while(j)
        {
            long s = x - 2 * square.get(k++);

            if(s<=0)
            break;

            if(prime.indexOf(s)!=-1)
            return true;
        }
        return false;
    }
    static void generate()
    {
        generate_squares();
        generate_prime();
        generate_composite();
        //System.out.println(composite);
    }
    static void generate_composite()
    {
        for(long i=3; i<=limit; i+=2)
        {
            if(prime.indexOf(i)==-1)
            composite.add(i);
        }
    }
    static void generate_squares()
    {
        for(long i=1; i<=limit; i++)
        square.add(i*i);
    }
    static void generate_prime()
    {
        for(long i=2; i<=limit; i++)
        prime.add(i);

        for(long i=2; i<=limit; i++)
        {
            long j=2;
            if(prime.indexOf(i)!=-1)
            {
                while(i*j<=limit)
                {
                    if(prime.indexOf(i*j)!=-1)
                    prime.remove(prime.indexOf(i*j));
                    ++j;
                }
            }
        }
    }
}
