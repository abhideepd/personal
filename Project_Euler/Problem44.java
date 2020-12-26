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
        long ans=Long.MAX_VALUE;
        for(int i=0; i<limit; i++)
        {
            for(int j=i+1; j<limit; j++)
            {
                long temp_l=sieve.get(i);
                long temp_r=sieve.get(j);
                long temp_sum=temp_l+temp_r;
                long temp_D=temp_r-temp_l;

                if(temp_D>ans)
                break;

                if((sieve.indexOf(temp_sum)!=-1)&&(sieve.indexOf(temp_D)!=-1))
                {
                    ans=Math.min(ans, temp_D);
                    break;
                }
            }
        }
        System.out.println(ans);
    }
    static void generate_pythogonal_nos()
    {
        for(int i=1; i<=limit; i++)
        sieve.add(Pn(i));
    }
    static long Pn(int n)
    {
        long ans = n * ( 3 * n - 1 ) / 2;
        return ans;
    }
}
