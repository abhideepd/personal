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
            for(int i=0; i<size-1; i++)
            {
                if(arr[i]>arr[i+1])
                {
                    start=i;
                    break;
                }
            }
            int end=0;
            for(int i=size-1; i>0; i--)
            {
                if(arr[i]<arr[i-1])
                {
                    end=i;
                    break;
                }
            }
            int min=arr[start];
            int max=arr[start];
            for(int i=start; i<=end; i++)
            {
                if(min>arr[i])  
                min=arr[i];

                if(max<arr[i])
                max=arr[i];
            }
            //System.out.println(start+" "+end);
            if(start!=0)
            if((min<=arr[0])||(max>=arr[size-1]))
            {
                start=0;
                end=size-1;
            }
            System.out.println(start+" "+end);
        }
    }
}