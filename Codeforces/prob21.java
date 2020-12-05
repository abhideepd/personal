package Codeforces;
import java.io.*;
public class prob21 {
    static int n;
    static int k;
    static int arr[];
    public static void main(String []args)throws IOException
    {
        BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
        String n_k[]=(x.readLine().trim()).split(" ");
        n=Integer.parseInt(n_k[0]);
        k=Integer.parseInt(n_k[1]);
        arr=new int[n];
        String inp_arr[]=(x.readLine()).split(" ");

        long sum=0L;
        for(int i=0; i<n; i++)
        {
            arr[i]=Integer.parseInt(inp_arr[i]);
            sum=sum+arr[i];
        }

        long l=0L, r=sum;

        while(l<=r)
        {
            long sm=r-((r-l)/2);
            if(f(sm)==1)
            r=sm-1;
            else
            l=sm+1;
        }

        System.out.println(l);
    }
    static int f(long segment_sum)
    {
        long sum=0L; int segment=1;
        for(int i=0; i<n; i++)
        {
            if((sum+arr[i])>segment_sum)
            {
                if(arr[i]>segment_sum)
                {
                    segment=Integer.MAX_VALUE;
                    break;
                }
                sum=0L;
                ++segment;
            }
            sum=sum+arr[i];
        }

        if(segment<=k)
        return 1;
        else
        return 0;
    }
}
