package Prepbytes;
import java.io.*;
public class WINDOW {
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
           int right_index=-1;
           int left_index=-1;
           int max=Integer.MIN_VALUE;
           int min=Integer.MAX_VALUE;
           for(int i=0; i<size; i++)
           {
               if(max<arr[i])
               max=arr[i];

               if(arr[i]<max)
               right_index=i;
           }

           for(int i=size-1; i>=0; i--)
           {
               if(min>arr[i])
               min=arr[i];

               if(arr[i]>min)
               left_index=i;
           }
           System.out.println(left_index+" "+right_index);
        }
    }
}