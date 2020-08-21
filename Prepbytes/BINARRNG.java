package Prepbytes;
import java.io.*;
import java.util.*;
public class BINARRNG {
    public static void main(String[] args)throws IOException {
        BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
        String input=x.readLine();
        int arr[]=new int[input.length()];
        int total_0=0;
        int total_1=0;//Integer.MIN_VALUE
        for(int i=1; i<input.length(); i++)
        {
            int temp=Integer.parseInt(input.charAt(i)+"");

            if(temp==0)
            ++total_0;

            else if(temp==1)
            ++total_1;

            arr[i]=temp;
        }
        if(total_0==0)
        System.out.println(0);
        else if(total_1==0)
        System.out.println(0);
    }
    static void print(int []arr1, int []arr2, int k)
    {
        for(int i=0; i<=k; i++)
        {
            System.out.println(arr1[i]+" ---> "+arr2[i]);
        }
    }
    static void print(int []arr1, int k)
    {
        for(int i=0; i<=k; i++)
        {
            System.out.println(arr1[i]);
        }
    }
    static void print(int []arr1)
    {
        for(int i=0; i<arr1.length; i++)
        {
            System.out.println(arr1[i]);
        }
    }
}