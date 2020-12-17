package Project_Euler;
import java.util.*;
import java.io.*;
public class Problem21 extends common
{
    static boolean check[]=new boolean[11000];
    public static void main(String []args)throws IOException
    {
        BufferedReader inp=new BufferedReader(new InputStreamReader(System.in));
        int ans_sum=0;
        for(int i=1; i<10000; i++)
        {
            if(check(i))
            {
                System.out.println(i);
                ans_sum=ans_sum+i;
            }
        }
        System.out.println(ans_sum);
    }
    static boolean check(int n)//280
    {
        int a=factor_sum(n);//284
        int b=factor_sum(a);//280
        if(a==b)
        return false;
        if((n==b)&&(check[n]!=true))
        {
            //check[n]=true;
            //check[a]=true;
            return true;
        }
        else
        return false;
    }
    static int factor_sum(int n)
    {
        int sum=0;
        for(int i=1; i<=((n/2)+1); i++)
        {
            if(n%i==0)
            sum=sum+i;
        }
        return sum;
    }
}
