package Project_Euler;
import java.io.*;
import java.util.*;
public class Problem44 
{
    static ArrayList<Long> sieve=new ArrayList<Long>();
    static int limit=5000;
    public static void main(String []args)throws IOException
    {
        generate_pythogonal_nos();
        main_function();
    }    
    static void main_function()
    {
        long D=Integer.MAX_VALUE;
        for(int i=0; i<limit; i++)
        {
            for(int j=i+1; j<limit; j++)
            {
                long temp_sum=sieve.get(i)+sieve.get(j);
                long temp_diff=sieve.get(j)-sieve.get(i);
                //System.out.println(temp_diff);
                if((sieve.indexOf(temp_sum)!=-1)&&(sieve.indexOf(temp_diff)!=-1))
                {
                    D=Math.min(D, temp_diff);
                }
            }
        }
        System.out.println("Answer: "+D);
    }
    static void generate_pythogonal_nos()
    {
        for(int i=1; i<=limit; i++)
        sieve.add(Pn(i));
    }
    static long Pn(int n)
    {
        long ans = n * (3 * n - 1) / 2;
        return ans;
    }
}
