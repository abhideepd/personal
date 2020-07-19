package Prepbytes;
import java.io.*;
import java.util.*;
public class EQUAL1 {
    public static void main(String[] args)throws IOException {
        BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
        String input1[]=(x.readLine()).split(" ");
        int N=Integer.parseInt(input1[0]);
        int K=Integer.parseInt(input1[1]);
        String input2[]=(x.readLine()).split(" ");
        
        int arr[]=new int[N];
        int index[]=new int[100000];
        int min=10000000;
        int max=-1;
        for(int i=0; i<N; i++)
        {
            int temp=Integer.parseInt(input2[i]);

            index[temp]=index[temp]+1;

            if(min>temp)
            min=temp;

            if(max<temp)
            max=temp;

            arr[i]=temp;
        }

        int result=0;

        while((max-min)>K)
        {
            if(index[min]==0)
            ++min;

            if(index[max]==0)
            --max;

            index[min]=index[min]-1;
            index[max]=index[max]-1;

            index[min+1]=index[min+1]+1;
            index[max-1]=index[max-1]+1;
            

            ++result;
        }
        System.out.println(--result);        
    }
}