package Codeforces.Contests.Round674;
import java.io.*;
import java.util.*;
public class C {
    public static void main(String []args)throws IOException
    {
        BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(x.readLine());

        for(int i1=0; i1<t; i1++)
        {
            int n=Integer.parseInt(x.readLine());
            int a=(int)Math.sqrt(n);
            int ans=Integer.MAX_VALUE;
            
            if(n<25)
            {
                for(int i=1; i*i<=n ; i++)
                {
                    int temp=(i-1)+((int)(Math.ceil((double)n/(double)i))-1);
                    ans=Math.min(ans, temp);
                }
                System.out.println(ans);
            }
            else
            {
                for(int i=a-5; i<=a+5 ; i++)
                {
                    int temp=(i-1)+((int)(Math.ceil((double)n/(double)i))-1);
                    ans=Math.min(ans, temp);
                }
                System.out.println(ans);
            }
        }
    }
}
