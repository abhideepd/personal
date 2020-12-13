package Codeforces;
import java.io.*;
public class max_avg_segment {
    static int n;
    static int d;
    static int arr[];
    static int sum_arr[];
    public static void main(String args[])throws IOException
    {
        BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
        String n_d[]=(x.readLine()).split(" ");
        n=Integer.parseInt(n_d[0]);
        d=Integer.parseInt(n_d[1]);
        arr=new int[n];
        sum_arr=new int[n];
        int sum=0;
        String input[]=(x.readLine()).split(" ");
        for(int i=0; i<n; i++)
        {
            arr[i]=Integer.parseInt(input[i]);
            sum=sum+arr[i];
            sum_arr[i]=sum;
        }
        int l=0, r=200;

        while(l<=r)
        {
            int m=(l+r)/2;
            if(f(m)==1)
            l=m+1;
            else
            r=m-1;
        }
        System.out.println(l);
    }
    public static int f(int x)
    {
        
        /*testing*/ return 1;
    }
}
