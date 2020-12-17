package Project_Euler;
import java.io.*;
import java.util.*;
public class Problem36 
{
    static int limit=1000000;
    public static void main(String []args)throws IOException
    {
        long ans=0;
        for(int i=1; i<=limit; i++)
        {
            String decimal=i+"";
            if(check_palin(decimal))
            {
                String binary=generate_bin(i);
                if(check_palin(binary))
                {
                    //System.out.println(i+" "+binary);
                    ans=ans+i;
                }
            }
        }
        System.out.println(ans);
    }    
    static String generate_bin(int x)
    {
        String ans="";
        while(x!=0)
        {
            ans=(x%2)+ans;
            x=x/2;
        }
        return ans;
    }
    static boolean check_palin(String x)
    {
        int l=0, r=x.length()-1;
        while(l<r)
        {
            if(x.charAt(l)!=x.charAt(r))
            return false;
            ++l;
            --r;
        }
        return true;
    }
}
