package Project_Euler;
import java.io.*;
public class Problem16
{
    static String ans="1";
    public static void main(String []args)throws IOException
    {
        answer(1000);
        long sum=0;
        for(int i=0; i<ans.length(); i++)
        sum=sum+Long.parseLong(ans.charAt(i)+"");
        System.out.println(sum);
    }   
    static void answer(int n)
    {
        for(int i=1; i<=n; i++)
        {
            int carry=0;
            String temp_ans="";
            
            for(int j=ans.length()-1; j>=0; j--)
            {
                int temp=Integer.parseInt(ans.charAt(j)+"") * 2 + carry;
                carry=temp/10;
                temp=temp%10;
                temp_ans=temp+temp_ans;
            }
            if(carry!=0)
            ans=carry+""+temp_ans;
            else
            ans=temp_ans;
            //System.out.println(ans);
        }
        System.out.println("Answer: 2^"+n+" = "+ans);
    } 
}
