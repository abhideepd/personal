package Codeforces;
import java.io.*;
public class prob13 {
    static char arr[];
    static String p;
    public static void main(String []args)throws IOException
    {
        BufferedReader x=new BufferedReader(new InputStreamReader(System.in));

        String t=x.readLine();
        p=x.readLine();
        String order[]=(x.readLine()).split(" ");

        for(int i=0; i<t.length(); i++)
        {
            arr[i]=t.charAt(i);
        }

        int ans=0;

        for(int i=0; i<order.length; i++)
        {
            int temp=Integer.parseInt(order[i]);
            
            if(func(temp)==1)
            ++ans;
            else
            break;
        }

        System.out.println(ans);
    }
    static int func(int x)
    {
        for(int i=0; i<p.length(); i++)
        {
            char temp=p.charAt(i);
        }
    }
}
