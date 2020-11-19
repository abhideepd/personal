package GeeksforGeeks;
import java.io.*;
import java.util.*;
public class quicksort {
    public static void main(String []args)
    {
        ArrayList<String> arr=new ArrayList<String>();
        arr.add("4 3 1 2 6 3 2");
        arr.add("3 2 4 2 5");

        while(arr.size()!=0)
        driver(arr.remove(0));
    }
    static void driver(String inp)
    {
        String input[]=(inp).split(" ");
        int arr[]=new int[input.length];
        for(int i=0; i<arr.length; i++)
        arr[i]=Integer.parseInt(input[i]);

        System.out.print("Input: ");
        print(arr);
        quickie(arr, 0, arr.length-1);
        System.out.print("Output: ");
        print(arr);
    }
    static void quickie(int []arr, int l, int r)
    {
        if(l<r)
        {
            int j=partition(arr, l, r);
            quickie(arr, l, j-1);
            quickie(arr, j+1, r);
        }
    }
    static int partition(int []arr, int l, int r)
    {
        //int i=l, j=r, pivot=arr[l];
        int pivot=arr[l], pivot_index=l;
        while(l<r)
        {
            while((++l<arr.length)&&(arr[l]<=pivot));

            while((r>=0)&&(arr[r]>pivot))--r;

            if(l<r)
            swap(arr, l, r);
        }
        swap(arr, pivot_index, r);
        return r;
    }
    static void swap(int []arr, int a, int b)
    {
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
    static void print(int []arr)
    {
        StringBuilder output=new StringBuilder();
        for(int i=0; i<arr.length; i++)
        output.append(arr[i]+" ");
        System.out.println(output);
    }   
}
