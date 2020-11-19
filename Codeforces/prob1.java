package Codeforces;
import java.io.*;
public class prob1 {
    public static void main(String []args)throws IOException
    {
        BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
        String inp[]=(x.readLine()).split(" ");
        int n=Integer.parseInt(inp[0]);
        int k=Integer.parseInt(inp[1]);
        int arr[]=new int[n];
        String input[]=(x.readLine()).split(" ");

        for(int i=0; i<n; i++)
        arr[i]=Integer.parseInt(input[i]);

        String search[]=(x.readLine()).split(" ");

        for(int i=0; i<search.length; i++)
        System.out.println(binary(arr, Integer.parseInt(search[i]))==true?"YES":"NO");
    }
    static boolean binary(int []arr, int s)
    {
        int l=0;
        int r=arr.length-1;

        while(l<=r)
        {
            int mid=(l+r)/2;
            if(arr[mid]>s)
            r=mid-1;
            else if(arr[mid]<s)
            l=mid+1;
            else
            return true;
        }
        return false;
    }
}
