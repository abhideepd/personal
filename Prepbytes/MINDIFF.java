package Prepbytes;
import java.io.*;
import java.util.*;
public class MINDIFF {
    public static void main(String[] args)throws IOException {
        BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
        int T=Integer.parseInt(x.readLine());
        for(int i1=0; i1<T; i1++)
        {
            int N=Integer.parseInt(x.readLine());
            String input[]=(x.readLine()).split(" ");
            int K=Integer.parseInt(x.readLine());
            int arr[]=new int[N];
            for(int i=0; i<N; i++)
            {
                arr[i]=Integer.parseInt(input[i]);
            }
            Arrays.sort(arr);
            System.out.println(mainfunc(arr, K));
        }
    }
    public static long mainfunc(int []arr, int K)
    {
        long min=1000000;
        int size=arr.length;
        for(int i1=0; i1<size-2; i1++)
        {
            int j=size-1;
            int i=i1+1;
            long sum=K-arr[i1];
            while(i<j)
            {
                long temp=arr[i]+arr[j];

                long diff=Math.abs(sum-arr[i]-arr[j]);
                if(min>diff)
                min=diff;

                if(temp==sum)
                {
                    return 0;
                }
                else if(temp<sum)
                ++i;
                else
                --j;
            }
        }
        return min;
    }
}