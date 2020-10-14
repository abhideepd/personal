package GeeksforGeeks;
import java.io.*;
import java.util.*;
public class Quicksort {
    public static void main(String []args)throws IOException
    {
        //String inp[]=("7 4 3 2 7 4 1 1 9 10").split(" ");
        String inp[]=("1 2 3 4 5 6 7 8 9 10").split(" ");
        //String inp[]=("10 9 8 7 6 5 4 3 2 1").split(" ");

        int arr[]=new int[inp.length];

        for(int i=0; i<inp.length; i++)
        arr[i]=Integer.parseInt(inp[i]);

        Quicksort q=new Quicksort();
        q.quicksort(arr, 0, arr.length-1, q);

        // -- print
        StringBuilder output=new StringBuilder();
        for(int i=0; i<arr.length; i++)
        output.append(arr[i]+" ");
        System.out.println(output);
    }
    void quicksort(int []arr, int l, int r, Quicksort q)
    {
        if(l<r)
        {
            int j=q.partition(arr, l, r, q);
            quicksort(arr, l, j, q);
            quicksort(arr, j+1, r, q);
        }
    }
    int partition(int []arr, int l, int r, Quicksort q)
    {
        int i=l+1, j=r;
        while(i<j)
        {
            while((i<=r)&&(arr[i]<=arr[l]))
            ++i;

            while((j>l)&&(arr[j]>arr[l]))
            --j;

            if(i<j)
            q.swap(i, j, arr);
        }
        q.swap(j, l, arr);
        return j;
    }
    void swap(int a, int b, int []arr)
    {
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
}
