package Project_Euler;
import java.io.*;
import java.util.*;
public class Problem63 
{
    static int limit=900;
    public static void main(String []args)throws IOException
    {
        answer();
        //testing1();
    }
    static void testing1()
    {
        //System.out.println(multiply("729", 9));
        //System.out.println(power_function(9, 5));
        //System.out.println(check(7, 5));
    }
    static void answer()
    {
        long ans=0;
        for(int no=1; no<limit; no++)
        {
            for(int to_power=1; to_power<limit; to_power++)
            {
                if(check(no, to_power))
                ++ans;
                else
                break;
            }
        }
        System.out.println("Answer: "+ans);
    }
    static boolean check(int no, int to_power)
    {
       String ans=power_function(no, to_power);
       if(ans.length()!=to_power)
       return false;
       return true;
    }
    static String power_function(int no, int to_power)
    {
        String product=no+"";
        for(int i=2; i<=to_power; i++)
        {
            product=multiply(product, no);
        }
        return product;
    }
    static String multiply(String x, int y)
    {
        String ans="";
        int carry=0;
        for(int i=x.length()-1; i>=0; i--)
        {
            int temp=Integer.parseInt(x.charAt(i)+"");
            temp=temp*y+carry;
            carry=temp/10;
            ans=temp%10+ans;
        }
        if(carry!=0)
        ans=carry+ans;
        return ans;
    }
}
