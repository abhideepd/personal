package GeeksforGeeks;
import java.io.*;
import java.util.*;
public class shuffle_Array {
    static long arr[];
    public static void main(String []args)throws IOException
    {
        BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
        String input[]=(x.readLine()).split(" ");
        int size=input.length;
        arr=new long[size];
        for(int i=0; i<size; i++)
        {
            arr[i]=Long.parseLong(input[i]);
        }
        shuffleArray(arr, size);
        print();
    }
    static void print()
    {
        for(int i=0; i<arr.length; i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    static void shuffleArray(long and[], int n)
    {
        // Your code goes here
        func(0, n-1);
    }
    static void func(int l, int r)
    {
        if(l==r)
        return;

        if((r-l)==1)
        return;

        int mid=(l+r)/2;
        int mid_l=(l+mid)/2;
        int k=mid+1;
        //int mid_r=(mid+1+r)/2;

        for(int i=mid_l+1; i<=mid; i++)
        {
            long temp=arr[i];
            arr[i]=arr[k];
            arr[k]=temp;
            ++k;
        }
        func(l, mid);
        func(mid+1, r);
    }
}
