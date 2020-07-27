package Prepbytes;
import java.io.*;
import java.util.*;
public class UNIQUESORT {
    public static void main(String[] args)throws IOException {
        BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
        int T=Integer.parseInt(x.readLine());
        for(int i1=0; i1<T; i1++)
        {
            int size=Integer.parseInt(x.readLine());
            String input[]=(x.readLine()).split(" ");
            int arr[]=new int[size];
            for(int i=0; i<size; i++)
            {
                arr[i]=Integer.parseInt(input[i]);
            }
            System.out.println(answer(arr,arr, arr.length));
        }
    }
    static int answer(int []arr1, int arr2[], int size)
    {
        if((check(arr1, size))||(check(arr2, size)))
        {
            return size;
        }
        size=size/2;
        int left[]=new int[size];
        int right[]=new int[size];
        for(int i=0; i<size; i++)
        {
            left[i]=arr1[i];
        }
        for(int i=size; i<size*2; i++)
        {
            right[i-size]=arr1[i];
        }
        answer(left, right, size);
        for(int i=0; i<size; i++)
        {
            left[i]=arr2[i];
        }
        for(int i=size; i<size*2; i++)
        {
            right[i-size]=arr2[i];
        }
        return answer(left, right, size);
    }
    static boolean check(int []arr, int size)
    {
        for(int i=1; i<size; i++)
        {
            if(arr[i-1]>arr[i])
            return false;
        }
        return true;
    }
}