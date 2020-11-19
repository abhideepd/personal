package Codeforces;
import java.io.*;
public class prob3 {
    public static void main(String []args)throws IOException
    {
        BufferedReader x=new BufferedReader(new InputStreamReader(System.in));

        int n=Integer.parseInt(x.readLine());
        int arr[]=new int[n];
        String input[]=(x.readLine()).split(" ");

        for(int i=0; i<n; i++)
        arr[i]=Integer.parseInt(input[i]);

        int k=Integer.parseInt(x.readLine());

        for(int i=0; i<k; i++)
        {
            String lr[]=(x.readLine()).split(" ");
            int l=Integer.parseInt(lr[0]);
            int r=Integer.parseInt(lr[1]);

            System.out.print((binary_right(arr, r)-binary_left(arr, l))+" ");
        }
        //System.out.println(binary(arr, Integer.parseInt(search[i])));
    }
    static int binary_right(int []arr, int s)
    {
        int l=0;
        int r=arr.length-1;

        if(s>arr[arr.length-1])
        return arr.length+1;

        while(l<=r)
        {
            int mid=(l+r)/2;
            if(arr[mid]>=s)
            r=mid-1;
            else if(arr[mid]<s)
            l=mid+1;
        }
        return l+1;
    }
    static int binary_left(int []arr, int s)
    {
        int l=0;
        int r=arr.length-1;

        if(s<arr[0])
        return 0;

        while(l<=r)
        {
            int mid=(l+r)/2;
            if(arr[mid]>s)
            r=mid-1;
            else if(arr[mid]<=s)
            l=mid+1;
        }
        return l;
    }
}
