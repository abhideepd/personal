package Project_Euler;
import java.io.*;
import java.util.*;
public class Problem55 
{
    static ArrayList<Integer> ans=new ArrayList<Integer>();
    public static void main(String []args)throws IOException
    {
        main_function();
        //testing1();
    }
    static void main_function()
    {
        for(int i=1; i<=10000; i++)
        {
            if(check(i))
            ans.add(i);
        }
        System.out.println(ans+" "+ans.size());
    }
    static boolean check(int a)
    {
        String x=a+"";
        for(int i=0; i<50; i++)
        {
            x=String_addition(x);
            if(check_palindrome(x))
            return false;
        }
        return true;
    }
    static void testing1()
    {
        //System.out.println(check_palindrome("4668731596684224866951378664"));
        //System.out.println(String_addition(9999));
        //System.out.println(check(196));
    }
    static boolean check_palindrome(String xx)
    {
        StringBuilder x=new StringBuilder(xx);
        String a=x.toString();
        String b=x.reverse().toString();
        if(a.equals(b))
        return true;
        return false;
    }
    static String String_addition(String aa)
    {
        String ans="";
        String a=aa+"";
        String b=new StringBuilder(a).reverse().toString();
        int carry=0;
        for(int i=a.length()-1; i>=0; i--)
        {
            int temp=Integer.parseInt(a.charAt(i)+"")+Integer.parseInt(b.charAt(i)+"")+carry;
            carry=temp/10;
            ans=temp%10+ans;
        }
        if(carry!=0)
        ans=carry+ans;
        return ans;
    }
}
