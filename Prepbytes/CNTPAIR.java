package Prepbytes;
import java.io.*;
import java.util.*;
public class CNTPAIR {
    public static void main(String[] args)throws IOException {
        BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
        //input 'N' and 'K'
        String input1[]=(x.readLine()).split(" ");
        int size=Integer.parseInt(input1[0]);
        int K=Integer.parseInt(input1[1]);
        //Input input array
        String input2[]=(x.readLine()).split(" ");
        //convert string array  to integer array
        int arr[]=new int[size];
        int max=-1;
        for(int i=0; i<size; i++)
        {
            arr[i]=Integer.parseInt(input2[i]);
            if(max<arr[i])
            max=arr[i];
        }
  
        Arrays.sort(arr);
        int result=0;

        for(int i=0; i<size; i++)
        {
            int temp1=arr[i];
            int temp2=temp1+K;
            //System.out.println("xxyz: "+temp2);
            if(search(arr, temp2)!=-1)
            ++result;
        }
        System.out.println(result);
    }
    public static int search(int []arr, int s)
    {
        int l=0;
        int r=arr.length-1;
        int m=(l+r)/2;

        while(l<=r)
        {
            //System.out.println("sxxa: "+m);
            if(arr[m]>s)
            {
                r=m-1;
            }
            else if(arr[m]<s)
            {
                l=m+1;
            }
            else if(arr[m]==s)
            return 0;
            m=(l+r)/2;
        }
        return -1;
    }
}