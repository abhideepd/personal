package Prepbytes;
import java.io.*;
public class MISSAP {
    public static void main(String[] args)throws IOException {
        BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
        int T=Integer.parseInt(x.readLine());
        for(int i1=0; i1<T; i1++)
        {
            int size=Integer.parseInt(x.readLine());
            String input[]=(x.readLine()).split(" ");
            int sum=0;
            int arr[]=new int[size];
            for(int i=0; i<size; i++)
            {
                int temp=Integer.parseInt(input[i]);
                arr[i]=temp;
            }
            sum=(arr[size-1]-arr[0])/size;
            int temp=arr[0];
            for(int i=0; i<size; i++)
            {
                if(arr[i]!=temp)
                {
                    System.out.println(temp);
                    break;
                }
                temp=temp+sum;
            }
        }
    }
}