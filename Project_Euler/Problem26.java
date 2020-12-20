package Project_Euler;
import java.io.*;
import java.util.*;
public class Problem26 
{
    static String no="";
    static int decimal_generation_limit=1500;
    static int no_check_limit=1000;
    public static void main(String []args)throws IOException
    {
        //testing1(); 
        find_max();       
    }
    static void find_max()
    {
        int max=0;
        int ans=0;
        for(int i=2; i<no_check_limit; i++)
        {
            no="";
            boolean temp_divisibility_flag=generate_decimal(i);
            if(temp_divisibility_flag)
            {
                int temp_recurrence=find_pattern();
                int temp=decimal_generation_limit-temp_recurrence;
                if((temp>max)&&(temp<1000))
                {
                    max=temp;
                    ans=i;
                }
            }
        }
        System.out.println("Answer: "+ans+"  no. of decimal places:"+max);
    }
    static void testing1()
    {
        decimal_generation_limit=135;
        int t=7;     //131;
        generate_decimal(t);
        System.out.println(no+" ");
        int ans=find_pattern();
        System.out.println("Answer:- "+ans+" "+(decimal_generation_limit-ans));
    }
    static boolean generate_decimal(int x)
    {
        int c=0;
        int t=10;
        //if(x%2==0)
        //return false;
        while(c<decimal_generation_limit)
        {            
            ++c;
            if(t==0)
            return false;
            if(t<x)
            {
                t=t*10;
                no=no+'0';
            }
            else
            {
                no=no+(t/x);
                t=t%x;
                t=t*10;
            }
        }
        return true;
    }
    static int find_pattern()
    {
        int max=0;
        int k=0;
        //int arr[]=new int[decimal_generation_limit];
        for(int i=1; i<decimal_generation_limit; i++)
        {
            char temp1=no.charAt(k);
            char temp2=no.charAt(i);

            if(temp1==temp2)
            {
                ++k;
            }
            else
            {
                if(temp2==no.charAt(0))
                k=1;
                else
                k=0;
            }
            max=Math.max(max, k);
        }
        //System.out.println(max);
        //if(max==decimal_generation_limit)
        //return -1;
        //else
        return max;
    }
}