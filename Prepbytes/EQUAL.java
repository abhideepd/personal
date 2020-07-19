package Prepbytes;
import java.io.*;
import java.util.*;
public class EQUAL {
    public static void main(String[] args)throws IOException {
        BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
        String input1[]=(x.readLine()).split(" ");
        int N=Integer.parseInt(input1[0]);
        int K=Integer.parseInt(input1[1]);
        String input2[]=(x.readLine()).split(" ");
        int arr[]=new int[N];
        for(int i=0; i<N; i++)
        arr[i]=Integer.parseInt(input2[i]);

        int counter=1;
        int result=0;
        Arrays.sort(arr);
        int min=0, max=arr.length-1;
        
        while(counter!=0)
        {
            min=min(arr, min);
            max=max(arr, max);
            //System.out.println(min+" "+max);

            int diff=arr[max]-arr[min];

            if(diff<=K)
            counter=0;
            else{
                arr[min]=arr[min]+1;
                arr[max]=arr[max]-1;
                result=result+1;
            }
        }
        System.out.println(result);
    }
    static int min(int []arr, int min)
    {   
        int min_val=arr[min];
        int pos=min;
        for(int i=0; i<=min+1; i++)
        {
            if(min_val>arr[i])
            {
                min_val=arr[i];
                pos=i;
            }
        }
        return pos;
    }
    static int max(int []arr, int max)
    {
        int max_val=arr[max];
        int pos=max;
        for(int i=max-1; i<arr.length; i++)
        {
            if(max_val<arr[i])
            {
                max_val=arr[i];
                pos=i;   
            }
        }
        return pos;
    }
}