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
            System.out.println(func(arr, 0, size));
        }
    }
    static int func(int []arr, int i, int j)
    {
        int flag=0;
        for(int i1=i; i1<j-1; i1++)
        {
            if(arr[i1]>arr[i1+1])
            {
                int temp=(j+j%2)/2;
                func(arr, i, temp);
                func(arr,temp, j);
                flag=1;
                break;
            }
        }
        return (j-i);
    }
}