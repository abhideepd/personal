package Codeforces;
import java.io.*;
import java.util.*;
public class prob10 {
    public static void main(String []args)throws IOException
    {
        BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
        int size=Integer.parseInt(x.readLine());
        String inp[]=(x.readLine()).split(" ");
        int arr[]=new int[size];

        for(int i=0; i<size; i++)
        {
            arr[i]=Integer.parseInt(inp[i]);
        }

        Arrays.sort(arr);

        int query=Integer.parseInt(x.readLine());
        for(int i=0; i<query; i++)
        {
            String input[]=(x.readLine()).split(" ");
            int l=Integer.parseInt(input[0]);
            int r=Integer.parseInt(input[1]);

            int lower_bound=0, upper_bound=0;

            lower_bound=lower_b(l, arr);
            upper_bound=upper_b(r, arr);

            //System.out.print("Answer: ");
            System.out.print(upper_bound-lower_bound+" ");
        }
    }
    static int lower_b(int key, int arr[])
    {
        int l=0, r=arr.length-1;

        //if(key<=arr[l])
        //return 0;

        if(key>arr[r])
        return arr.length;

        while(l<r)
        {
            int mid=(l+r)/2;
            if(key>arr[mid])
            l=mid+1;
            else
            r=mid;
        }
        return l;
    }
    static int upper_b(int key, int arr[])
    {
        int l=0, r=arr.length-1;

        //if(key<=arr[l])
        //return 0;

        if(key>=arr[r])
        return arr.length;

        while(l<r)
        {
            int mid=(l+r)/2;
            if(arr[mid]>key)
            r=mid;
            else
            l=mid+1;
        }
        return l;
    }
}
