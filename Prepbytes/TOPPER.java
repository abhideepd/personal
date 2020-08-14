package Prepbytes;
import java.io.*;
public class TOPPER {
    public static void main(String[] args)throws IOException {
        BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
        int T=Integer.parseInt(x.readLine());
        for(int i1=0; i1<T; i1++)
        {
            String input[]=(x.readLine()).split(" ");
            
            int a=Integer.parseInt(input[0]);
            int b=Integer.parseInt(input[1]);
            int c=Integer.parseInt(input[2]);
            int n=Integer.parseInt(input[3]);
            
            int arr[]=new int[n];
            arr[0]=a;
            arr[1]=b;
            arr[2]=c;
            for(int i=3; i<n; i++)
            {
                arr[i]=arr[i-1]+arr[i-2]+arr[i-3];
            }
            int k=0;
            while(k<n)
            System.out.print(arr[k++]+" ");
            System.out.println();
        }
    }
}