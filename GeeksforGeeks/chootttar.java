package GeeksforGeeks;
import java.io.*;
import java.util.*;
public class chootttar {
    public static void main(String []args)
    {
        test();
    }
    static void test()
    {
        int arr1[] = {0, 1, 0, 1, 0, 0, 1, 1, 1, 0};
        int arr2[] = {1, 1, 1, 0, 1, 0, 0, 1, 1, 1, 1};
        int arr3[] = {1, 1, 1, 1, 1, 1, 1};
        int arr4[] = {0, 0, 0, 0, 0, 0, 0};

        System.out.println("Input: ");
        print(arr1);
        driver(arr1);

        System.out.println("Input: ");
        print(arr2);
        driver(arr2);

        System.out.println("Input: ");
        print(arr3);
        driver(arr3);

        System.out.println("Input: ");
        print(arr4);
        driver(arr4);
    }
    static void driver(int []arr)
    {
        int l=0, r=arr.length, pivot=0;
        while(l<r)
        {
            while((l<arr.length)&&(arr[l]<=pivot))++l;

            while((--r>=0)&&(arr[r]>pivot));

            if(l<r)
            swap(arr, l, r);
        }
        print(arr);
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
        System.out.println("output:");
        System.out.println(output);
    }
}
