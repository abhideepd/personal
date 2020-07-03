package Prepbytes;
import java.io.*;
public class PEAKELE {
    public static void main(String[] args)throws IOException {
         BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
         //Input no. of test cases
         int T=Integer.parseInt(x.readLine());
         for(int i1=0; i1<T; i1++)
         {
             //Input size
             int size=Integer.parseInt(x.readLine());
             //Input array
             String input[]=(x.readLine()).split(" ");
             //convert string array to integer
             int arr[]=new int[size];
             for(int i=0; i<size; i++)
             {
                 arr[i]=Integer.parseInt(input[i]);
             }
             int K=-1;

             if(arr[0]>arr[1])
             K=0;
             
             for(int i=1; i<size-1; i++)
             {
                if((arr[i]>arr[i-1])&&(arr[i]>arr[i+1]))
                {
                    K=i;
                }
             }

             if(K==-1)
             if(arr[size-1]>arr[size-2])
             K=size-1;

             System.out.println(K);
         }
    }
}