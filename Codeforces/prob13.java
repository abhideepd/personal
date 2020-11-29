package Codeforces;
import java.io.*;
public class prob13 {
    static String t;
    static String p;
    static String order[];  //  --permutation
    public static void main(String []args)throws IOException
    {
        BufferedReader x=new BufferedReader(new InputStreamReader(System.in));

        t=x.readLine();
        p=x.readLine();
        order=(x.readLine()).split(" ");        

        int l=0, r=order.length-1;

        while(l<r)
        {
            int mid=(l+r)/2;

            //System.out.println(l+" "+r+" "+mid);

            if(func(mid)==1)
            l=mid+1;
            else
            r=mid;
        }

        System.out.println(l);
    }
    static int func(int x)
    {
        char t_arr[]=t.toCharArray();
        
        for(int i=0; i<=x; i++)
        {
            int temp=Integer.parseInt(order[i]);
            t_arr[temp-1]='-';
        }

        int k=0;

        for(int i=0; i<t_arr.length; i++)
        {
            if(t_arr[i]==p.charAt(k))
            ++k;

            if(k==p.length())
            break;
        }

        if(k==p.length())
        return 1;
        return 0;
    }
}
