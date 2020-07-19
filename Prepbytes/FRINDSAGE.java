package Prepbytes;
import java.io.*;
import java.util.*;
public class FRINDSAGE {
    public static void main(String[] args)throws IOException {
        BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(x.readLine());
        String input[]=(x.readLine()).split(" ");
        int arr[]=new int[N];
        for(int i=0; i<N; i++)
        {
            arr[i]=Integer.parseInt(input[i]);
            //arr[i]=Integer.parseInt(x.readLine());
        }
        Arrays.sort(arr);
        int result=0;
        for(int i1=0; i1<N-1; i1++)
        {
            //System.out.println("xyz");
            for(int i=i1+1; i<N; i++)
            { 
                int B=arr[i1];
                int A=arr[i];
                int A1=(A/2)+7;
                //System.out.println(B+" "+A+" "+A1);
                if(B>A1)
                {
                    if(B<=A)
                    ++result;
                }
            }
        }
        for(int i1=N-1; i1>0; i1--)
        {
            for(int i=i1-1; i>=0; i--)
            {
                int B=arr[i1];
                int A=arr[i];
                int A1=(A/2)+7;
                if(B>A1)
                {
                    if(B<=A)
                    ++result;
                }
            }
        }
        System.out.println(result);
    }
}