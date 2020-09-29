package Codeforces.Contests.Round674;
import java.io.*;
public class A {
    public static void main(String []args)throws IOException
    {
        BufferedReader xx=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(xx.readLine());
        for(int i1=0; i1<t; i1++)
        {
            String input[]=(xx.readLine()).split(" ");
            double n=Integer.parseInt(input[0]);
            double x=Integer.parseInt(input[1]);
            int ans=0;
            if(n>2)
            {
                ans=(int)Math.ceil((n-2)/x);
            }
            System.out.println(ans+1);
        }
    }
}
