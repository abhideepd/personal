package Codeforces;
import java.io.*;
import java.util.*;
public class prob6 {
    static int ans=0;
    public static void main(String []args)throws IOException
    {
        BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(x.readLine());
        for(int i1=0; i1<t; i1++)
        {
            int size=Integer.parseInt(x.readLine());
            String inp[]=(x.readLine()).split(" ");
            int arr[]=new int[size];
            ans=0;

            for(int i=0; i<size; i++)
            arr[i]=Integer.parseInt(inp[i]);
            
            Arrays.sort(arr);
            int l=0, r=arr.length-1;
            while(l<r)
            {
                if(func(arr, l, r))
                break;
                else
                {
                    l=0;
                    --r;
                }
            }
            //System.out.print("Answer: ");
            System.out.println(ans);
        }
    }
    static boolean func(int []arr, int l, int r)
    {
        int temp=0;
        int diff=arr[r]-arr[l];
        while(l<r)
        {
            ++temp;
            if(diff==(arr[r]-arr[l]))
            {
                ++l;
                --r;
            }
            else
            {
                ans=Math.max(ans, temp);
                return false;
            }
        }
        ans=Math.max(ans, temp);
        return true;
    }
}
