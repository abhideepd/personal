package Prepbytes;
import java.io.*;
import java.util.*;
public class BOOKS {
    public static void main(String[] args)throws IOException {
        BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
        String input1[]=(x.readLine()).split(" ");
        int N=Integer.parseInt(input1[0]);
        int K=Integer.parseInt(input1[1]);

        String input2[]=(x.readLine()).split(" ");
        int arr[]=new int[N];
        for(int i=0;i<N; i++)
        {
            arr[i]=Integer.parseInt(input2[i]);
        }
        int result=0;
        for(int i=0; i<N; i++)
        {
            if(arr[i]>K)
            break;
            result=result+1;
            arr[i]=K+1;
        }
        for(int i=N-1; i>=0; i--)
        {
            if(arr[i]>K)
            break;
            result=result+1;
        }
        System.out.println(N-result);
    }
}