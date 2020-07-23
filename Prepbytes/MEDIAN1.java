package Prepbytes;
import java.io.*;
import java.util.*;
public class MEDIAN1 {
    public static void main(String[] args)throws IOException {
        BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
        String input1[]=(x.readLine()).split(" ");
        int size=Integer.parseInt(input1[0]);
        int K=Integer.parseInt(input1[1]);
        String input2[]=(x.readLine()).split(" ");
        int arr[]=new int[size];
        
        for(int i=0; i<size; i++)
        {
            arr[i]=Integer.parseInt(input2[i]);
        }
        Arrays.sort(arr);
        int m=(size-1)/2;
        System.out.println(func(arr, m, size-1, K));
    }
    static int func(int []arr, int m, int end, int K)
    {
        int small=1;
        int big=2000000000;       

        while(small<=big)
        {
            int mid=(small+big)/2;
            if(check(arr, m, end, K, mid))
            small=mid+1;
            else
            big=mid-1;
        }
        return big;
    }
    static boolean check(int []arr, int m, int end, int K, int mid)
    {
        int moves=0;
        for(int i=m; i<=end; i++)
        {
            if(mid-arr[i]>0)
            moves=moves+mid-arr[i];
            if(moves>K)
            return false;
        }
        return true;
    }
}