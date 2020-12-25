package Project_Euler;
import java.util.*;
import java.io.*;
public class Problem48 
{
    static int ans_limit=10;
    static long mod=10000000000L;
    public static void main(String []args)throws IOException
    {
        //testing1();
        //main_function();
        main_function_1();
    } 
    static void main_function_1()
    {
        long ans=0;
        for(int i=1; i<=1000; i++)
        {
            ans=(ans+pow(i))%mod;
        }
        System.out.println(ans);
    }
    static long pow(int i)
    {
        long ans=1;
        for(int x=0; x<i; x++)
        {
            ans=(ans*i)%mod;
        }
        return ans%mod;
    }
    static void testing1()
    {
        System.out.println(generate_power(1000));
        //System.out.println(generate_sum("7893", "3857539"));
    }
    static void main_function()
    {
        String ans="";
        for(int i=1; i<=1000; i++)
        {
            ans=generate_series(ans, i);
            if(ans.length()>ans_limit)
            ans=ans.substring(ans.length()-ans_limit, ans.length());
        }
        System.out.println(ans);
        //print(ans);
    }
    static void print(String a)
    {
        System.out.println(a.substring(a.length()-10,a.length()));
    }
    static String generate_series(String a, int b)
    {
        String pow=generate_power(b);
        String ans=generate_sum(a, pow);
        return ans;
    }
    static String generate_sum(String a, String b)
    {
        String ans="";
        int i=0;
        int carry=0;
        for(i=0; i<Math.min(a.length(), b.length()); i++)
        {
            int temp = Integer.parseInt(a.charAt(a.length()-1-i)+"") + Integer.parseInt(b.charAt(b.length()-1-i)+"");
            temp = temp + carry;
            carry = temp / 10;
            ans = temp % 10 + ans;
        }
        if((a.length()>b.length()))
        {
            for(int j=a.length()-i-1; j>=0; j--)
            {
                int temp=Integer.parseInt(a.charAt(j)+"");
                temp=temp+carry;
                carry=temp/10;
                ans=temp%10+ans;
            }
        }
        if((b.length()>a.length()))
        {
            for(int j=b.length()-i-1; j>=0; j--)
            {
                int temp=Integer.parseInt(b.charAt(j)+"");
                temp=temp+carry;
                carry=temp/10;
                ans=temp%10+ans;
            }
        }
        if(carry!=0)
        ans=carry+ans;
        return ans;
    }
    static String generate_power(int x)
    {
        String ans="1";
        for(int i=0; i<x; i++)
        {
            int carry=0;
            String temp_ans="";
            for(int j=ans.length()-1; j>=0; j--)
            {
                int temp=Integer.parseInt(ans.charAt(j)+"");
                temp=temp*x;
                if(carry!=0)
                temp=temp+carry;
                carry=temp/10;
                temp_ans=temp%10+temp_ans;
                //if(temp_ans.length()==12)
                //break;
            }
            if((carry!=0))
            temp_ans=carry+temp_ans;
            ans=temp_ans;
        }
        return ans;
    }
}
