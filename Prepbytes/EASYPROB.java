package Prepbytes;
import java.io.*;
import java.util.*;
public class EASYPROB {
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
            Arrays.sort(arr);
            int sum=0;
            int k=size-1;
            for(int i=0; i<size; i+=2)
            {
                sum=sum+arr[k];
                k=k-2;
            }
            System.out.println(sum);
        }
    }
}