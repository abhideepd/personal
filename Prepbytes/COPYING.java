package Prepbytes;
import java.io.*;
import java.util.*;

/**
 * COPYING
 */
public class COPYING {
public static void main(String []args)throws IOException
{
BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
int T=Integer.parseInt(x.readLine());
for(int i1=0; i1<T; i1++)
{
    int N=Integer.parseInt(x.readLine());
    String input[]=(x.readLine()).split(" ");
    int arr[]=new int[N];
    for(int i=0; i<N; i++)
    {
        arr[i]=Integer.parseInt(input[i]);
    }
    int array[]=new int[100001];
    for(int i=0; i<N; i++)
    {
        array[arr[i]]=array[arr[i]]+1;
    }
    int a[]=new int[N+1];
    int k=1;
    for(int i=0; i<100001; i++)
    {
        if(array[i]==1)
        a[k++]=i;
        else if(array[i]>1)
        {
            int counter=array[i];
            while(counter-->0)
            a[k++]=i;
        }
    }
    long result=0;
    for(int i=1; i<N+1; i++)
    {
        result=result+Math.abs(a[i]-i);
    }
    System.out.println(result);
}
}    
}