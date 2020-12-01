package Codeforces;
import java.io.*;
public class prob20 {
    static int k;
    static int size;
    static int arr[];
    public static void main(String []args)throws IOException
    {
        BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
        k=Integer.parseInt(x.readLine());
        size=Integer.parseInt(x.readLine());
        arr=new int[size];

        for(int i=0; i<size; i++)
        arr[i]=Integer.parseInt(x.readLine());

        long l=1, r=1000000000000L;
                   //5000000000
        while(l<=r)
        {
            long mid=r-((r-l)/2);

            if(f(mid)==1)
            l=mid+1;
            else
            r=mid-1;
        }
        System.out.println(l-1);
    }
    static long f(long x)
    {
        long ans=0, prod=(long)k*(long)x;
        for(int i=0; i<size; i++)
        {
            ans=ans+Math.min(x, arr[i]);
        }
        ///*testing*/System.out.println(x+" "+prod+" "+ans);
        if(ans<prod)
        return 0;
        else
        return 1;
    }
}
