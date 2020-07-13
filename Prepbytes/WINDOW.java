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
            int start=0;
            int min=arr[0];
            int max=arr[size-1];

            for(int i=0; i<size-1; i++)
            {               
                if(arr[i]>arr[i+1])
                {
                    start=i;
                    break;
                }
                if(arr[i]<min)
                min=arr[i]; 
            }
            int end=0;
            for(int i=size-1; i>0; i--)
            {               

                if(arr[i]<arr[i-1])
                {
                    end=i;
                    break;
                }
                if(arr[i]>max)
                max=arr[i];
            }
            int min1=arr[start];
            int max1=arr[start];
            for(int i=start; i<=end; i++)
            {
                if(min1>arr[i])  
                min1=arr[i];

                if(max1<arr[i])
                max1=arr[i];
            }
            System.out.println(start+" "+end);
            System.out.println(min+" "+max+" "+min1+" "+max1);
            if((min1<=min)||(max1>=max))
            {
                start =0;
                end=size-1;
            }
            System.out.println(start+" "+end);
        }
    }
}