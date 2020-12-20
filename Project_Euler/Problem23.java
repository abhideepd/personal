package Project_Euler;
import java.io.*;
import java.util.*;
import java.util.Map.Entry;

public class Problem23 
{
    static ArrayList<Integer> abundant_nos=new ArrayList<Integer>(); 
    static int limit=28123;    //28123
    static boolean abundant_sum[];

    public static void main(String[] args) throws IOException 
    {
        abundant_sum=new boolean[limit+1];
        find_abundant_nos();
        find_all_abundant_sum();
        //testing1();
        //testing2();
        find_sum_all_non_abundant_nos();
    }
    static void find_sum_all_non_abundant_nos()
    {
        long sum=0;
        for(int i=0; i<limit+1; i++)
        {
            if(abundant_sum[i]==false)
            sum=sum+i;;
        }
        System.out.println(sum);
    }
    static void testing2()
    {
        for(int i=0; i<50; i++)
        {
            if(abundant_sum[i]==true)
            System.out.println(i);
        }
    }
    static void find_all_abundant_sum()
    {
        for(int i=0; i<abundant_nos.size(); i++)
        {
            for(int j=i; j<abundant_nos.size(); j++)
            {
                int sum=abundant_nos.get(i)+abundant_nos.get(j);
                if(sum>limit)
                break;
                abundant_sum[sum]=true;
            }
        }
    }
    static void testing1()
    {
        int a=0;
        while(a!=abundant_nos.size())
        System.out.println(abundant_nos.get(a++));
    }
    static void find_abundant_nos()
    {
        for(int i=1; i<=limit; i++)
        {
            if(abundant(i))
            abundant_nos.add(i);
        }
    }
    static boolean abundant(int x)
    {
        int sum=0;
        for(int i=1; i<((x/2)+1); i++)
        {
            if(x%i==0)
            sum=sum+i;
        }
        if(sum>x)
        return true;
        return false;
    }
}
