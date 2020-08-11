package Prepbytes;
import java.io.*;
public class FLOOR1 {
    public static void main(String[] args)throws IOException {
        BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
        int T=Integer.parseInt(x.readLine());
        for(int i1=0; i1<T; i1++)
        {
            String input1[]=(x.readLine()).split(" ");
            int size=Integer.parseInt(input1[0]);
            int xx=Integer.parseInt(input1[1]);
            String  input[]=(x.readLine()).split(" ");
            int arr[]=new int[size];
            for(int i=0; i<size; i++)
            {
                arr[i]=Integer.parseInt(input[i]);
            }
            if(arr[0]>xx)
            System.out.println(-1);
            else if(arr[size-1]<xx)
            System.out.println(size-1);
            else{
                System.out.println(search(arr, xx));
            }            
        }
    }
    static int search(int []arr, int x)
    {
        int l=0, r=arr.length;
        while(l<r)
        {
            int m=(l+r)/2;
            if(arr[m]==x)
            return m;
            else if(arr[m]<x)
            l=m+1;
            else
            r=m-1;
        }
        return r;
    }
}