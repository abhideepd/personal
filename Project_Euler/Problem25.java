package Project_Euler;
import java.io.*;
import java.util.*;
public class Problem25 
{
    public static void main(String []args)throws IOException
    {
        String a="1";
        String b="1";
        String c="";
        //System.out.println(1+" "+a);
        //System.out.println(2+" "+b);
        int ans=2;
        while(c.length()<1000)
        {
            c=add(a, b);
            ++ans;
            System.out.println(ans+" "+c+" "+c.length());
            a=b;
            b=c;
            //++ans;
        }
        System.out.println(ans);
    }
    static String add(String a, String b)
    {
        String ans="";
        int carry=0;
        for(int i=0; i<Math.max(a.length(), b.length()); i++)
        {
            int a_pos=a.length()-i-1;
            int b_pos=b.length()-i-1;
            int a_val=0, b_val=0;
            if(a_pos>=0)
            {
                a_val=Integer.parseInt(a.charAt(a_pos)+"");                
            }
            if(b_pos>=0)
            {
                b_val=Integer.parseInt(b.charAt(b_pos)+"");
            }
            int sum=a_val+b_val+carry;
            carry=sum/10;
            ans=(sum%10)+ans;
        }
        if(carry!=0)
        ans=carry+ans;
        return ans;
    }
}
