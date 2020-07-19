package Prepbytes;
import java.io.*;
public class ARRMAX {
    public static void main(String[] args)throws IOException {
        BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
        int T=Integer.parseInt(x.readLine());
        for(int i1=0; i1<T; i1++)
        {
            String input1[]=(x.readLine()).split(" ");
            int n=Integer.parseInt(input1[0]);
            int k=Integer.parseInt(input1[1]);
            String input2[]=(x.readLine()).split(" ");
            int arr[]=new int[n];
            int max=-100000;
            for(int i=0; i<n; i++)
            {
                int temp=Integer.parseInt(input2[i]);
                arr[i]=temp;
                if(max<temp)
                max=temp;
            }
            int arr1[]=new int[n];
            for(int i=0; i<n; i++)
            {
                int temp=i-k;
                int temp1=0;
                if((temp>=n)||(temp<0))
                {
                    arr1[i]=arr[i];
                }
                else
                temp1=arr1[temp]+arr[i];//temp1

                if(temp1<=arr[i])
                arr1[i]=arr[i];
                else
                arr1[i]=temp1;
            }
            
            for(int i=0; i<n; i++)
            {
                if(max<arr1[i])
                max=arr1[i];
            }
            //print(arr1);
            System.out.println(max);
        }
    }
    static void print(int []arr)
    {
        for(int i=0; i<arr.length; i++)
        System.out.print(arr[i]+", ");
    }
}