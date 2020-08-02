package Prepbytes;
import java.io.*;
public class ARRMAX1 {
    public static void main(String[] args)throws IOException {
        BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
        int T=Integer.parseInt(x.readLine());
        for(int i1=0; i1<T; i1++)
        {
            String input[]=(x.readLine()).split(" ");
            int size=Integer.parseInt(input[0]);
            int k=Integer.parseInt(input[1]);
            String inp[]=(x.readLine()).split(" ");
            int arr[]=new int[size];
            for(int i=0; i<size; i++)
            {
                arr[i]=Integer.parseInt(inp[i]);
            }
            int nrr[]=new int[size];
            for(int i=0; i<size; i++)
            {
                int temp=i-k;
                if(temp<0)
                nrr[i]=arr[i];
                else{
                    int temp1=nrr[temp];
                    int sum=temp1+arr[i];
                    if(sum>arr[i])
                    {
                        nrr[i]=sum;
                    }
                    else
                    nrr[i]=arr[i];
                }
            }
            int max=Integer.MIN_VALUE;
            for(int i=0; i<size; i++)
            {
                if(max<nrr[i])
                max=nrr[i];
            }
            System.out.println(max);
        }
    }
}