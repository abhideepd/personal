package Prepbytes;
import java.io.*;
public class BUNST {
    public static void main(String[] args)throws IOException {
        BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
        String input1[]=(x.readLine()).split(" ");
        String input2[]=(x.readLine()).split(" ");
        int N=Integer.parseInt(input1[0]);
        int K=Integer.parseInt(input1[1]);
        int arr[]=new int[N];
        int min=Integer.parseInt(input2[0]);
        int sum=0;
        for(int i=0; i<N; i++)
        {
            arr[i]=Integer.parseInt(input2[i]);
            if(arr[i]<min)
            min=arr[i];
            sum=sum+arr[i];
        }
        if(K>sum)
        System.out.println(0);
        else
        {
            System.out.println(xyz(K, 0, min, arr));
        }
    }
    static int xyz(int K, int sum, int min, int[] arr)
    {
        int l=1;
        int r=1000000000;
        int mid=(l+r)/2;
        while(l<=r)
        {   
            int count=abc(mid, arr);
    
            if(count<K)
            r=mid-1;
            else
            l=mid+1;
            mid=(l+r)/2;
        }
        return mid;
    }
    static int abc(int mid, int []arr)
    {
        int count=0;
        for(int i=0; i<arr.length; i++)
        {
            count=count+(arr[i]/mid);
        }
        return count;
    }
}