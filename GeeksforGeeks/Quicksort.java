package GeeksforGeeks;
import java.io.*;
import java.util.*;
public class Quicksort {
    public static void main(String []args)throws IOException
    {
        String inp[]=("7 4 3 2 7 4 1 1 9 10").split(" ");
        //String inp[]=("1 2 3 4 5 6 7 8 9 10").split(" ");
        //String inp[]=("10 9 8 7 6 5 4 3 2 1").split(" ");
        //String inp[]=("10 1 9 8 7 5 5 3").split(" ");
        //String inp[]=("1 5 9 7 8 5 10 3").split(" ");
        //String inp[]=("10 1 9 8 7 4 5 3").split(" ");
        //String inp[]=("3 3 3 3 32 2 2 2").split(" ");

        //System.out.println("size: "+inp.length);

        int arr[]=new int[inp.length];

        for(int i=0; i<inp.length; i++)
        arr[i]=Integer.parseInt(inp[i]);

        //arr[arr.length-1]=Integer.MAX_VALUE;

        Quicksort q=new Quicksort();
        q.quicksort(arr, 0, inp.length-1, q);

        // -- print
        q.print(arr);
    }
    void print(int []arr)
    {
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
                //System.out.println("j:---> "+j);
                //q.print(arr);
                quicksort(arr, l, j-1, q);
                quicksort(arr, j+1, r, q);
            }
    }
    int partition(int []arr, int l, int r, Quicksort q)
    {
        int pivot=arr[l];
        int i=l, j=r;
        while(i<j)
        {
            //System.out.println(i+" "+j);
            while((++i<=r)&&(arr[i]<=pivot));

            while((j>l)&&(arr[j]>pivot)&&(--j>-1));

            if(i<j)
            swap(i, j, arr);
        }
        swap(j, l, arr);
        return j;
    }
    void swap(int a, int b, int []arr)
    {
        //System.out.println("a: "+a+" b: "+b);
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
}
