package Prepbytes;
import java.io.*;
public class LRGEGCD 
{
    public static void main(String[] args)throws IOException
    {
        BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
        //input no of test cases
        int T=Integer.parseInt(x.readLine());

        for(int i1=0; i1<T; i1++)
        {
            //take user input
            String input[]=(x.readLine()).split(" ");
            long a=Long.parseLong(input[0]);
    //        System.out.println(a);
            String b=input[1];
            long res=0;
            for(int i=0; i<b.length(); i++)
            {
                String temp1=b.charAt(i)+ "";
                int temp2=Integer.parseInt(temp1);
                res=res*10+temp2;
  //              System.out.println("before: "+res);
                res=res%a;
//                System.out.println("after: "+res);
            }
            //System.out.println(res+" "+a);
            System.out.println(gcd(res, a));
        }
    }
    public static long gcd(long a, long b)
    {
        if(a==0)
        return b;
        return gcd(b%a, a);
    }
}