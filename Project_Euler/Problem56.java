package Project_Euler;
import java.io.*;
import java.util.*;
public class Problem56 
{
    public static void main(String []args)throws IOException
    {
        //testing1();
        main_function();
    }
    static void main_function()
    {
        int ans=0;
        for(int i=2; i<100; i++)
        {
            for(int j=2; j<100; j++)
            {
                ans=Math.max(ans, digit_sum(power(i, j)));
            }
        }
        System.out.println("Answer: "+ans);
    }
    static String power(int a, int b)
    {
        //  i^j ||  a^b
        String ans=a+"";
        for(int i=0; i<b-1; i++)
        {
            ans=multiply(ans, a);
        }
        return ans;
    }
    static void testing1()
    {
        System.out.println(power(9, 9));
    }
    static String multiply(String a, int b)
    {
        String ans="";
        int carry=0;
        for(int i=a.length()-1; i>=0; i--)
        {
            int temp=Integer.parseInt(a.charAt(i)+"");
            temp=temp*b+carry;
            carry=temp/10;
            ans=temp%10+ans;
        }
        if(carry!=0)
        ans=carry+ans;
        return ans;
    }
    static int digit_sum(String a)
    {
        int ans=0;
        for(int i=0; i<a.length(); i++)
        {
            ans=ans+Integer.parseInt(a.charAt(i)+"");
        }
        return ans;
    }
}
